package api;

import java.util.Arrays;

class User implements Comparable<User> {
	private String name;
	private int grade;

	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}


	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.name);
	//	return o.grade - this.grade;
		//1 -2  오름차순  음수  // 양수 오름차순
	}


	@Override
	public String toString() {
		return "User" + name + ", grade=" + grade + "";
	}

	
}

public class ArrayExample {
	public static void main(String[] args) {

		int[] scores = { 95, 80, 36, 88 };
		String[] names = { "Hong", "Park", "Choi" };
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("-----정렬후-----");
		Arrays.parallelSort(names);
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("------------------------------------");
		User[] users = { new User("user1", 1), new User("user2", 2), new User("user3", 3) };
		Arrays.sort(users);
		for (User s : users) {
			System.out.println(s);
		}
//  3 , 2  1  순이 나오도록

//		Arrays.sort(users, Collections.reverseOrder());
//
//		for (User s : users) {
//			System.out.print("[" + s + "]");
//		}
	}

}
