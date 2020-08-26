package com.yedam.classes;

public class Student {
	private String name;
	private String dep;
	private int num;

	public Student() {

	}

	public Student(int num) {
		this.num = num;
	}

	public Student(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public Student(String name, String dep, int num) {
		this.name = name;
		this.dep = dep;
		this.num = num;
	}

	public void setName(String name) { // 메소드 (기능 동작)
		this.name = name;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getname() {
		return name;
	}

	public String getdep() {
		return dep;
	}

	public int getnum() {
		return num;
	}

	@Override
	public String toString() {
		return "이름은" + " " + name + " " + "전공은" + " " + dep + " " + "학번은" + " " + num;
	}

}
