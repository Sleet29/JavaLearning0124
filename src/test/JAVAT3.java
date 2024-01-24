package test;

public class JAVAT3 {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		
		if(jumin.charAt(7)%2 == 1 || jumin.charAt(7)<5 ) {
			System.out.println("남자입니다.");
		} else if (jumin.charAt(7)%2 == 0 || jumin.charAt(7)<5) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("외국인입니다.");
		}
	}
}
		
		
