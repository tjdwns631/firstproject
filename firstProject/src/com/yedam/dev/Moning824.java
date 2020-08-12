package com.yedam.dev;

public class Moning824 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "허성준";
		System.out.println(str1 + ", " + str2 + " " + name);

		int v1 = 150, v2 = 270;
		
		int result = add(v1, v2);
		System.out.println("결과 값 : " + result);

		result = minis(v1, v2);
		System.out.println("결과는 " + result);	
		
		introduce("허성준");
	}
	 public static int minis(int x, int y) {
		 return x - y ;
		 
		 
	 }
      
	public static void introduce(String name) {// void 결과값 반영 x  호출만
		System.out.println("안녕하세요. 저는 " + name + " 입니다. ");
	}   
	
	public static int add(int x, int y) { // method
		 return x + y;
		
	}
}
