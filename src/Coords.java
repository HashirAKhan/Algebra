public class Coords {
	// Instance variables, also called fields
	// Similar to properties of an object in JavaScript
	private double x;
	private double y;
	
	// Object constructors
	public Coords(double xValue, double yValue) {
		x = xValue;
		y = yValue;
	}
	
	public Coords() {
		x = 0;
		y = 0;
	}
	
	public Coords(double value) {
		x = value;
		y = value;
	}
	
	public Coords(Coords other) {
		x = other.x;
		y = other.y;
	}
	
	// Object methods
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public boolean equals(Coords other) {
		return this.x == other.x && this.y == other.y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double xValue) {
		this.x = xValue;
	}
	
	public void setY(double yValue) {
		this.y = yValue;
	}
	
	public void reflectOnX() {
		this.y = -y;
	}
	
	public void reflectOnY() {
		this.x = -x;
	}
	
	public void reflectOnOrigin() {
		this.x = -x;
		this.y = -y;
	}
	
	public void translatePoint(double horz, double vert) {
		this.x += horz;
		this.y += vert;
	}
	
	public void dilatePoint(double factor) {
		this.x *= factor;
		this.y *= factor;
	}
	
	public double distanceFrom(Coords second) {
		return Math.sqrt(Math.pow((this.x - second.x), 2) + Math.pow((this.y - second.y), 2));
	}
}