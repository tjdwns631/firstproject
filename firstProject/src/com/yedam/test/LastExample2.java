package com.yedam.test;

class Pet {
	String petName;
	int petAge;
	String sex;
}

class Fruit {
	String Name;
	int price;
}

public class LastExample2 {
	String name;
	int age;
	Pet[] pets;// 펫을 여러개 담을수있게 배열 선언
	Fruit[] fruits;// 여러개 담을수잇께 배열 선언

	public LastExample2() {

	}

	public LastExample2(String name, int age, Pet[] pets, Fruit[] fruits) {
		super();
		this.name = name;
		this.age = age;
		this.pets = pets;
		this.fruits = fruits;
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

	public Pet[] getPets() {
		return pets;
	}

	public void setPets(Pet[] pets) {
		this.pets = pets;
	}

	public Fruit[] getFruits() {
		return fruits;
	}

	public void setFruits(Fruit[] fruits) {
		this.fruits = fruits;
	}

}
