package ex10_01_package;
public class Circle_private { // only public, abstract & final are permitted
	int radius;
	
	Circle_private(int radius){
		this.radius=radius;
	}

	double getArea() {
		return radius*radius*3.14;
	}
}
