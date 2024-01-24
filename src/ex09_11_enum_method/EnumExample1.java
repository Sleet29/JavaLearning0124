package ex09_11_enum_method;

class EnumExample1 {
	public static void main(String args[]) {
		Day days[] = Day.values();
		
		for(int i=0;i<days.length;i++)
			System.out.println(days[i]);
		
		System.out.println("======================");
		
		for (Day day : days)
			System.out.println(day);
	}

}
