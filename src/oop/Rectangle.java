package oop;

public class Rectangle implements iForm {
	Line2D L1,L2;
	
	public Rectangle(Line2D L1, Line2D L2) {
		this.L1=L1;
		this.L2 =L2;
	}
	
	@Override
	public double area() {
		return L1.getLength()*L2.getLength();
	}

	@Override
	public double circumference() {
		return 2*(L1.getLength()+L2.getLength());
	}

}
