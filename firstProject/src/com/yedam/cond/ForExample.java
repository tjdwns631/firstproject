package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++
		System.out.println("결과는 " + sum);

		sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + 1;
		}
		sum += 1;
		System.out.println("최종 결과는 " + sum);

		sum = 0;
		for (int a = 5; a > 0; a--) {
			sum = sum + 1;
		}
		System.out.println("최종 결과는 " + sum);
		// 1~10범위의 수 합꼐
		sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = sum + i;
		}
		// 1=0+1
		// 3=1+2
		// 6=3+3
		System.out.println("1~10합:" + sum);

		int num = 2;
		System.out.println(num + " * " + 1 + " = " + (num * 1));
		System.out.println(num + " * " + 1 + " = " + (num * 2));
		System.out.println(num + " * " + 1 + " = " + (num * 3));
		System.out.println(num + " * " + 1 + " = " + (num * 4));
		System.out.println(num + " * " + 1 + " = " + (num * 5));
		System.out.println(num + " * " + 6 + " = " + (num * 6));
		
		
		for(int a =2; a<=9; a++) 
		for(int b= 1; b<=9; b++)  {
			
			System.out.println( a + " * " + b + " = " + (a * b));
		}
		
	}
}
