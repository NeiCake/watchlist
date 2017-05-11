package tmdb.api.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApiKeys {

	public static String getMovieDBKey(){
		String key=null;
		Scanner scanner=null;
		try {
			scanner = new Scanner(new File("TMDBkey.txt"));
			key = scanner.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close(); // Put this call in a finally block
		}
		
		return key;
		
	}
	
	public static String getTelegramApiKey(){
		String key=null;
		Scanner scanner=null;
		try {
			scanner = new Scanner(new File("Telegramkey.txt"));
			key = scanner.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close(); // Put this call in a finally block
		}
		
		return key;
	}
}
