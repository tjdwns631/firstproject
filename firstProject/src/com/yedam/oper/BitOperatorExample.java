package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		byte b1 = 10;
		byte b2 = 4;
		int b3	= b1 % b2;
		System.out.println("b3 = " + b3);
		
		double result = 10 / 8.0;
		System.out.println(result);
	}
}
