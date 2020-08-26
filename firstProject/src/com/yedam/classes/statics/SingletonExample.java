package com.yedam.classes.statics;

import com.yedam.classes.Person;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if (s1 == s2) {
			System.out.println("동일한 인스탄스 입니다.");
		} else {
			System.out.println("다른 인스탄스 입니다");
		}
		
		Person p1 = new Person();
		p1.setName("1111");
	}
}
