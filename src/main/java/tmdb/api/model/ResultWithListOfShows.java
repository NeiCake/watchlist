package tmdb.api.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResultWithListOfShows {
	@SerializedName("page")
	int page;
	@SerializedName("results")
	List<TvShow> shows;
	@SerializedName("total_results")
	int totalResults;
	@SerializedName("total_pages")
	int totalPages;
	public int getPage() {
		return page;
	}
	public void setPage(int pPage) {
		page = pPage;
	}
	public List<TvShow> getShows() {
		return shows;
	}
	public void setShows(List<TvShow> pShows) {
		shows = pShows;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int pTotalResults) {
		totalResults = pTotalResults;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int pTotalPages) {
		totalPages = pTotalPages;
	}
	public ResultWithListOfShows(int pPage, List<TvShow> pShows, int pTotalResults, int pTotalPages) {
		super();
		page = pPage;
		shows = pShows;
		totalResults = pTotalResults;
		totalPages = pTotalPages;
	}
	@Override
	public String toString() {
		return "ResultWithListOfShows [page=" + page + ", shows=" + shows + ", totalResults=" + totalResults
				+ ", totalPages=" + totalPages + "]";
	}
	
	
}
