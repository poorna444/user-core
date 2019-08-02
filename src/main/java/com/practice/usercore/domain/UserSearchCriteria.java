package com.practice.usercore.domain;

public class UserSearchCriteria {
	
	private String mobileNumber;
	private String firstName;
	private Long userId;
	private String gender;
	private String status;
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserSearchCriteria [mobileNumber=" + mobileNumber + ", firstName=" + firstName + ", userId=" + userId
				+ ", gender=" + gender + ", status=" + status + "]";
	}

}
