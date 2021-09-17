package com.example.CoronaTrackerService.Modal;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(Include.NON_EMPTY)
public class Users {
	
	@JsonProperty
	private String userId;
	
	@JsonProperty
	private String userName;
	
	@JsonProperty
	private String emailId;
	
	@JsonProperty
	private String password;

	public String getUserId() {
		return userId;
	}
   
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Users(String userId, String userName, String emailId, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailId, password, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(password, other.password)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
	
	

}
