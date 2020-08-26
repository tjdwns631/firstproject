package abstracts;

public abstract class Animal {
	private String species;

	public Animal() {

	}

	public void showInfo() {//메소드
		System.out.println("분류는" + species);
	}

	public void breathe() {//메소드
		System.out.println("숨을 쉰다.");
	}

	public abstract void sound();//추상메소드 
}
