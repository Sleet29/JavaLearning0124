// 사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
// 의류 정보 클래스

package ex09_09_enum;

class ClothingInfo {
	String code;
	String name;
	String material;
	Season season; // season에는 열거 상수만 대입가능
	
	// 사계절을 
	static final int SPRING = 1;
	static final int SUMMER = 1;
	static final int FALL = 1;
	static final int WINTER = 1;
	
	ClothingInfo(String code, String name,
				String material,Season season)	{
		this.code=code;
		this.name=name;
		this.material=material;
		this.season=season;
		//this.season=5; (주석처리 풀면 컴파일 에러 발생)
		
	}

}
