import java.util.Scanner;

class DecimalToBinary {

	static void ConvertDecToBin(int x) {
		int []BinaryArray = new int[100];
		int i=0;
		
// For Storing Remainders	
		while(x > 0) {										
			BinaryArray[i] = x%2;
			x = x/2;
			i++;
		}
// For Printing in Reverse Order
		System.out.print("Binary Equivalent: ");
		for (int j=i-1; j >= 0; j--) {					
			System.out.print(BinaryArray[j]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Decimal Number:  ");
		int x = input.nextInt();

		System.out.println("\nDecimal: "+x);
		ConvertDecToBin(x);

	}
}