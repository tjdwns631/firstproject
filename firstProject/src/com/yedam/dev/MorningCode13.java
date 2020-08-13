package com.yedam.dev;

public class MorningCode13 {
	public static void main(String[] args) {

		int n = 0;
		while (true) {
			if (n++ == 5)
				break;

			else if (n == 3)
				continue;
			System.out.println("진행중 입니다.");
		}

		int j = 0;
		while (j < 10) {
			int a = 0;
			while (a < 10) {
				a++;
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
			System.out.println(i);
		}
		int score = 95;
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("95 이상 입니다.");
			} else {
				System.out.println("90 이상 입니다.");
			}
		} else if (score >= 80) {
			System.out.println("80 이상 입니다.");
		} else {
			System.out.println("80 미만 입니다");
		}
	}
}
