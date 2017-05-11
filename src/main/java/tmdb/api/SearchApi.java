package tmdb.api;

import tmdb.api.model.ResultWithListOfShows;
import tmdb.api.model.TvShow;
import tmdb.api.model.TvShowWithDetails;

public interface SearchApi {
	public ResultWithListOfShows searchSeriesByStringQuery(String seriesName);
	public TvShowWithDetails getShowInfo(int id);
	

}
