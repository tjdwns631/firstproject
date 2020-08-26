package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void getInfo(Map<String, String> m) {

		System.out.println("이름 : " + m.get("이름"));
		System.out.println("전공 : " + m.get("전공"));

	}

	public static void getAge(Map<String, Integer> m) {
		Set<String> set = m.keySet();
		for (String str : set) {
			
			System.out.println("이름 : " + str + "\t 나이는 : " + m.get(str));
		}
	}
	public static void main(String[] args) {

		Map<String, Integer> m2 = new HashMap<>();
		m2.put("최재영", 20);
		m2.put("김현동", 23);
		m2.put("허성준", 26);
		getAge(m2);

		Map<String, String> m1 = new HashMap<>();
		m1.put("이름", "홍길동");
		m1.put("전공", "역사학");
		getInfo(m1);

		Map<Integer, Member> map = new HashMap<>();
		map.put(11, new Member("최대영", 20));
		map.put(12, new Member("김현동", 22));
		map.put(13, new Member("박진규", 22));

		System.out.println(map.get(11).getName() + "," + map.get(11).getAge());

		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			Member m = map.get(i);
			System.out.println(m.getName() + "," + m.getAge());
		}

		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
		for (Map.Entry<Integer, Member> m : entSet) {
			System.out.println(m.getKey() + "," + m.getValue().getName());

		}
	}
}
