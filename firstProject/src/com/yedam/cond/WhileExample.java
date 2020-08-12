package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		// 1~10값의 합;
		int i = 0;
		int sum = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			sum += i;
		}
		System.out.println("1 ~" + i + " 까지 합: " + sum);

		int a = 2;
		int b = 1;
		while (a < 10) {
			b = 1;
			while (b < 10) {
				System.out.println(a + " * " + b + " = " + (a * b));
				b++;
			}
			a++;
		}
	}
}
