package tmdb.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import tmdb.api.model.ApiKeys;
import tmdb.api.model.ResultWithListOfShows;
import tmdb.api.model.TvShowWithDetails;

public class SearchApiImpl implements SearchApi {

	private String API_KEY;
	private String query;

	public static void main(String[] args) {

		
		SearchApi api = new SearchApiImpl();
	//	System.out.println(api.searchSeriesByStringQuery("hello"));
	//	System.out.println(api.getShowInfo(1422));

	}

	public ResultWithListOfShows searchSeriesByStringQuery(String seriesName) {

		API_KEY=ApiKeys.getMovieDBKey();
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		String json = HttpClient.connectAndGetJsonString(
				"https://api.themoviedb.org/3/search/tv?page=1&language=en-US&api_key=" + API_KEY + "&query=" + seriesName);
		ResultWithListOfShows result = gson.fromJson(json, ResultWithListOfShows.class);

		return result;

	}

	public TvShowWithDetails getShowInfo(int id) {

		API_KEY=ApiKeys.getMovieDBKey();
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		String json1 = HttpClient
				.connectAndGetJsonString("https://api.themoviedb.org/3/tv/" + id + "?api_key=" + API_KEY);

		TvShowWithDetails tvShow = gson.fromJson(json1, TvShowWithDetails.class);
		return tvShow;

	}

}
