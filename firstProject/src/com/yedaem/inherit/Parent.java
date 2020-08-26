package com.yedaem.inherit;

public class Parent {
	private String name; 
	private int age;
	
	public Parent() {
		
	}
	public Parent(String name, int age) {
		super();//부모 클래의 생성자 호출
		this.name = name;
		this.age = age;
		
		
		
	}
	public String getName() {
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
	@Override
	public String toString() {
		return super.toString();
//return "Parent [name=" + name + ", age=" + age + "]";
	}

}
