package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {//메소드 
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1" , "내용1"));
		list.add(new Board("제목2" , "내용2"));
		list.add(new Board("제목3" , "내용3"));
		//어레이리스트  >> list 해서내용 담기
		
		return list;//리스트로 리턴해준다
	}


}
