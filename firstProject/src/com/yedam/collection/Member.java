package com.yedam.collection;

public class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
	//	return this.age;
		return this.name.hashCode();
		// return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// return true;
		Member mem = (Member) obj;
		 return this.name.equals(mem.name);
	}

}
