package base;

import java.io.IOException;

import dao.ChatDao;
import dao.MessageDao;
import io.fouad.jtb.core.TelegramBotApi;
import io.fouad.jtb.core.UpdateHandler;
import io.fouad.jtb.core.beans.CallbackQuery;
import io.fouad.jtb.core.beans.ChosenInlineResult;
import io.fouad.jtb.core.beans.InlineKeyboardButton;
import io.fouad.jtb.core.beans.InlineQuery;
import io.fouad.jtb.core.beans.Message;
import io.fouad.jtb.core.beans.User;
import io.fouad.jtb.core.builders.ApiBuilder;
import io.fouad.jtb.core.builders.ReplyMarkupBuilder;
import io.fouad.jtb.core.enums.ParseMode;
import io.fouad.jtb.core.exceptions.NegativeResponseException;
import model.ChatM;
import model.MessageM;
import tmdb.api.SearchApi;
import tmdb.api.SearchApiImpl;
import tmdb.api.model.ResultWithListOfShows;

public class UpdateHandlerImpl implements UpdateHandler {

	SearchApi searchApi;

	public void onCallbackQueryReceived(TelegramBotApi telegramBotApi, int id, CallbackQuery callbackQuery) {

		System.out.println("callbackquery ID: " + callbackQuery.getId());
		System.out.println("callbackquery msg: " + callbackQuery.getMessage());
		System.out.println("full callbackquery msg: " + callbackQuery);
		try {
			System.out.println("modifying message for CALLBACK " + ApiBuilder.api(telegramBotApi).editMessage()
					.forMessageId(callbackQuery.getMessage().getMessageId())
					.fromChatId(callbackQuery.getMessage().getChat().getId()).withNewInlineKeyboard(null).execute());

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NegativeResponseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void onMessageReceived(TelegramBotApi telegramBotApi, int id, Message message) {

		System.out.println("received message: " + message);
		
			try {
				MessageDao mdao = new MessageDao();
				ChatDao cdao = new ChatDao();
				ChatM chatM = new ChatM(message.getChat().getId(), message.getChat().getType());
				MessageM messageM = new MessageM(message.getMessageId(), message.getDate(), message.getText(), chatM);
				cdao.saveChat(chatM);
				mdao.saveMessage(messageM);

				searchApi = new SearchApiImpl();
				ResultWithListOfShows result = searchApi.searchSeriesByStringQuery(message.getText());
				String reply = "";

				InlineKeyboardButton[][] arrayOfButtons = new InlineKeyboardButton[result.getShows().size()][1];

				if(result.getShows().isEmpty()){
					ApiBuilder.api(telegramBotApi).sendMessage("No results were found and also you suck.").toChatId(message.getChat().getId())
					.execute();
				}
				else{
					for (int i = 0; i < result.getShows().size(); i++) {
						arrayOfButtons[i][0] = new InlineKeyboardButton(result.getShows().get(i).getName(), null,
								String.valueOf(result.getShows().get(i).getId()), null);
					}

					
					ApiBuilder.api(telegramBotApi).sendMessage("Results for the search:\n").toChatId(message.getChat().getId())
							.applyReplyMarkup(ReplyMarkupBuilder.attachInlineKeyboard(arrayOfButtons).toReplyMarkup())
							.execute();
					
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			

			
	
	}

	public void onEditedMessageReceived(TelegramBotApi telegramBotApi, int id, Message message) {
		System.out.println("oneditedmessagereceived");
		try {
			ApiBuilder.api(telegramBotApi).sendMessage("*onEditedMessageReceived*").toChatId(message.getChat().getId())
					.asSilentMessage().parseMessageAs(ParseMode.MARKDOWN).execute();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NegativeResponseException e) {
			e.printStackTrace();
		}
	}

	public void onChosenInlineResultReceived(TelegramBotApi telegramBotApi, int id,
			ChosenInlineResult chosenInlineResult) {
		// TODO Auto-generated method stub

		System.out.println("onchoseninlineresultreceived");
		try {
			ApiBuilder.api(telegramBotApi).sendMessage("onChosenInlineResultReceived").toChatId(id).execute();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NegativeResponseException e) {
			e.printStackTrace();
		}
	}

	public void onGetUpdatesFailure(Exception e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	public void onInlineQueryReceived(TelegramBotApi telegramBotApi, int id, InlineQuery inlineQuery) {
		// TODO Auto-generated method stub
		System.out.println("oninlinequeryrec");
		try {
			ApiBuilder.api(telegramBotApi).sendMessage("*onEditedMessageReceived*").toChatId(id).execute();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NegativeResponseException e) {
			e.printStackTrace();
		}

	}

}
