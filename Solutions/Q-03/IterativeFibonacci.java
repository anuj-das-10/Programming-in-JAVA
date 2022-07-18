import java.util.Scanner;

class IterativeFibonacci {
	public static void main(String[ ] args) {
		System.out.print("Enter the number of terms:  ");
		int terms = new Scanner(System.in).nextInt();
		int num1 = 0, num2 = 1, num3;

		System.out.println("FIBONACCI SERIES:  ");
		
		if(terms == 0 || terms == 1)
			System.out.print(num1+ "  ");
		else {
			System.out.print(num1 + "  " + num2 + "  ");
			for(int i=2; i < terms; i++) {
				num3 = num1 + num2;
				System.out.print(num3 + "  ");
				num1 = num2;
				num2 = num3;
			}

		}
	}
}