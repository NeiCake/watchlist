package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "messages", schema = "telegrambot")
public class MessageM {

	public MessageM(int pMessageId, int pDate,  String pText,ChatM pChat) {
		messageId = pMessageId;

		date = pDate;
		chat = pChat;
		text = pText;
	}

	@Column(name = "id")
	@Id
	private int messageId;

	@Column(name = "date")
	private int date;

	@JoinColumn(name = "chat" )
	@ManyToOne
	private ChatM chat;

	@Column(name = "text")
	private String text;

	public void setMessageId(int pMessageId) {
		messageId = pMessageId;
	}

	public void setDate(int pDate) {
		date = pDate;
	}

	public void setChat(ChatM pChat) {
		chat = pChat;
	}

	public void setText(String pText) {
		text = pText;
	}

	public MessageM() {
	}

	public int getMessageId() {
		return messageId;
	}

	public int getDate() {
		return date;
	}

	public ChatM getChat() {
		return chat;
	}

	public String getText() {
		return text;
	}

	public String toString() {
		return "MessageM [messageId=" + messageId + ", date=" + date + ", chat=" + chat+  ", text=" + text + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chat == null) ? 0 : chat.hashCode());
		result = prime * result + date;
		result = prime * result + messageId;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageM other = (MessageM) obj;
		if (chat == null) {
			if (other.chat != null)
				return false;
		} else if (!chat.equals(other.chat))
			return false;
		if (date != other.date)
			return false;

		if (messageId != other.messageId)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

}
