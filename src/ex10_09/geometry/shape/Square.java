package ex10_09.geometry.shape;

import ex10_09.geometry.common.Polygon;

public class Square extends Polygon{
	
	public Square(int x, int y, int width) {
		
		super(4);
		
		setPoint(0,x,y);
		setPoint(1,x+width,y);
		setPoint(2,x+width,y+width);
		setPoint(3,x,y+width);
		
	}
	
	
	
	public int getX(int index) {
		return x[index];
	}
	
	public int getY(int index) {
		return y[index];			// 슈퍼 클래스의 protected 필드 사용
	}
	
	

}

/*
패키지 : ex10_09.geometry.shape
클래스 : Square(public)
부모 클래스 : ex10_9.geometry.common.Polygon
1) 생성자 (public)
	매개변수 : 정수형, 정수형, 정수형
			첫번째 매개변수는 x좌표
			두번재 매개변수는 y좌표
			세번째 매개변수는 사각형 길이
	기능 : 부모 생성자 호출, 인자값 4
			setPoint(0,x,y) 호출 => x좌표 : x좌표값, y좌표 : y좌표값
			setPoint(1,?,?) 호출 => x좌표 : x좌표값에서 사각형 길이만큼 이동, y좌표 : y좌표값
			setPoint(2,?,?) 호출 => x좌표 : x좌표값에서 사각형 길이만큼 이동, y좌표 : y좌표값에서 사각형 길이만큼 이동
			setPoint(3,?,?) 호출 => x좌표 : x좌표값, y좌표 : y좌표값에서 사각형 길이만큼 이동

*/