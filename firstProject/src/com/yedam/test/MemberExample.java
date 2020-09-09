package com.yedam.test;

import java.util.Arrays;

import com.yedam.test.MemberExample.Car;

public class MemberExample {

	static class Car {
		String model;

		public Car(String model) {
			this.model = model;
		}
	}

	public class Member implements Cloneable {

		String name;
		int age;
		int[] scores;
		Car car;

		public Member(String name, int age, int[] scores, Car car) {
			super();
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// 먼저 얕은복제를해서 네임 에이지 복제
			Member cloned = (Member) super.clone();
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			// car를 깉은 복제한다
			cloned.car = new Car(this.car.model);
			// 깊은 복제된 멤버 객체를 리턴
			return cloned;

		}

		public Member getMember() {
			Member cloned = null;
			try {
				cloned = (Member) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}
	}

	public static void main(String[] args) {
		// 원본 객체 생성
		MemberExample m1 = new MemberExample();
		Member original = m1.new Member("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		// 복제 객체를 얻은 참조 객체의 값을 변경
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜져";

		System.out.println("복제  객체의 필드");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.println("scores : {");
				for(int i =0;i<cloned.scores.length; i++) {
					System.out.print(cloned.scores[i]);
					System.out.print((i==(cloned.scores.length-1))?"":",");
				}
				System.out.println("}");
				System.out.println("car: " + cloned.car.model);
				
				System.out.println();
				
				System.out.println("원본  객체의 필드");
				System.out.println("name : " + original.name);
				System.out.println("age : " + original.age);
				System.out.println("scores : {");
						for(int i =0;i<original.scores.length; i++) {
							System.out.print(original.scores[i]);
							System.out.print((i==(original.scores.length-1))?"":",");
						}
						System.out.println("}");
						System.out.println("car: " + original.car.model);

	}

}
