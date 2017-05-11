package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.fouad.jtb.core.beans.Audio;
import io.fouad.jtb.core.beans.Chat;
import io.fouad.jtb.core.beans.Contact;
import io.fouad.jtb.core.beans.Document;
import io.fouad.jtb.core.beans.Location;
import io.fouad.jtb.core.beans.Message;
import io.fouad.jtb.core.beans.MessageEntity;
import io.fouad.jtb.core.beans.PhotoSize;
import io.fouad.jtb.core.beans.Sticker;
import io.fouad.jtb.core.beans.User;
import io.fouad.jtb.core.beans.Venue;
import io.fouad.jtb.core.beans.Video;
import io.fouad.jtb.core.beans.Voice;

@Entity
@Table(name="messages")
public class MessageM {

	@Column(name="id")
	private int messageId;
	
	/**
	 * Optional. Sender, can be empty for messages sent to channels.
	 */
	@Column(name="fromUser")
	private User from;
	
	/**
	 * Date the message was sent in Unix time.
	 */

	@Column(name="date")
	private int date;
	
	/**
	 * Conversation the message belongs to.
	 */
	
	@Column(name="chat")
	private Chat chat;
	
	/**
	 * Optional. For text messages, the actual UTF-8 text of the message,
	 * 0-4096 characters.
	 */

	@Column(name="text")
	private String text;
	
	
	public MessageM(){}
	
	public MessageM(int messageId, User from, int date, Chat chat, User forwardFrom, Chat forwardFromChat,
	               Integer forwardDate, Message replyToMessage, int editDate, String text, MessageEntity[] entities,
	               Audio audio, Document document, PhotoSize[] photo, Sticker sticker, Video video, Voice voice,
	               String caption, Contact contact, Location location, Venue venue, User newChatMember,
	               User leftChatMember, String newChatTitle, PhotoSize[] newChatPhoto, Boolean deleteChatPhoto,
	               Boolean groupChatCreated, Boolean superGroupChatCreated, Boolean channelChatCreated,
	               Long migrateToChatId, Long migrateFromChatId, Message pinnedMessage)
	{
		this.messageId = messageId;
		this.from = from;
		this.date = date;
		this.chat = chat;
		this.text = text;
	}
	
	public int getMessageId(){return messageId;}
	public User getFrom(){return from;}
	public int getDate(){return date;}
	public Chat getChat(){return chat;}
	public String getText(){return text;}

	@Override
	public String toString() {
		return "MessageM [messageId=" + messageId + ", from=" + from + ", date=" + date + ", chat=" + chat + ", text="
				+ text + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chat == null) ? 0 : chat.hashCode());
		result = prime * result + date;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
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
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
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
