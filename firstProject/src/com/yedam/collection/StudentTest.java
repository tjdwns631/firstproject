package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	///////collection
	static List<Student> list = new ArrayList<>(); // 인스턴스생성
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.학생이름 2.평균 3.수학최고점수와 학생 9.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int selectNo = s.nextInt();
			s.nextLine();
			if (selectNo == 1) {
				System.out.println("학생이름 입력");
				String name = s.nextLine();
				System.out.println("수학점수 입력");
				int mathScore = s.nextInt();
				System.out.println("영어점수 입력");
				int englishScore = s.nextInt();

				Student st = new Student(name, mathScore, englishScore);
				list.add(st);
			} else if (selectNo == 2) {
                int sum = 0;
                int sum1 = 0;
                double avg = 0;
                double avg1 = 0;
                for( Student st : list) {
					sum+=st.getMathScore();
					sum1+=st.getEnglishScore();
				}
              avg = sum /list.size();
              avg1 = sum1 /list.size();
			
				System.out.println("수학평균점수" + avg);
				System.out.println("영어평균점수 "+ avg1);
			} else if (selectNo == 3) {
				Student max = list.get(0);
				for(Student st : list) {
					if(max.getMathScore() < st.getMathScore()) {
						max = st;
					}
					
				}
				System.out.println("수학최고점수" + max.getMathScore());
				System.out.println("학생이름 : " + max.getName());

			} else if (selectNo == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

}
