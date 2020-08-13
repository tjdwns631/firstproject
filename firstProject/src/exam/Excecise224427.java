package exam;

import java.util.Scanner;

public class Excecise224427 {
	public static void main(String[] args) {
		// 22,44,28받아서 작은수 >큰수로 출력

		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("임의의 세정수입력");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}if (b > c) {
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}if (a > c) {
			a = a ^ c;
			c = c ^ a;
			a = a ^ c;
		}
		System.out.println(">>정렬 결과 : " + a+","+b+","+c);
	}
}