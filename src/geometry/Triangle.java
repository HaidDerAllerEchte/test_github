package geometry;

public class Triangle extends Shape{

	public double siteLengthA; 
	public double siteLengthB;
	public double siteLengthC;
	public double hight;
	
	
	
	public Triangle(double xCords, double yCords, double siteLengthA, double siteLengthB, double siteLengthC,
			double hight) {
		super(xCords, yCords);
		this.siteLengthA = siteLengthA;
		this.siteLengthB = siteLengthB;
		this.siteLengthC = siteLengthC;
		this.hight = hight;
	}



	public double getSiteLengthA() {
		return siteLengthA;
	}


	public void setSiteLengthA(double siteLengthA) {
		this.siteLengthA = siteLengthA;
	}


	public double getSiteLengthB() {
		return siteLengthB;
	}


	public void setSiteLengthB(double siteLengthB) {
		this.siteLengthB = siteLengthB;
	}


	public double getSiteLengthC() {
		return siteLengthC;
	}


	public void setSiteLengthC(double siteLengthC) {
		this.siteLengthC = siteLengthC;
	}


	public double getHight() {
		return hight;
	}


	public void setHight(double hight) {
		this.hight = hight;
	}
	
	public double calculateCircumference() {
		return siteLengthA + siteLengthB + siteLengthC;
	}
	
	public double calculateArea(){
		return siteLengthA + hight /2;
		
	}
	
	
	
}
