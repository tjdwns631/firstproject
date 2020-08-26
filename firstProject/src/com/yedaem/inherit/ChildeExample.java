package com.yedaem.inherit;

public class ChildeExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName();// 부모
		child.getAge();// 부모
		child.getGrade();// 자신의 getgrade

		Parent parent = new Child("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//      parent.getgrade(); //자식이라 안됨

		Vehicle v1 = new Taxi();
		v1.run();
		v1 = new Bus();
		v1.run();

		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());

		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}
}
