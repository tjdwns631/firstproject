package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setDep("역사");
		s1.setNum(111);
		System.out.println(s1.getnum() + " " + s1.getname() + " " + s1.getdep());

		Student s2 = new Student(222);
		s2.setName("김유신");
		s2.setDep("수학");
		s2.setNum(222);
		System.out.println(s2.getnum() + " " + s2.getname() + " " + s2.getdep());

		Student s3 = new Student("김유신", "말타기", 333);
		System.out.println(s3.getnum() + " " + s3.getname() + " " + s3.getdep());

		Student s4 = new Student("박혁거세", "역사", 444);
		Student s5 = new Student("주몽", "역사", 555);

		String searchName = "김유신";
		String searchMajor = "역사";
/////////////////////////////////////////////////////

		int val1 = 666;
		String val2 = "계백";
		String val3 = "역사";

		Student s6 = new Student("계백", "역사" ,666);
		s6.setName(val2);
		s6.setDep(val3);
		s6.setNum(val1);

		Student[] sAry = { s1, s2, s3, s4, s5 ,s6};
		for (Student s : sAry) {
			if (s.getdep().equals(searchMajor))
				System.out.println(s.toString());
		}

	}
}
