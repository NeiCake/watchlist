package tmdb.api.model;

import com.google.gson.annotations.SerializedName;

public class Network {

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	public Network() {

	}

	public Network(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Network [id=" + id + ", name=" + name + "]";
	}

}
