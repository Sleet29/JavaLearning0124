package ex10_10_access_modifier_inheritance;

public class Point {
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	protected int getX() {
		return x;
	}

	protected int getY() {
		return y;
	}
}
