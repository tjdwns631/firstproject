package com.yedam.generic;

import java.util.HashMap;
import java.util.HashSet;

import com.yedam.classes.Person;

public class GenericExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("최재영");
		set.add("민해주");
		
		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person());
		set2.add(new Person());
         
		HashMap<String, Integer> map = new HashMap<>();
		map.put("김상민" , 50);
		map.put("최형준" ,15);
		
		
	}
}
