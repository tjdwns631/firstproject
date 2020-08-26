package com.yedaem.inherit;
            //자식 클래스 extends 부모 클래스  //
public class Child extends Parent {

	private int grade;

	public Child(String name, int age) {
		super(name, age);

	}

	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
