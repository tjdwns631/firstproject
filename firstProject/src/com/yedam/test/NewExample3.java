package com.yedam.test;

class Member {
	String name;
	int score;
	public Member(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}

class Calculator {
	public static int sum(Member[] ary) {
		int sum = 0;
		for (Member mem : ary) {
			sum += mem.score; // 스코어 라는 필드값을 합함
		}
		return sum;
	}

	public static int sum(int[] ary) {// int타입 배열
		int sum = 0;
		for (int i : ary) {// ary배열이 수많큼 i에 담겠다(ary와i는 같은타입
			sum += i;// sum+i
		}
		return sum;
	}
}

public class NewExample3 {
	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5, };// ary 에 12345 를 넣는다
		System.out.println(Calculator.sum(ary));
		Member m1 = new Member("최", 10);
		Member m2 = new Member("재",12);
		Member m3 = new Member("영", 15);

		Member[] mAry = { m1, m2, m3 };
		Calculator.sum(mAry);//s
		System.out.println(mAry);
		
	}
}
