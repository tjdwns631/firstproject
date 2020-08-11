package com.yedam.dev;

public class VariableTest {
	public static void main(String[] args) {
		//b = b+1; //1~10까지 더하기
		int sum = 0;
		int b =0;
		for (int i = 1; i <= 10; i++) {
			int result = 0;
			b = b + 1; // b+1
			System.out.println(b);
			sum = sum+b; //sum +=b;
		}
		System.out.println("합계 : " +sum);
		int i = 0;
	}
}

