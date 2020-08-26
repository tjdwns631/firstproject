package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<Person>();
		box2.set(new Person());
		Person p1 = box2.get();
		
		Box<Person>box3= Utils.boxing(new Person());
		
		Box<String>box4=Utils.boxing(new String ("Hhh"));
		
		

//		Box box = new Box(); // box 인스턴스 생성
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get();
//		// object 타입 형변환 해줘야함
//		
//		Person p1 = new Person();
//		box.set(p1); 
//		Person p2 =(Person) box.get();
//		
//		result =(String) box.get();//runtime error /change Person/
	}
}
