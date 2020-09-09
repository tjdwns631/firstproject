package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class LastExample {
	public static void main(String[] args) {
		Pet[] p1 = {new Pet(), new Pet()};//p1배열에 값이오면된다
		Fruit[] f1 = {new Fruit(), new Fruit()};
		LastExample2 st1 = new LastExample2("최재영",20 ,p1,f1);
		LastExample2 st2 = new LastExample2("민해주", 21,
				             new Pet[] {new Pet(),new Pet()},
		                     new Fruit[] {new Fruit(), new Fruit()}
		                         );
		LastExample2 st3 = new LastExample2("김상민", 22 , null,null);
		List<LastExample2> list= new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		//민해주의정보
		list.get(1).pets[0].petName = "야옹이";
		list.get(1).pets[0].petAge = 2;
		list.get(1).pets[0].sex = "수컷"; 
		//김상민의정보
	}
}
