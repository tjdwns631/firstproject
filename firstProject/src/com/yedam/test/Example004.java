package com.yedam.test;

import java.util.HashSet;
import java.util.Set;

import com.yedam.collection.Personset;

public class Example004 {
	public static void main(String[] args) {
		// 배열의 크기 3// 1~6까지의 임의의 숫자가 반복되지 않도록 배열에저장
		int[] intAry = new int[3];
			for (int i = 0; i < intAry.length; i++) {
				int randomNum = (int) (Math.random() * 6) + 1;
				System.out.println(randomNum);	
		}

			Set<Integer> set = new HashSet<>();
			while(true) {
				int temp = (int) (Math.random() * 6) + 1;
				set.add(temp);
				if(set.size() == 3){
					break;
				}
				for(Integer it : set) {
					System.out.println(it);
				}
				
				Set<Personset> pSet = new HashSet<>();
				pSet.add(new Personset("Hong" , 20));
				pSet.add(new Personset("Hong" , 20));
				pSet.add(new Personset("Hong" , 20));
				
				for(Personset p : pSet) {
					System.out.println(p.name + ", " + p.age + "," + p.toString());
				}
			}
			
	}
}
