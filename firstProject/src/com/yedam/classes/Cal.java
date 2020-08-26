package com.yedam.classes;

public class Cal {
	private int r;// 반지름.
	private double pi = 3.14;

	public void setRadius(int r) { //값 설정 
		if (r < 0) {//r 이 0보다 밑이면  r값은 0
			r = 0;
		}
	}
	public int getRadius() {//출력
		return r;
	}
	public double getArea() {
		double result = pi * r * r;
		return result;
	}
	
}
