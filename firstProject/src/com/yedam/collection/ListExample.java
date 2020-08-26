package com.yedam.collection;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();// new BoarDao를 dao로 해서 인스턴스 생성 
		List<Board> list = dao.getBoardList();//dao.getBoardList를 list에 넣어준다
		for (Board board : list) {//리스트를 board에 주고 반복 
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
	}

}
