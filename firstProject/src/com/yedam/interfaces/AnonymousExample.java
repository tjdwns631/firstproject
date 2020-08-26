package com.yedam.interfaces;

class Anonymous {
	void run() {
		System.out.println("실행.");
	}
}

interface AnonymInterface{
	void run();
}

class ChildAnonymous extends Anonymous {

}

public class AnonymousExample {
	public static void main(String[] args) {
		AnonymInterface anonymIntf = new AnonymInterface() {

			@Override
			public void run() {
		    System.out.println("자식 구현 객체 실행.");
			}//익명의 구현개체
			
		};
		anonymIntf.run();
		
		Anonymous anonym = new Anonymous() {
            String str;

			@Override
			void run() {
				System.out.println("자식 실행.");
			}//익ㄱ명의 자식객체
            
		};
		anonym.run();
	}
}
