package com.yedam.ref;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] iAry = { 
				{ 10, 20 }, // iAry[0]
				{ 30, 40, 50 }, // iAry[1]
				{ 60, 30 }, // iAry[2]
				{ 40 }// iAry[3]
		};
		for (int a = 0; a < iAry.length; a++) {
			for (int i = 0; i < iAry[a].length; i++) {
				System.out.print(iAry[a][i] + "  ");
			}
			System.out.println();
		}
	}
}
