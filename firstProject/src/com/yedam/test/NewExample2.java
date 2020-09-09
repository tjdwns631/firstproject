package com.yedam.test;

class Maths {// static(정적)을 쓰면 인스턴스 생성안하고 호출가능
	public int max(int a, int b) {// 2개의수를 받아서 큰 값을 리턴(삼항연산자
		int result = (a >= b) ? a : b; // a가 b보다 크거나같은면 a 아니면 b 출력
		return result;
	}
	//min()//39,25 =>25, 24.6 3.8 => 3.8
	public int min(int a, int b) {
		int result = (a<=b) ? a:b;
		return result;
	}
	public double max1(double a ,double b) {//메소드 오버로딩 
		double result =(a<=b) ? a:b;
		return result;
	}
}

public class NewExample2 {
	public static void main(String[] args) {
		Maths math = new Maths(); // 인스턴스 생성해서 Maths 가 가지고 잇는 max호출가능
		int result = math.max(10, 5);
//  int result = Maths.max(10, 5);// 인스턴스 없이  Maths 바로 호출 static사용시
		System.out.println("큰수는 : " + result);
		int result1 = math.min(39 ,25);
		System.out.println("작은수 : " + result1);
		double result2 = math.max1(24.6, 3.8);
		System.out.println("큰수  : " + result2);
	}
}
