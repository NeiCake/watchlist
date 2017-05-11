package tmdb.api.model;

import com.google.gson.annotations.SerializedName;

public class Season {

	@SerializedName("air_date")
	private String airDate;

	@SerializedName("episode_count")
	private String episodeCount;

	@SerializedName("id")
	private String id;

	@SerializedName("poster_path")
	private String posterPath;

	@SerializedName("season_number")
	private String seasonNumber;

	public Season() {

	}

	public Season(String airDate, String episodeCount, String id, String posterPath, String seasonNumber) {
		super();
		this.airDate = airDate;
		this.episodeCount = episodeCount;
		this.id = id;
		this.posterPath = posterPath;
		this.seasonNumber = seasonNumber;
	}

	public String getAirDate() {
		return airDate;
	}

	public void setAirDate(String airDate) {
		this.airDate = airDate;
	}

	public String getEpisodeCount() {
		return episodeCount;
	}

	public void setEpisodeCount(String episodeCount) {
		this.episodeCount = episodeCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public String getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(String seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	@Override
	public String toString() {
		return "Season [airDate=" + airDate + ", episodeCount=" + episodeCount + ", id=" + id + ", posterPath="
				+ posterPath + ", seasonNumber=" + seasonNumber + "]";
	}

}
