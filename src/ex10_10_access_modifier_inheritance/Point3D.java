package ex10_10_access_modifier_inheritance;


public class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
		
	}
	
	// int getX() {
		//return x;
	//}
	// **오류 발생 이유 더 넓거나 같은 크기의 접근제어자 사용해야하는데 그렇지 않아서
	//	>> 상속 하는 point가 protected로 받기때문에
	//		protected로 받거나 더 큰 범위인 public으로 받아야한다.
	//		* 안쓰게 되면 default라 더 작은 범위로 받게됨
	//int getY() {
		//return y;
	//}
	
	int getZ() {
		return z;
	}
}
