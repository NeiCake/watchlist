//package model;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import tmdb.api.model.TvShowWithDetails;
//
//@Entity
//@Table(name = "users", schema = "telegrambot")
//public class UserM {
//
//	@Id
//	private int id;
//	
//	@JoinTable(name="showsWatched")
//	@ManyToMany
//	private List<TvShowWithDetails> watchedShows;
//
//	public List<TvShowWithDetails> getWatchedShowList() {
//		return watchedShows;
//	}
//
//	public void setWatchedShowList(List<TvShowWithDetails> list) {
//		watchedShows = list;
//	}
//
//	@Column(name = "firstName")
//	private String firstName;
//
//	public UserM() {
//	}
//
//	public UserM(int id, String firstName) {
//		this.id = id;
//		this.firstName = firstName;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//
//		UserM user = (UserM) o;
//
//		if (id != user.id)
//			return false;
//		return firstName != null ? firstName.equals(user.firstName) : user.firstName == null;
//
//	}
//
//	@Override
//	public int hashCode() {
//		int result = id;
//		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
//		return result;
//	}
//
//	@Override
//	public String toString() {
//		return "User{" + "id=" + id + ", firstName='" + firstName + '\'' + '}';
//	}
//
//}
