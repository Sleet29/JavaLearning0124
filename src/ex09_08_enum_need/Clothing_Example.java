// 의류 정보 클래스를 사용하는 프로그램
package ex09_08_enum_need;

public class Clothing_Example {
	public static void main(String args[]) {
		ClothingInfo obj1 = new ClothingInfo("32919","반팔 티셔츠", "면100%", ClothingInfo.SUMMER);
		
		System.out.println("상품코드 : "+obj1.code);
		System.out.println("상품명 : "+obj1.name);
		System.out.println("소재 : "+obj1.material);
		System.out.println("계절구분 : "+obj1.season);
	}
}