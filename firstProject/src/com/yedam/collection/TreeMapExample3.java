package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		/// 기준이되는 거에 작은값
		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88));// 80점 이하
		Set<Student> set = sMap.keySet(); // student 자제가 키 값
		for (Student s : set) {
			System.out.println(s.getName() + " ," + s.getMathScore());
		}
//		SortedMap aMap = tMap.tailMap(new Student("uder", 79,79 ));// 80점이상
//         Set<Student> sset = sMap.keySet();{
//        	 for(Student s : sset) {
//        		 System.out.println(s.getName() + " , " + s.getMathScore());
//        	 }
		// }
		SortedMap<Student, String> sMap2 = tMap.subMap(new Student("SO", 70, 80), new Student("eo", 80, 90));// 70~80사이																									// 값을
		Set<Student> set2 = sMap.keySet();
		for (Student s : set2) {
			System.out.println(s.getName() + " , " + s.getMathScore() + " , " + s.getEnglishScore());
		} // 가지고 오는게 서브맵
	}
}
