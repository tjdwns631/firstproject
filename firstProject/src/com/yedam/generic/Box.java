package com.yedam.generic;

public class Box<T> {//Box라는 클래스를 사용할때 T타입을쓰겟다
	private T obj;
	//모든거 담을수잇는 최상위 클래스
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}
