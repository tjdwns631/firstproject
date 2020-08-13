package exam;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0, input = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("예금 금액을입력하세요>");
				input = scanner.nextInt();
				balance = balance + input;
				System.out.println("잔액 : " + balance);

			} else if (menu == 2) {
				System.out.println("출금 금액을 입력하세요>");
				input = scanner.nextInt();
				balance = balance - input;
				System.out.println("잔액 : " + balance);

			} else if (menu == 3) {
				System.out.println("잔액 : " + balance);

			} else if (menu == 4)
				run = false;
		} // end of while
		System.out.println("종료");
	}// end of main
}// end of clss1