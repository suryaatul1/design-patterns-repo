package com.model;
//Rakesh 
public class User {
	// mandatory props
	private String username;
	private String password;

	// optional props
	private String email;
	private String contact;

	public User(UserBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.contact = builder.contact;
		this.email = builder.email;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public static class UserBuilder{
		// mandatory props
		private String username;
		private String password;

		// optional props
		private String email;
		private String contact;
		
		public UserBuilder(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public UserBuilder setEmail(String email) {
			this.email = email;
			return this; 
		}

		public UserBuilder setContact(String contact) {
			this.contact = contact;
			return this;
		}

		public User build() {
			return new User(this);
		}
		
		@Override
		public String toString() {
			return "UserBuilder [username=" + username + ", password=" + password + ", email=" + email + ", contact="
					+ contact + "]";
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("username= ");
		sb.append(username + " ,password: ");
		sb.append(password);
		
		if(email != null)
			sb.append(" ,email: " + email);
		if(contact != null)
			sb.append(" ,contact: " + contact);
		
		return sb.toString();
	}
	
	

}
