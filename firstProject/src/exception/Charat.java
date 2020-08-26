package exception;

import java.util.Scanner;

public class Charat {
	public static void showGender(String str) {
		String[] sp = { "*", "-", "/" };
		String newStr = str;
		for (int i = 0; i < sp.length; i++) {
             newStr = newStr.replace(sp[i], "");
		}
		System.out.println(newStr.charAt(6));
		switch (newStr.charAt(6)) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
	          System.out.println("여자입니다");
		break;
		}
		String str1 = "010102-345678";
		String str2 = "010102-145678";
		String str3 = "010102-235678";
		String str4 = "010102-445678";
		
		showGender(str1);
		showGender(str2);
		showGender(str3);
		showGender(str4);
		}
	    

	public static void main(String[] args) {

		String str1 = "010102-345678";
		System.out.println(str1.replace("-", " ").charAt(6));
		if (str1.replace("-", "").charAt(6) == '3') {
			System.out.println("남자");
		}

//	Scanner s= new Scanner(System.in);
//	System.out.println("주민번호를 입력하시오");
//	String jumin = s.nextLine();
//	
//	char ch = jumin.charAt(7);
//	switch (ch) {
//	case '1':
//	case '3':
//		System.out.println("남자입니다");
//		break;
//	case '2':
//	case '4':
//          System.out.println("여자입니다");
//	break;
//	}

//	System.out.println("주민번호를 입력하세요.");
//	Scanner s = new Scanner(System.in);
//	String jumin = s.next();
//	char ch =jumin.charAt(7);
//	if(ch =='1'|| ch=='3') {
//		System.out.println("남자입니다");
//	} else if(ch =='2'|| ch =='4') {
//		System.out.println("여자입니다");
//	} else {
//		System.out.println("없는 번호입니다.");
//	}

	}   
	    

}
