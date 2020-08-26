package com.yedam.classes;

public class Calculator {
	static double pi = 3.14;

	// 가로 .세로 >> 넓이를 반환해주는 메소드 getRectangle
	public static String calgetRectangle(int x, int y ) {
		return "가로" + x + " , 세로" + y + "의 넓 이는" 
	            + getRectangle(x,y)+"입니다.";
	}

	public static int getRectangle(int x, int y) {
		int result = x * y;
		return result;
//static 정적 메소드 인스턴스 안만들어도 됨 
	}

	public static int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static void getArea(double a) { // void s는 단순히 화면값 출력 return값 없음
		double result = pi * a * a;
		System.out.println("반지름" + a + " 의 넓이는 " + result);
	}

}
