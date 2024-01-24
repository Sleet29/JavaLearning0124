package test;

public class JAVAT4 {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		
		switch(jumin.charAt(7)) {
		case '1','3':
			System.out.println("남자입니다.");
		break;
		
		case '2','4':
			System.out.println("여자입니다.");
		break;
		
		default:
			System.out.println("외국인입니다.");
		
			
		}
		
		
	}
}

