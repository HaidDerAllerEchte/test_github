package geometry;

public class Rectangle extends Shape {
	
	private double lenght;
	private double width;
	
	public Rectangle(double xCords, double yCords, double lenght, double width) {
		super(xCords, yCords);
		this.lenght = lenght;
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calculateCircumference() {
		return lenght + width * 2;
	}
	
	public double calculateArea(){
		return lenght * width;
		
	
	}
}
