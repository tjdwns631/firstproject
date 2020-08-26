package com.yedam.lambda;
//함수적인터페이스 functional interface
interface MyFunctionalInterface {
	public void run();// 추상메소드(abstract method
}

class MyFuncClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("ruuuuuuuun.");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf =() -> {System.out.println("ruun.");
		};
		myintf.run();
		
//		ShowContent sc = new ShowContent() {
//			@Override
//			public void show(String content) {
//				System.out.println("내용은  " + content + " 입니다.");
//				
//			}
//			
//		};
//		sc.show("바나나");
		
		ShowContent sc = (content) -> {
				System.out.println("내용은  " + content + " 입니다.");		
		};
		sc.show("바나나");
		
		ShowContent sc2 =(content)-> {
		        System.out.println("this is " + content );
		};
		sc2.show("바나나");
		
		
		Calculate cal = (a, b) -> a+b;
		System.out.println(cal.sum(10, 5));
		
	}
}