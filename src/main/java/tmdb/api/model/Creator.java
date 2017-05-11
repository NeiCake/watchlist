package tmdb.api.model;

import com.google.gson.annotations.SerializedName;

public class Creator {

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	@SerializedName("profile_path")
	private String profilePath;

	public Creator() {

	}

	public Creator(String id, String name, String profilePath) {
		super();
		this.id = id;
		this.name = name;
		this.profilePath = profilePath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}

	@Override
	public String toString() {
		return "Creator [id=" + id + ", name=" + name + ", profilePath=" + profilePath + "]";
	}

}
