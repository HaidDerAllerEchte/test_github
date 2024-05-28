package exeptions;

public class Aufgabe6_3 {
	
	public static double divide(double x, double y) throws ArithmeticException {
		return x/y;
		
		
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(divide(4,5));
		}catch(ArithmeticException lokal){
			System.out.println("Die gesamtanzahl darf nicht 0 sein");
	}

}
}