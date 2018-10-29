package com.cs.ajinkya.restful_api_jersey.service;

import java.util.ArrayList;
import java.util.List;

import com.cs.ajinkya.restful_api_jersey.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hey dude!", "Ajinkya");
		Message m2 = new Message(2L, "Hey Yogesh", "Yogesh");
	
		List<Message> messages = new ArrayList<Message>();
		messages.add(m1);
		messages.add(m2);
		return messages;
		
	}

}
