package com.yedam.ref;

public class ArryCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 4, 2 };

		int[] cpyAry = new int[5];

//		for (int i = 0; i < origAry.length; i++) {
//			cpyAry[i] = origAry[i];
//		}
		
		System.arraycopy(origAry, 0, cpyAry, 0, 5);
		
		for (int i = 0; i < origAry.length; i++) {
			System.out.println(cpyAry[i]);
		}
		//확장 for(
		for(int num : cpyAry) {
			System.out.println(num);
		}
	}
}
