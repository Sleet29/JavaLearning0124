package test;

public class JAVAT {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		
		if(jumin.substring(7,8).equals("4") &&
           jumin.substring(7,8).equals("2")) {
			System.out.println("여자입니다.");
		} else if (jumin.substring(7,8).equals("1") &&
	           jumin.substring(7,8).equals("3")) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("외국인입니다.");
		}
		
		
	}
}
