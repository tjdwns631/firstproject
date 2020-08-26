package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
      //메소드 static으로 할시 new 클래스이름으로도 호출가능  ex)Calculator.add()
		System.out.println("10 + 20 = " + cal.add(10, 20));
		System.out.println("10.2 + 20.3 = " + cal.add(10.2, 20.3));
		//static 정적 메소드 인스턴스 안만들어도 됨  바로 호출
		double r1 = 3.5;
		cal.getArea(r1);

		System.out.println( "4 * 5 " + cal.getRectangle(4, 5));
		// 가로 4 세로 5 넓이 20

		System.out.println(cal.calgetRectangle(4 ,5));
	}
}
