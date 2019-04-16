package oop;

public class Driver {
	public static void main(String[] args) {
		Point2D P1 = new Point2D(6, 5);
		Point2D P2 = new  Point2D(6,4);
		Point2D P3 = new Point2D(3,5);
		
		Line2D L1 = new Line2D(P1, P3);
		Line2D L2 = new Line2D(P3, P2);
		Line2D L3 = new Line2D(P2,P3);
		Rectangle R = new Rectangle(L1, L2);
		System.out.println("area of Rectangle  :" + R.area());
		System.out.println("circumference of Rectangle :" + R.circumference());
		Triangle T = new Triangle(L1, L2, L3);
		System.out.println("area of triangle :" + T.area());
		System.out.println("circumference of Triangle  :" + T.circumference());
	}
}
