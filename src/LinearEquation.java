import javax.print.attribute.standard.MediaSize.Other;

public class LinearEquation {
	private double a;
	private double b;
	private double c;
	
	//Constructors	
	public LinearEquation(double aValue, double bValue, double cValue) {
		this.a = aValue;
		this.b = bValue;
		this.c = cValue;
	}
	
	public LinearEquation(LinearEquation second) {
		this.a = second.a;
		this.b = second.b;
		this.c = second.c;
	}
	
	public LinearEquation(double slope, Coords point) {
		this.a = -slope;
		this.b = 1;
		this.c = slope * point.getX() - point.getY();
	}
	
	//Accessors	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getSlope() {
		return -a/b;
	}
	
	public double getXIntercept() {
		return -c/a;
	}
	
	public double getYIntercept() {
		return -c/b;
	}
	
	public String toString() {
		return a + "x + " + b + "y + " + c + " = 0";
	}
	
	public boolean hasSlope() {
		return b != 0;
	}
	
	public boolean isHorizontal() {
		return a == 0 && b != 0;
	}
	
	public boolean isVertical() {
		return b == 0 && a != 0;
	}
	
	public boolean equals(LinearEquation second) {
		if (this.isVertical() && second.isVertical()) {
			return this.getXIntercept() == second.getXIntercept();
		} else {
			return this.getSlope() == second.getSlope() && this.getYIntercept() == second.getYIntercept();
		}
	}
	
	public Coords pointOfIntersection(LinearEquation other) {
		if (this.equals(other)) {
			return null;
		} else if (this.isVertical() && other.isVertical()) {
			return null;
		} else if (this.getSlope() == other.getSlope()) {
			return null;
		} else {
			double d = other.a;
			double e = other.b;
			double f = other.c;
			
			double x;
			
			if (this.isVertical()) {
				x = -c/a;
			} else if (other.isVertical()) {
				x = -f/d;
			} else {
				x = (b * f - c * e) / (a * e - b * d);
			}
			
			double y = -(a/b) * x - (c/b);
			
			return new Coords(x ,y);
		}		
	}	
}