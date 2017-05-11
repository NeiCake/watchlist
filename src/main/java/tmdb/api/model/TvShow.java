package tmdb.api.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TvShow {

	//poster_path: "/phJnv5R3Ch20cFTqsMRVLyWE84U.jpg",
	@SerializedName("poster_path")
	String posterPath;
	//popularity: 8.831072,
	@SerializedName("popularity")
	String popularity;
	//id: 1422,
	@SerializedName("id")
	int id;
	//backdrop_path: "/99EyDJ3WxCemydwl0fhQye7gM6l.jpg",
	@SerializedName("backdrop_path")
	String backdropPath;
	//vote_average: 6.29,
	@SerializedName("vote_average")
	String voteAverage;
	@SerializedName("overview")
	String overview;
	//first_air_date: "2009-09-30",
	@SerializedName("first_air_date")
	String airDate;
	//origin_country: [	"US"	],
	@SerializedName("origin_country")
	List<String> countryOfOrigin;
	//genre_ids: [	35	],
	@SerializedName("genre_ids")
	List<Integer> genreIds;
	//original_language: "en",
	@SerializedName("original_language")
	String lang;
	//vote_count: 78,
	@SerializedName("vote_count")
	int voteCount;
	//name: "The Middle",
	@SerializedName("name")
	String name;
	//original_name: "The Middle"
	@SerializedName("original_name")
	String originalName;
	public TvShow(String pPosterPath, String pPopularity, int pId, String pBackdropPath, String pVoteAverage,
			String pOverview, String pAirDate, List<String> pCountryOfOrigin, List<Integer> pGenreIds, String pLang,
			int pVoteCount, String pName, String pOriginalName) {
		super();
		posterPath = pPosterPath;
		popularity = pPopularity;
		id = pId;
		backdropPath = pBackdropPath;
		voteAverage = pVoteAverage;
		overview = pOverview;
		airDate = pAirDate;
		countryOfOrigin = pCountryOfOrigin;
		genreIds = pGenreIds;
		lang = pLang;
		voteCount = pVoteCount;
		name = pName;
		originalName = pOriginalName;
	}
	@Override
	public String toString() {
		return "TvShow [posterPath=" + posterPath + ", popularity=" + popularity + ", id=" + id + ", backdropPath="
				+ backdropPath + ", voteAverage=" + voteAverage + ", overview=" + overview + ", airDate=" + airDate
				+ ", countryOfOrigin=" + countryOfOrigin + ", genreIds=" + genreIds + ", lang=" + lang + ", voteCount="
				+ voteCount + ", name=" + name + ", originalName=" + originalName + "]";
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String pPosterPath) {
		posterPath = pPosterPath;
	}
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String pPopularity) {
		popularity = pPopularity;
	}
	public int getId() {
		return id;
	}
	public void setId(int pId) {
		id = pId;
	}
	public String getBackdropPath() {
		return backdropPath;
	}
	public void setBackdropPath(String pBackdropPath) {
		backdropPath = pBackdropPath;
	}
	public String getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(String pVoteAverage) {
		voteAverage = pVoteAverage;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String pOverview) {
		overview = pOverview;
	}
	public String getAirDate() {
		return airDate;
	}
	public void setAirDate(String pAirDate) {
		airDate = pAirDate;
	}
	public List<String> getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(List<String> pCountryOfOrigin) {
		countryOfOrigin = pCountryOfOrigin;
	}
	public List<Integer> getGenreIds() {
		return genreIds;
	}
	public void setGenreIds(List<Integer> pGenreIds) {
		genreIds = pGenreIds;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String pLang) {
		lang = pLang;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int pVoteCount) {
		voteCount = pVoteCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String pName) {
		name = pName;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String pOriginalName) {
		originalName = pOriginalName;
	}	
	
	
	

}
