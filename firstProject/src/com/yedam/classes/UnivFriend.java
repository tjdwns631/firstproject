package com.yedam.classes;

public class UnivFriend extends Friend {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "학교친구 이름" + super.getName() 
		+ ", 연락처 : " + super.getPhone() 
		+ ", 전공명 : " +this.major;
	}
}
