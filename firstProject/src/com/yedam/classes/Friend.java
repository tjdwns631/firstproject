package com.yedam.classes;

public class Friend {//필드
	private String name;
	private int age;
	private String phone;
	
	public Friend() {}
	
	public Friend(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone; //생성자
		
	}

	public String getName() {//메소드
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "일반친구이름 " + this.getName()
		+ ", 연락처" + this.getPhone();
	}
	
	
}
