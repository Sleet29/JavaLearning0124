// 열거 타입에 대해 valueof 메소드를 호출하는 예
// public static ex9_11_enum_mthod.Day valueOf(java.lang.String);
// ===> 열거 상수의 이름을 문자열로 넘겨주면 그에 해당하는 열거 상수를 리턴하는 메소드

package ex09_11_enum_method;

public class EnumExample2 {
	public static void main(String args[]) {
		printDay("MONDAY");
		printDay("WEDNESDAY");
		printDay("FRIDAY");
		printDay("FRIDAY2");
		
	}
	
	static void printDay(String name) {
		Day day = Day.valueOf(name);
		System.out.print(day + " : ");
		
		int value = day.ordinal();
		System.out.println(value);
	}

}
