package com.yedam.test;
class Something{
    String field1;
    int field2;
    int[] field3;
    Student student;
    Something(String field1, int field2,int[] field3){
    	this.field1 =field1;
    	this.field2 =field2;
    	this.field3 =field3;
    }                     //타입         변 수
    public void setStudent(Student student) {
    	this.student = student;
    	
    }
    public Student getStudent() {
    	return this.student;
    }
}
class Student{//student class
	String studentName;
	int studentAge;
	int studentScore;
}
public class NewExample {
	public static void main(String[] args) {
		int numa =10; //타입과 변수 
//		String str = 10; 문자열("")이 되가나 타입을 바꿔줘야함
        float f1 =10.8f;//오른쪽에잇는값을 왼쪽에 할당
        
//         something = Something("hello",10);
//        Something something = new Something("hello",10); //something 에다 헬로랑 10도넣고 싶다
//        class 생성해서 생성자를 만들어 준다
        Something something = new Something("hello",10,new int[] {1,2,3,4,5});//배열을 넣고 싶을때
        for(int i=0; i<something.field3.length; i++) {
        	System.out.println(something.field3[i]);
        }
        Student st1 =new Student();
        something.setStudent(new Student());
        System.out.println(something.getStudent().studentName);
        System.out.println(something.getStudent().studentAge);
        System.out.println(something.getStudent().studentScore);
                           //something이가지고잇는 getstudent에  name age 등등을 넣는다
	}
}
