package tmdb.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.SerializedName;


//@Entity
//@Table(name = "shows", schema = "telegrambot")
public class TvShowWithDetails {

	// 20170511173201
	// https://api.themoviedb.org/3/tv/1422?api_key=c946330fbfdd3010a74137465576f3a2

	//@Transient
	@SerializedName("backdrop_path")
	private String backdropPath;
	//@Transient
	@SerializedName("created_by")
	private List<Creator> createdBy;
	//@Transient
	@SerializedName("episode_run_time")
	private List<String> episodeRunTime;
	//@Transient
	@SerializedName("first_air_date")
	private String firstAirDate;
	//@Transient
	@SerializedName("genres")
	private List<Genre> genres;
	//@Transient
	@SerializedName("homepage")
	private String homepage;

	@SerializedName("id")
	//@Id
	private String id;
//	@Transient
	@SerializedName("in_production")
	private String inProduction;
	//@Transient
	@SerializedName("languages")
	private List<String> languages;
	//@Transient
	@SerializedName("last_air_date")
	private String lastAirDate;
	//@Transient
	@SerializedName("name")
	private String name;
	//@Transient
	@SerializedName("networks")
	private List<Network> networks;

	//@Column(name="numberOfEpisodes")
	@SerializedName("number_of_episodes")
	private String numberOfEpisodes;

	//@Column(name="numberOfSeasons")
	@SerializedName("number_of_seasons")
	private String numberOfSeasons;
	//@Transient
	@SerializedName("origin_country")
	private List<String> originCountry;
	//@Transient
	@SerializedName("original_language")
	private String originalLanguage;
	//@Transient
	@SerializedName("original_name")
	private String originalName;
	//@Transient
	@SerializedName("overview")
	private String overview;
	//@Transient
	@SerializedName("popularity")
	private String popularity;
	//@Transient
	@SerializedName("poster_path")
	private String posterPath;
	//@Transient
	@SerializedName("production_companies")
	private List<String> productionCompanies;
	//@Transient
	@SerializedName("seasons")
	private List<Season> seasons;
	//@Column(name = "status")
	@SerializedName("status")
	private String status;
	//@Transient
	@SerializedName("type")
	private String type;
	//@Transient
	@SerializedName("vote_average")
	private String voteAverage;
	//@Transient
	@SerializedName("vote_count")
	private String voteCount;


//	@ManyToMany(mappedBy="watchedShows")
//	private List <UserM> usersWatching;
//	public List<UserM> getUsersWatching() {
//		return usersWatching;
//	}
//
//	public void setUsersWatching(List<UserM> pUsersWatching) {
//		usersWatching = pUsersWatching;
//	}

	public TvShowWithDetails() {

	}

	public TvShowWithDetails(String backdropPath, List<Creator> createdBy, List<String> episodeRunTime,
			String firstAirDate, List<Genre> genres, String homepage, String id, String inProduction,
			List<String> languages, String lastAirDate, String name, List<Network> networks, String numberOfEpisodes,
			String numberOfSeasons, List<String> originCountry, String originalLanguage, String originalName,
			String overview, String popularity, String posterPath, List<String> productionCompanies,
			List<Season> seasons, String status, String type, String voteAverage, String voteCount) {
		super();
		this.backdropPath = backdropPath;
		this.createdBy = createdBy;
		this.episodeRunTime = episodeRunTime;
		this.firstAirDate = firstAirDate;
		this.genres = genres;
		this.homepage = homepage;
		this.id = id;
		this.inProduction = inProduction;
		this.languages = languages;
		this.lastAirDate = lastAirDate;
		this.name = name;
		this.networks = networks;
		this.numberOfEpisodes = numberOfEpisodes;
		this.numberOfSeasons = numberOfSeasons;
		this.originCountry = originCountry;
		this.originalLanguage = originalLanguage;
		this.originalName = originalName;
		this.overview = overview;
		this.popularity = popularity;
		this.posterPath = posterPath;
		this.productionCompanies = productionCompanies;
		this.seasons = seasons;
		this.status = status;
		this.type = type;
		this.voteAverage = voteAverage;
		this.voteCount = voteCount;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}

	public List<Creator> getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(List<Creator> createdBy) {
		this.createdBy = createdBy;
	}

	public List<String> getEpisodeRunTime() {
		return episodeRunTime;
	}

	public void setEpisodeRunTime(List<String> episodeRunTime) {
		this.episodeRunTime = episodeRunTime;
	}

	public String getFirstAirDate() {
		return firstAirDate;
	}

	public void setFirstAirDate(String firstAirDate) {
		this.firstAirDate = firstAirDate;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInProduction() {
		return inProduction;
	}

	public void setInProduction(String inProduction) {
		this.inProduction = inProduction;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public String getLastAirDate() {
		return lastAirDate;
	}

	public void setLastAirDate(String lastAirDate) {
		this.lastAirDate = lastAirDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Network> getNetworks() {
		return networks;
	}

	public void setNetworks(List<Network> networks) {
		this.networks = networks;
	}

	public String getNumberOfEpisodes() {
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(String numberOfEpisodes) {
		this.numberOfEpisodes = numberOfEpisodes;
	}

	public String getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public void setNumberOfSeasons(String numberOfSeasons) {
		this.numberOfSeasons = numberOfSeasons;
	}

	public List<String> getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(List<String> originCountry) {
		this.originCountry = originCountry;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public List<String> getProductionCompanies() {
		return productionCompanies;
	}

	public void setProductionCompanies(List<String> productionCompanies) {
		this.productionCompanies = productionCompanies;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(String voteAverage) {
		this.voteAverage = voteAverage;
	}

	public String getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(String voteCount) {
		this.voteCount = voteCount;
	}

	@Override
	public String toString() {
		return "Bean [backdropPath=" + backdropPath + ", createdBy=" + createdBy + ", episodeRunTime=" + episodeRunTime
				+ ", firstAirDate=" + firstAirDate + ", genres=" + genres + ", homepage=" + homepage + ", id=" + id
				+ ", inProduction=" + inProduction + ", languages=" + languages + ", lastAirDate=" + lastAirDate
				+ ", name=" + name + ", networks=" + networks + ", numberOfEpisodes=" + numberOfEpisodes
				+ ", numberOfSeasons=" + numberOfSeasons + ", originCountry=" + originCountry + ", originalLanguage="
				+ originalLanguage + ", originalName=" + originalName + ", overview=" + overview + ", popularity="
				+ popularity + ", posterPath=" + posterPath + ", productionCompanies=" + productionCompanies
				+ ", seasons=" + seasons + ", status=" + status + ", type=" + type + ", voteAverage=" + voteAverage
				+ ", voteCount=" + voteCount + "]";
	}

}
