package com.yedam.classes;

public class Address {//필드 (속성)
	private String name;
	private int age;
	private String num;

	public Address() {// 생성자 초기값  클래스랑 이름같아야함

	}
	
	public Address(String name, int age, String num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}

	public String getName() { // 메소드 기능동작
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNum() {
		return num;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "나이 :" + age + "전화번호 : " + num;
	}

}
