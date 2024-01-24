package ex10_09.main;
import ex10_09.geometry.shape.Square;

public class AccessControlExample0_error{
	public static void main(String args[]) {
		// 다른 패키지에서 protected 생성자 접근 불가합니다.
		// Polygon obj = new Polygon(4);
		// 위의 문 주석풀면 protected 로 보호되어 접근 불가하므로 에러남
		

		Square obj = new Square(100,200,15);
		
		for(int i=0;i<4;i++) {
			System.out.println("X["+i+"]="+obj.x[i]+","+"Y["+i+"]="+obj.getY(i));
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("point" + (i+1) +"="+ "("+obj.x[i]+","+obj.getY(i)+")");
		}
	}
		
		
}
