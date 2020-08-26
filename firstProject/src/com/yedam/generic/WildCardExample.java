package com.yedam.generic;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {

	}

	public static void registerCourseStudents(Course<? extends Student> course) {

	}

	public static void registerCourseWorker(Course<? super Worker> course) {

	}

	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Person("직장인1"));
		crsPerson.add(new Person("학생인1"));
		crsPerson.add(new Person("고등학생1"));

		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
//  불가  crsWorker.add(new Person("일반21"));
		crsWorker.add(new Worker("직장인2"));

		Course<Student> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생2"));
		crsStudent.add(new HighStudent("고등학생2"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
		crsHighStudent.add(new HighStudent("고등학생2"));
		
		// 일반인 등록가능//모든클래스
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		// 직장인 등록가능 Course<? super Worker
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
//		registerCourseWorker(crscrsStudent);
//		registerCourseWorker(crsHighStudent);
		// 학생 등록가능<?extends student
		registerCourseStudents(crsStudent);
		registerCourseStudents(crsHighStudent);
		// 고등학생등록가능
	}
}
