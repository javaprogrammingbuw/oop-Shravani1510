package oop;

public class Line2D {
	Point2D A, B;
	
	public Line2D(Point2D A, Point2D B) {
		this.A=A;
		this.B =B;
	}
	
	public double getLength() {
        double d = Math.sqrt(Math.pow(B.getx()-A.getx(), 2)+Math.pow(B.gety()-A.gety(), 2));
		return d;
	}
}
