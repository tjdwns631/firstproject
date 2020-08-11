package com.yedam.dev;

public class BooleanExample {
	public static void main(String[] args) {
		long l1 = 10L;
		int i1= 10;
	
		boolean trueOrFalse = false;
		trueOrFalse = l1 == i1  ;
		System.out.println(trueOrFalse);
		
		if (l1 == i1) { // trueOrFalse = l1 = i1
			System.out.println("이 내용은 참일 경우에 출력됩니다.");
			
		}
		System.out.println(trueOrFalse);
	}

}

