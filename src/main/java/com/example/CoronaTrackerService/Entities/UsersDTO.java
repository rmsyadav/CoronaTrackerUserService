package com.example.CoronaTrackerService.Entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UsersDTO {

	@Id
	@Column(unique = true, name = "USERID")
	private String userId;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "EMAILID")
	private String emailId;
	@Column(name = "PASSWORD")
	private String password;
	
	public UsersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersDTO(String userId, String userName, String emailId, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		UsersDTO other = (UsersDTO) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(password, other.password)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "UsersDTO [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + "]";
	}
	
	
}
