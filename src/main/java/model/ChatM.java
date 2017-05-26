package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.fouad.jtb.core.enums.ChatType;

@Entity
@Table(name="chats", schema = "telegrambot")
public class ChatM {

	@Id
	@Column (name="id")
	private long id;

	@Column(name="chatType")
	private ChatType type;

	@OneToMany(mappedBy="chat")
	List<MessageM>messages;

	public ChatM(){}

	
	public ChatM(long pId, ChatType pType, List<MessageM> pMessages) {
		
		id = pId;
		type = pType;
		messages = pMessages;
	}


	public List<MessageM> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageM> pMessages) {
		messages = pMessages;
	}

	public void setId(long pId) {
		id = pId;
	}

	public void setType(ChatType pType) {
		type = pType;
	}

	public ChatM(long id, ChatType type)
	{
		this.id = id;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public ChatType getType() {
		return type;
	}




	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatM other = (ChatM) obj;
	
		if (id != other.id)
			return false;
		if (type != other.type)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Chat{" + "id=" + id + ", type=" + type + '\'' +'\''
				+  '\''  + '\'' + '}';
	}
}
