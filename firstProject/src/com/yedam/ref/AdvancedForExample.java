package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] scores = new int[5]; //

		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요.");
			scores[i] = s.nextInt();
		}

		int sum = 0;
		double avg = 0;
		int maxVal = 0; // 최고점수

		for (int num : scores) {//확장 for  score 에 입력한 수를 num 에 입력
			sum += num;           //  sum = sum +num 
		}
		for (int num : scores) {
			if (num >= maxVal)
				maxVal = num;
		}

		avg = (double) sum / scores.length;
		System.out.println("합계 점수 : " + sum + "평균 : " + avg + "최고점수 :" + maxVal);
	}
}
