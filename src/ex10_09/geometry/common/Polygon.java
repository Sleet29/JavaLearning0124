// protected 구성요소를 포함하는 클래스의 예
// protected가 붙은 변수, 메소드는 동일 패키지 내의 클래스 또는
// 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능
package ex10_09.geometry.common;

public class Polygon{
	public int[] x;
	protected int[] y;
	
	
	protected Polygon(int size) {
		x = new int[size];
		y = new int[size];
	}
	
	protected void setPoint(int index, int x, int y) {
		this.x[index] =x;
		this.y[index] =y;
	
	}
}