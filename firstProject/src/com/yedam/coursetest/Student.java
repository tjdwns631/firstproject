package com.yedam.coursetest;

//학생 예)홍길동 ,김유신
//학생이름 ,나이 ,성적정보 getter ,setter
public class Student {
	private String name;
	private int age;
	private String grade;

	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
