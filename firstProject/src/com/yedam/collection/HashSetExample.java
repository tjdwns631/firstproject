package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		set.add(new Member("김다희", 20));
		set.add(new Member("김도은", 21));
		set.add(new Member("김도은", 21));
		
		for(Member mem : set) {
			System.out.println(mem.getName() + " , "+ mem.getAge());
		}
	
	}
}
