package com.yedam.classes;

final class FinalClass {//상속을 못받게된다final

}

//class ExtendClass extends FinalClass {

//}



public class MainEx {

	final int age = 10;//더이상 값을 못받는다 final

	public static void main(String[] args) {
		Friend fr = new Friend();// 인스턴스
		fr.getAge();// 인스턴스 메소드

//	 Calculator cal = new Calculator();
		Calculator.add(10, 10); // 정적메소드
		
		final int val =10;
		
	}
}
