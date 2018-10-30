package com.cs.ajinkya.restful_api_jersey.database;

import java.util.HashMap;
import java.util.Map;

import com.cs.ajinkya.restful_api_jersey.model.Message;
import com.cs.ajinkya.restful_api_jersey.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();

	static {
		Message m1 = new Message(1l, "Hey Aj", "Ajinkya");
		Message m2 = new Message(2l, "Hey Yogya", "Yogesh");
		messages.put(1l, m1);
		messages.put(m2.getId(), m2);

		Profile p1 = new Profile(1l, "ajinkya", "Ajinkya", "Kulkarni");
		Profile p2 = new Profile(2l, "yogesh", "Yogesh", "Mhase");
		profiles.put(p1.getProfileName(), p1);
		profiles.put(p2.getProfileName(), p2);

	}

	public static Map<Long, Message> getMessages() {

		return messages;
	}

	public static Map<String, Profile> getProfiles() {

		return profiles;

	}

}
