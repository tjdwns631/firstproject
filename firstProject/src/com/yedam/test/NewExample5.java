package com.yedam.test;

public class NewExample5 {
	public static void main(String[] args) {
		nvl(null,"초기값");// =>"초기값"
		nvl("입력값" , "초기값");// =>"입력값"
	}
   public static void nvl(String str1, String defaultValue) {
	     System.out.println((str1 == null) ? defaultValue : str1);
	     //str1 값이 null 이면 defaultValue  아니면 str1 값이 나온다
	     //2번째 꺼는 st1값이 null 아니고 입력값이라서  거짓 so 초기값이 나옴
   }
}
