package oop;

public class Triangle implements iForm{
	Line2D L1,L2,L3;
	
	public Triangle(Line2D L1, Line2D L2, Line2D L3) {
		this.L1 =L1;
		this.L2 =L2;
		this.L3 = L3;
	}
	
	@Override
	public double area() {	
		return 0.5* L2.getLength()* height();
	}

	@Override
	public double circumference() {
		return L1.getLength()+L2.getLength()+L3.getLength();
	}
	
	public double height() {
//		here i'm using condition for each line separately 
		 if(L1.A==L2.B&&L2.A==L3.B&&L3.A==L1.B);
		 double alpha = Math.acos(-0.5*Math.pow(L1.getLength(), 2)+0.5*Math.pow(L2.getLength(),2)+0.5*Math.pow(L3.getLength(), 2)/(L2.getLength()*L3.getLength()));
	     if(L1.A==L2.B&&L2.A==L3.B&&L3.A==L1.B);
		 double beta = Math.acos(0.5*Math.pow(L1.getLength(), 2)-0.5*Math.pow(L2.getLength(),2)+0.5*Math.pow(L3.getLength(), 2)/(L1.getLength()*L3.getLength()));
		 if(L1.A==L2.B&&L2.A==L3.B&&L3.A==L1.B);
		 double gamma = -beta - alpha + 180;
		 if(L1.A==L2.B&&L2.A==L3.B&&L3.A==L1.B);
	     double height = L2.getLength()*Math.sin(gamma);
	     return height; 
	}
}
