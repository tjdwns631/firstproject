package com.yedam.interfaces;

public class OracleDb implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클DB 입력.");
		
	}

	@Override
	public void insert() {
		System.out.println("오라클DB 수정.");
		
	}

	@Override
	public void update() {
		System.out.println("오라클DB 조회.");
		
	}

}
