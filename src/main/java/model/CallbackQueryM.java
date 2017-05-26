//package model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="callbacks", schema = "telegrambot")
//public class CallbackQueryM {
//	@Id
//	@Column (name="id")
//	private String id;
//	@ManyToOne
//	@JoinColumn(name="userFrom")
//	private UserM from;
//	@ManyToOne
//	@JoinColumn(name="message")
//	private MessageM message;
//	@Column(name = "data")
//	private String data;
//
//	public CallbackQueryM() {
//	}
//
//	public CallbackQueryM(String id, UserM from, MessageM message, String data) {
//		this.id = id;
//		this.from = from;
//		this.message = message;
//
//		this.data = data;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public UserM getFrom() {
//		return from;
//	}
//
//	public MessageM getMessage() {
//		return message;
//	}
//
//	public String getData() {
//		return data;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((data == null) ? 0 : data.hashCode());
//		result = prime * result + ((from == null) ? 0 : from.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((message == null) ? 0 : message.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CallbackQueryM other = (CallbackQueryM) obj;
//		if (data == null) {
//			if (other.data != null)
//				return false;
//		} else if (!data.equals(other.data))
//			return false;
//		if (from == null) {
//			if (other.from != null)
//				return false;
//		} else if (!from.equals(other.from))
//			return false;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (message == null) {
//			if (other.message != null)
//				return false;
//		} else if (!message.equals(other.message))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "CallbackQueryM [id=" + id + ", from=" + from + ", message=" + message + ", data=" + data + "]";
//	}
//
//	public void setId(String pId) {
//		id = pId;
//	}
//
//	public void setFrom(UserM pFrom) {
//		from = pFrom;
//	}
//
//	public void setMessage(MessageM pMessage) {
//		message = pMessage;
//	}
//
//	public void setData(String pData) {
//		data = pData;
//	}
//
//}
