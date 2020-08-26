package com.yedam.classes;

public class personExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("허성준");
		p1.setAge(28);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		Person hsj = new Person();
		hsj.setName("허성준");
		hsj.setAge(28);
		System.out.println(hsj);

		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(27);
		Person ksm2 = new Person();
		ksm.setName("김상민");
		ksm.setAge(27);

		System.out.println(ksm.getName() == ksm2.getName());

		System.out.println(hsj.introduce());
		System.out.println(ksm.introduce());

		Person[] pAry = { hsj, ksm, ksm2 };

//        for(int i = 0 ; i <pAry.length; i++) {
//        	pAry[i].introduce();
//        }

		
		Person anoy = new Person("민해주");
		anoy.name = "최형준";
		anoy.age = 28;
		System.out.println(anoy.introduce());

		Person kkk = new Person("케이케이케이", 20);
		kkk.setName("김시무");
		System.out.println(kkk.introduce());
	}
}
