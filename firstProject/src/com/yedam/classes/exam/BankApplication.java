package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Accountre[] aAray = new Accountre[100];
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
//		String ano = null;
//		String owner = null;
//		int balance = 0;

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");

			int selectNo = s.nextInt();
			s.nextLine();

			if (selectNo == 1) {
				createAccountre();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	// 계좌생성
	private static void createAccountre() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 ");
		 String ano = s.nextLine();
		System.out.print("계좌주");
		String owner = s.nextLine();
		System.out.println("초기입금액");
		int balance = s.nextInt();	s.nextLine();
		System.out.println("결과 : 계좌가 생성되었습니다");
		Accountre A = new Accountre(ano, owner, balance);
		
		for (int i = 0; i < aAray.length; i++) {
			if (aAray[i] == null) {
				aAray[i] = A;
				break;

			}
		}

	}

	// 계좌목록
	private static void accountList() {
		for (Accountre b : aAray) {
			if (b != null) {
				System.out.println(b.getAno() + "  " + b.getOwner() + " " + b.getBalance());

			}
		}
	}

	// 예금하기
	private static void deposit() {
       System.out.println("계좌번호 : "); 
       String ano = s.nextLine();
       System.out.println("예금액을 입력하세요.");
       for(int i=0; i < aAray.length; i++) {
    	   if(aAray[i] != null && aAray[i].getAno().equals(ano)) { //==숫자 비교  equals 문자 비교 
    		  aAray[i].setBalance(aAray[i].getBalance() + s.nextInt()); 
    	   }
       }
        System.out.println("결과 :예금이 성공 되었습니다");
       
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("계좌번호 : ");
		String ano = s.nextLine();
		System.out.println("출금액 : ");
		int balance = s.nextInt();
		Accountre acnt = findAccountre(ano);
		int curbalance = acnt.getBalance();//현재 잔액
		acnt.setBalance(curbalance - balance);//잔고
        
	}
    private static Accountre findAccountre(String ano) {
    	Accountre searchAcnt = null;
	   for(int i =0; i<aAray.length; i++){
     if(aAray[i] !=null && aAray[i].getAno().equals(ano)) {
    	 searchAcnt = aAray[i];
     }
     }
     return searchAcnt;
    }

}
