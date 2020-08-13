package exam;

public class Exercise04 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		while(true) {
		 a = (int)(Math.random() * 6) +1; 
		 b = (int)(Math.random() * 6) +1;
		 if(a + b ==5)
			 break;
		System.out.println(a + " , " + b);
		}
	}
}
