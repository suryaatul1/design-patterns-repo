package com.controller;

import com.model.User;

public class UserController {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("harry_potter", "potter@123")
				.setContact("3534534545")
				.setEmail("harry@gmail.com")
				.build();
		
		User user2 = new User.UserBuilder("harry_potter", "potter@123")
				.setContact("3534534545")
				.build();
		
		User user3 = new User.UserBuilder("harry_potter", "potter@123")
				.setEmail("harry@gmail.com")
				.build();
		
		User user4 = new User.UserBuilder("harry_potter", "potter@123")
				 .build();
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
	}
}
