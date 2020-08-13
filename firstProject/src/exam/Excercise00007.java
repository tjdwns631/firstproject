package exam;

public class Excercise00007 {
public static void main(String[] args) {
	int max = 0;
	int[] arry = {1,5,3,8,2} ;
	
	for(int a : arry) {
		if (a >= max) {
			max = a ;
			}
	}
	System.out.println("max : " + max);
}
}
