package com.yedam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample4 {
	Member mem;

	class Member {
		String id;

		Member(String id) {
			this.id = id;
		}

		@Override // 매게값()
		public boolean equals(Object obj) {
//			return super.equals(obj);
			if (obj instanceof Member) {
				Member mem = (Member) obj;// 형 변환
				return id.equals(mem.id);//id값이 같으면 값은값
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(id); //id 값이 같으면 동일한 해시코드 
//			return super.hashCode();
		}
                
	}
//	public void printMember() {// 스태틱 아닐시 이렇게 선언
//		Member m1 = new Member("hong");
//	}
	public static void main(String[] args) {
		// class 안의 클래스는 밖에잇는 클래스에 선언 해주고
		NewExample4 ne = new NewExample4();
		Member m1 = ne.new Member("hong");
		Member m2 = ne.new Member("hong");
		System.out.println(m1.equals(m2));
		
		System.out.println(Objects.hash("hhh"));
		Set<Member> set = new HashSet<>();
		set.add(m1);//중복된 값은 받지 않겟다 Set
		set.add(m2);//동일한개체인지아닌지 판단하는게 equals 랑 hashcode
		for(Member m :set) {
			System.out.println(m.id);
		}
		

	}
}
