package com.yedam.classes;

import java.time.DayOfWeek;
import java.util.Calendar;

public class CalendearExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));// 월:0~11
		System.out.println(cal.get(Calendar.DATE));

		cal.set(2020, 7, 0); // 월의 마지막날은 0입력
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));// 월:0~11
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 일요일
		System.out.println(cal.get(Calendar.DATE));

		createCalendar(2020, 7);// 2020년 8월 달력을 보여주세요
	}

	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance(); // 캘린더 인스턴스
		int today = cal.get(Calendar.DATE);// 오늘날짜 저장
		cal.set(Calendar.YEAR, year);// 년도 셋팅
		cal.set(Calendar.MONTH, month -1 );// 0부터
//		cal.set(year, month - 1, 1);
		cal.set(Calendar.DATE , 1 );// (현재달을 1일로)
		int startDay = cal.get(Calendar.DAY_OF_WEEK);// 1일의 일요일
		int lastDay = cal.getActualMaximum(Calendar.DATE);// 달의 마지막
		System.out.println("일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" + "목" + "\t" + "금" + "\t" + "토");
		// 요일명 출력
		for (int i = 1; i < startDay; i++) {// 1일이 시작되는이전의 요일공백 7일
			System.out.printf("%3s\t", " ");
		}

		for (int i = 1; i <= lastDay; i++) {
//			if (i == 1) {
//				System.out.println();
//			}
			if (i == today) {
				System.out.printf("[%2d]\t", i);// 오늘날짜 표시
			} else {
				System.out.printf("%3d\t", i);// 그냥출력
			}
			if ((i+startDay-1) % 7 == 0) {
				System.out.println();

			}
		}
	}

}
