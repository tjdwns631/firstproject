package com.yedam.test;

public class MemberExample2 {
	class Member implements Cloneable{
		public String id;
		public String name;
		public String password;
		public int age;
		public boolean adult;
		
		public Member(String id, String name, String password, int age, boolean adult) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.age = age;
			this.adult = adult;
		}
		public Member getMember() {
			Member cloned =null;
			try {
				cloned =(Member) clone();
			} catch (CloneNotSupportedException e) {}
			return cloned;
		}
		
	}
	public static void main(String[] args) {
		MemberExample2 ne =new MemberExample2();
		Member original = ne.new Member("blue", "홍길동" , "12345", 25, true);
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		
		System.out.println("복제 개체의 필드값");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		System.out.println();
		
		System.out.println("원본 개체의 필드값");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);
		
	}
}
