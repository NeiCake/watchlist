

import java.io.IOException;

import base.UpdateHandlerImpl;
import io.fouad.jtb.core.JTelegramBot;
import io.fouad.jtb.core.exceptions.NegativeResponseException;
import tmdb.api.model.ApiKeys;

public class Main {

	private static final String BOT_NAME = "TrulyShortGiraffeBot";

	public static void main(String[] args) {
		JTelegramBot bot = new JTelegramBot(BOT_NAME, ApiKeys.getTelegramApiKey(), new UpdateHandlerImpl());

	
		try {
			System.out.println(bot.getMe());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		bot.start();
		System.out.println("STARTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEED");
	}

}
