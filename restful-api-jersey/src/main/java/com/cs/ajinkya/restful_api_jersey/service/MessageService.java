package com.cs.ajinkya.restful_api_jersey.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cs.ajinkya.restful_api_jersey.database.DatabaseClass;
import com.cs.ajinkya.restful_api_jersey.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		long messageId = (messages.size() + 1);
		message.setId(messageId);
		messages.put(messageId, message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
