package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class UserM {
	
	/**
	 * Unique identifier for this user or bot.
	 */
	@Id
	private int id;
	
	/**
	 * User‘s or bot’s first name.
	 */
	@Column(name="firstName")
	private String firstName;
	
	/**
	 * Optional. User‘s or bot’s last name.
	 */
	@Transient
	private String lastName;
	
	/**
	 * Optional. User‘s or bot’s username.
	 */
	@Column(name="username")
	private String username;
	
	public UserM(){}
	
	public UserM(int id, String firstName, String lastName, String username)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
	}
	
	public int getId(){return id;}
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public String getUsername(){return username;}
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		UserM user = (UserM) o;
		
		if(id != user.id) return false;
		if(firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
		if(lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
		return username != null ? username.equals(user.username) : user.username == null;
		
	}
	
	@Override
	public int hashCode()
	{
		int result = id;
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (username != null ? username.hashCode() : 0);
		return result;
	}
	
	@Override
	public String toString()
	{
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", username='" + username + '\'' +
				'}';
	}

}
