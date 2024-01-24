package test;

public class JAVAT2 {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		
		switch(Integer.parseInt(jumin.substring(7,8))) {
		case 1,3:
			System.out.println("남자입니다.");
		break;
		
		case 2,4:
			System.out.println("여자입니다.");
		break;
		default:
			System.out.println("외국인입니다.");
		
			
		}
		
		
	}
}
