package com.yedam.test;

public class Example03 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;

		// 학생한명이가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println("학생 한명이가지는 연필수 : " + pencilsPerStudent);

		// 남은연필수
		int pencilsLeft = (pencils % students);
		System.out.println("남은 연필수 : " + pencilsLeft);
	}
}
