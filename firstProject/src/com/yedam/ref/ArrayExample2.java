package com.yedam.ref;

public class ArrayExample2 {
	public static void main(String[] args) {
       int[]numAry  = {2,4,5,3,5};
		int result = addAry(numAry);
		System.out.println("배열의 합 : " + result);
	}

	public static int addAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i]; //sum = ary[i] + sum
		}
		return sum;
	}
}
