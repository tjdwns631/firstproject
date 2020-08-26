package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
//	cal.r =-5;
		cal.setRadius(-5);// 값설정
		System.out.println("반지름: " + cal.getRadius() + "의 넓이는 :" + cal.getArea());

//		System.out.println(10);
//		System.out.println(10.2);
//		System.out.println("10");
		print("200.3");
	}
	///메소드 오버로딩 동일한메소드명 사용 :매개값타입이다르거나 갯수가다름
	public static void print(int a) {
		System.out.println("입력값은 : " + a);
	}
	public static void print(double a) {
		System.out.println("입력값은 : " + a);
}
	public static void print(String a) {
		System.out.println("입력값은 : " + a);
}
}