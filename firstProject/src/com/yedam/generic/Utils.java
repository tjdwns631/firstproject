package com.yedam.generic;

public class Utils {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;

	}

	public static <T, M> boolean compare(Product<T, M> p1, Product<T, M> p2) {
        boolean b1 = p1.getType().equals(p2.getType());
        boolean b2 = p1.getModel().equals(p2.getModel());
		return b1 && b2;

	}

}
