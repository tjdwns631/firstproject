package com.yedam.classes;

import java.util.Scanner;

public class Friendplus {
	public static void main(String[] args) {
//1.정보입력 이름 나이 전화번호
//		2.리스트
//		9.종료

		Friend[] friends = new Friend[100];///// 변수선언
		Scanner s = new Scanner(System.in);
		boolean run = true;
		// 메뉴 출력

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.정보입력(이름, 나이 , 전화번호) 2.리스트 9.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>");
			int selectNo = s.nextInt();
			s.nextLine();
			if (selectNo == 1) {
				System.out.println("이름입력> ");
				String name = s.nextLine();
				System.out.println("나이입력> ");
				int age = s.nextInt();
				s.nextLine();
				System.out.println("전화번호 입력> ");
				String phone = s.nextLine();
				
				Friend f = new Friend(name, age, phone);
				for (int i = 0; i < friends.length; i++) {// 한건만 입력
					if (friends[i] == null) {//널이 아닐경우에만 출력
						friends[i] = f;
						break; // for 반복문탈출
					}
				}

			} else if (selectNo == 2) {
				for (Friend fr : friends) {
					if (fr != null) {
						System.out.println("이름: " + fr.getName() 
						+ ", 나이: " + fr.getAge() 
						+ ", 전화번호: " + fr.getPhone());
					}
				}
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}// end of main
}// end of class
