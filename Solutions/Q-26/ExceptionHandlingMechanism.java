import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionHandlingMechanism {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1 = 0, y1 = 0;

		try {
			System.out.print("Enter the value of X:  ");
			int x = s.nextInt();
			System.out.print("Enter the value of Y:  ");
			int y = s.nextInt();
			x1=x;
			y1=y;
			float div = x/y;
			System.out.println("The value of "+x+"/"+y+" is "+div);
		}
		catch(InputMismatchException nfe) {
			System.out.println("InputMismatchException Occurred: Value of both X & Y must be an integer!!");
			return;
		}
		catch(ArithmeticException ex) {
			System.out.println("ArithmeticException Occurred: Can not Divided "+ex.getMessage());
		}
		catch(Exception e) {
			System.out.println("Other Exceptions Occurred: "+e.getMessage());
		}

		int sum = x1+y1;
		int sub = x1-y1;
		int mul = x1*y1;

		System.out.println("The value of "+x1+" + "+y1+" is "+sum);
		System.out.println("The value of "+x1+" - "+y1+" is "+sub);
		System.out.println("The value of "+x1+" * "+y1+" is "+mul);
	}
}
