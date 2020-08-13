package exam;

import java.util.Scanner;

public class Exercise00009 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------");
			System.out.println("선택>");

			int selectNo = s.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요>");
				studentNum = s.nextInt();
				scores = new int[studentNum];// 배열 크기선언
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = s.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i=0; i<scores.length; i ++) {
					if(max <scores[i])
						max=scores[i];
					sum+=scores[i];
				}
				avg = (double) sum/scores.length;
				System.out.println("최고 점수 " + max);
				System.out.println("평균 " +avg);
			} else if (selectNo == 5) {
				run = false;
			}

		}
	}

}
