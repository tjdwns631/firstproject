package com.yedam.collection;

public class Person implements Comparable<Person> {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age; //음수(오름차순, 
	}
	
	

}
