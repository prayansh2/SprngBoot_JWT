package com.prayansh.Auth.models;

public class JwtRequest {
		String username;
		String password;
		public JwtRequest()
		{
			
		}
		public JwtRequest(String username, String password) {
			super();
			this.username = username;
			this.password = password;
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
		@Override
		public String toString() {
			return "JwtRequest [username=" + username + ", password=" + password + "]";
		}
		
}
