package com.yedam.dev;

import java.math.BigDecimal;

public class LongFloatExample {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		long l1 = 2147483648L;

		float f1 = 0.123456748901234564789F;
		double d1 = 0.123456748901234564789;
		double d2 = 0.123456748901234564789;
		double d3 = d1 + d2;
		System.out.println("d3 = " + d3);

		BigDecimal bd1 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd2 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("bd3 = " + bd3);
	}

}
