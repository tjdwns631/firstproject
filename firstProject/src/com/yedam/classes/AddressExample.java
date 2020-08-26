package com.yedam.classes;

import java.util.Scanner;

public class AddressExample {
	public static void main(String[] args) {

		boolean run = true; // 참이면 계속 런
		String name = null;// 스트링 네임값을 널
		int age = 0;// 에이지 영
		String num = null;// 넘버 값 널
		Address[] aAray = new Address[1];
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("1.정보입력(이름, 나이, 전화번호)");
			System.out.println("2.리스트");
			System.out.println("3.이름조회");
			System.out.println("9.종료");

			int selectNo = s.nextInt();
			s.nextLine();

			if (selectNo == 1) {
				for (int i = 0; i < aAray.length; i++) {
					System.out.println("이름을 입력하시오.");
					name = s.nextLine();
					System.out.println("나이를 입렵하시오.");
					age = s.nextInt();
					s.nextLine();
					System.out.println("전화번호를 입력하시오.");
					num = s.nextLine();

					Address a = new Address(name, age, num);
					aAray[i] = a;
				}

			} else if (selectNo == 2) {
				for (Address a : aAray) {
					System.out.println(a.toString());
					System.out.println();
				}
//			} else if (selectNo == 3) {
//				System.out.println("이름을 입력하시오.");
//			   	name = s.nextLine();
//                if()            


			}

			else if (selectNo == 9) {
				run = false;
			}
		}

	}
}
