package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
		for (int j = 0; j < 5; j++) {
//			System.out.println(dAry[j]);
		}
//	int[][] iAry = {
//			{10,20},
//			{20,30,40} //값을 바로 넣는거
//	};
		int[][] iAry = new int[5][5]; // 값을 나중에
		int num1 = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				iAry[i][j] = num1++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", iAry[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", iAry[j][i]);
			}
			System.out.println();
		}
	}
}
