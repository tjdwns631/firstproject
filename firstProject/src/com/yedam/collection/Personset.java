package com.yedam.collection;

public class Personset {
	public String name;
	public int age;

	public Personset(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		return this.age;

	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Object obj) {
		Personset p = (Personset) obj;
		return this.name.equals(p.name);
	}

}
