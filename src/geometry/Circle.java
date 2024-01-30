package geometry;

public class Circle extends Shape {

	 double radius;

	public Circle(double xCords, double yCords, double radius) {
		super(xCords, yCords);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	public double calculateCircumference() {
		return 2 * radius * Math.PI;
	}
	
	public double calculateArea(){
		 return radius *radius * Math.PI;
	 
	}
	}
	 
	 
	 

