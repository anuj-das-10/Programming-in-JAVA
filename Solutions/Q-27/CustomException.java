import java.util.Scanner;

class NegativeRadiusException extends Exception {

	@Override
	public String getMessage() {
		return "Radius can not be Negative!";
	}

	@Override
	public String toString() {
		return "Radius can not be Negative!";
	}
}

class CustomException {

	static void calcCircleArea(int radius) throws NegativeRadiusException {
		if(radius < 0) {
			throw new NegativeRadiusException();
		}
		else {
		double area  = Math.PI * radius * radius;
		System.out.println("The Area of the Circle is "+area);
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the Radius of the Circle:  ");
		int radius = new Scanner(System.in).nextInt();
		try {
			calcCircleArea(radius);
		}
		catch(NegativeRadiusException nre) {
			System.out.println(nre.getMessage());
		}
	}
}