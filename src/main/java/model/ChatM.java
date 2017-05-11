package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.fouad.jtb.core.enums.ChatType;

@Entity
@Table(name="chats")
public class ChatM {

	/**
	 * Unique identifier for this chat. This number may be greater than 32 bits
	 * and some programming languages may have difficulty/silent defects in
	 * interpreting it. But it smaller than 52 bits, so a signed 64 bit integer
	 * or double-precision float type are safe for storing this identifier.
	 */
	@Id
	private long id;

	/**
	 * Type of chat
	 */
	@Column(name="chatType")
	private ChatType type;

	/**
	 * Optional. Title, for channels and group chats.
	 */
	@Column(name="chatTitle")
	private String title;

	/**
	 * Optional. Username, for private chats, supergroups and channels if
	 * available.
	 */
	private String username;

	/**
	 * Optional. First name of the other party in a private chat.
	 */
	private String firstName;

	/**
	 * Optional. Last name of the other party in a private chat.
	 */
	private String lastName;

	public ChatM(){}

	public ChatM(long id, ChatType type, String title, String username, String firstName, String lastName)
	{
		this.id = id;
		this.type = type;
		this.title = title;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public ChatType getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ChatM chat = (ChatM) o;

		if (id != chat.id)
			return false;
		if (type != chat.type)
			return false;
		if (title != null ? !title.equals(chat.title) : chat.title != null)
			return false;
		if (username != null ? !username.equals(chat.username) : chat.username != null)
			return false;
		if (firstName != null ? !firstName.equals(chat.firstName) : chat.firstName != null)
			return false;
		return lastName != null ? lastName.equals(chat.lastName) : chat.lastName == null;

	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (username != null ? username.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Chat{" + "id=" + id + ", type=" + type + ", title='" + title + '\'' + ", username='" + username + '\''
				+ ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}
}
