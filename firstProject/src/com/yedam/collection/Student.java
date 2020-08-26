package com.yedam.collection;

///인터페이스  comparable이 가지고잇는 메소드 구현해줘야함
public class Student implements Comparable<Student> {// comparable 기준정해줌 제너릭타입
	private String name;
	private int mathScore;
	private int englishScore;

	public Student(String name, int mathScore, int englishScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	@Override
	public int compareTo(Student o) {
		// 기준을 정해줘야함 빅
//		 return this.mathScore - o.mathScore; //수학 점수만 기준 음수  순차적  오름차순
//		return this.mathScore + o.mathScore; // 양수 역순 정리  내림차순
		// 기준이되는매스//

		if ((this.mathScore + this.englishScore) < (o.mathScore + o.englishScore)) {
			return -1;
		} else {
			return 1;
		}
	}

}
