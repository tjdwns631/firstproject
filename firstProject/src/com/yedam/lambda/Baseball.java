package com.yedam.lambda;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class Baseball {
	public static void main(String[] args) {
		int[] user = new int[3];// 사용자가던질볼
		int[] com = new int[3];// 컴터던질볼
		int num = 0;// 배열인덱스 변수
		int count = 0;// 맞추는거 카운트
		boolean run = true;
		int strike = 0; // 스트라이크 볼 카운트 0부터
		int ball = 0;

		while (run) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
				for (int j = 0; j < i; j++) {
					if (com[j] == com[i]) {
						i--;
						break;
					}
				}
			}
			Scanner s = new Scanner(System.in);
			System.out.println("1~9 의 정수를 입력하세요 >>");

			run = true;
			while (run) {
				for (int i = 0; i < user.length; i++) {
					num = s.nextInt();
					user[i] = num;
					if (num < 0 || num > 10) {
						System.out.println("1~9의 정수를 입력하세요 >>");
					}
				}
				for(int i =0; i<com.length;i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i]==user[j] &&i ==j) {
							strike++;
						}
						else if(com[i] == user[j] && i !=j) {
							ball++;
						}
					}
				}
				System.out.println(strike + "스트라이크" + ball + "볼");
				strike = 0;
				ball = 0;
				
				if(strike >=3) {
					run = false;
				}
				count = count +1;
			}
			System.out.println("횟수 :" + (count -1));
			System.out.println("게임종료");
			s.close();
		}
	}

}
