package base;

import java.io.IOException;

import io.fouad.jtb.core.TelegramBotApi;
import io.fouad.jtb.core.UpdateHandler;
import io.fouad.jtb.core.beans.CallbackQuery;
import io.fouad.jtb.core.beans.ChosenInlineResult;
import io.fouad.jtb.core.beans.InlineKeyboardButton;
import io.fouad.jtb.core.beans.InlineKeyboardMarkup;
import io.fouad.jtb.core.beans.InlineQuery;
import io.fouad.jtb.core.beans.Message;
import io.fouad.jtb.core.beans.ReplyMarkup;
import io.fouad.jtb.core.builders.ApiBuilder;
import io.fouad.jtb.core.builders.ReplyMarkupBuilder;
import io.fouad.jtb.core.enums.ParseMode;
import io.fouad.jtb.core.exceptions.NegativeResponseException;

public class UpdateHandlerImpl implements UpdateHandler{

	
	public void onCallbackQueryReceived(TelegramBotApi telegramBotApi, int id, CallbackQuery callbackQuery) {
	
		System.out.println("callbackquery ID: "+callbackQuery.getId());
		System.out.println("callbackquery msg: "+callbackQuery.getMessage());
		System.out.println("full callbackquery msg: "+callbackQuery);
		try {
			System.out.println("modifying message for CALLBACK "+ApiBuilder.api(telegramBotApi)
				.editMessage()
				.forMessageId(callbackQuery.getMessage().getMessageId())
				.fromChatId(callbackQuery.getMessage().getChat().getId())
				.withNewInlineKeyboard(null)
				.execute());
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NegativeResponseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
	}

	public void onMessageReceived(TelegramBotApi telegramBotApi, int id, Message message)
	{

    	System.out.println("received message: "+message);
		if("12345678".contains(message.getText())){
			
			try {
				InlineKeyboardButton[][] arrayOfButtons=new InlineKeyboardButton[Integer.parseInt(message.getText())][1];
				for(int i=0;i<Integer.parseInt(message.getText());i++){
					arrayOfButtons[i][0]=new InlineKeyboardButton(String.valueOf(i+1), null, String.valueOf(i+1), null);
					}


				
				ReplyMarkup replyMarkup=ReplyMarkupBuilder
	    				.attachInlineKeyboard(arrayOfButtons)
	    				.toReplyMarkup();
				
				System.out.println("sent message "+ApiBuilder.api(telegramBotApi)
					.sendMessage("testing")
					.toChatId(message.getChat().getId())
					.applyReplyMarkup(replyMarkup)
					.execute());
				
				
			} catch (IOException e) {} catch (NegativeResponseException e) {}
			
		}
		
		
		
		
		
	    try
	    {
	    	if (message.getText().equals("test")){
	
	    		InlineKeyboardButton[][] buttons= new InlineKeyboardButton[][]{{new InlineKeyboardButton("text1",null, "call1", null)}};
	    	  
	    		ReplyMarkup replyMarkup=ReplyMarkupBuilder
	    				.attachInlineKeyboard(buttons)
	    				.toReplyMarkup();
	    		System.out.println("sent message: "+ApiBuilder.api(telegramBotApi).sendMessage("reply to test")
	    			.toChatId(message.getChat().getId())
	    			.applyReplyMarkup(replyMarkup)
	    			.execute());
	    	}
	    
	    
	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
	    catch(NegativeResponseException e)
	    {
	        e.printStackTrace();
	    }
	}
	
	public void onEditedMessageReceived(TelegramBotApi telegramBotApi, int id, Message message) {
		System.out.println("oneditedmessagereceived"); 
		try
		    {
		        ApiBuilder.api(telegramBotApi)
		                  .sendMessage("*onEditedMessageReceived*")
		                  .toChatId(message.getChat().getId())
		                  .asSilentMessage()
		                  .parseMessageAs(ParseMode.MARKDOWN)
		                  .execute();
		    }
		    catch(IOException e)
		    {
		        e.printStackTrace();
		    }
		    catch(NegativeResponseException e)
		    {
		        e.printStackTrace();
		    }
	}
	
	
	public void onChosenInlineResultReceived(TelegramBotApi telegramBotApi, int id, ChosenInlineResult chosenInlineResult) {
		// TODO Auto-generated method stub
	
		System.out.println("onchoseninlineresultreceived");
		 try
		    {
		        ApiBuilder.api(telegramBotApi)
		                  .sendMessage("onChosenInlineResultReceived")
		                  .toChatId(id)
		                  .execute();
		    }
		    catch(IOException e)
		    {
		        e.printStackTrace();
		    }
		    catch(NegativeResponseException e)
		    {
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
		 try
		    {
		        ApiBuilder.api(telegramBotApi)
		                  .sendMessage("*onEditedMessageReceived*")
		                  .toChatId(id)
		                  .execute();
		    }
		    catch(IOException e)
		    {
		        e.printStackTrace();
		    }
		    catch(NegativeResponseException e)
		    {
		        e.printStackTrace();
		    }
		
	}




}
