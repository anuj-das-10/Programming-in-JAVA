import java.util.Scanner;

class BinToHex {
int binaryToDecimal(long binary) {	
	int decimalNumber = 0, i = 0;
	while (binary > 0) {
		decimalNumber += Math.pow(2, i++) * (binary % 10);
		binary /= 10;
	}
	return decimalNumber;
}
	
String decimalToHex(long binary) {
	int decimalNumber = binaryToDecimal(binary);
	char arr[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
	int remainder, i = 0;

	String hexNumber = "";

		while (decimalNumber != 0) {
		remainder = decimalNumber % 16;
			if(remainder >= 10)
				hexNumber = arr[remainder-10] + hexNumber;
			else
				hexNumber = remainder + hexNumber;

		decimalNumber /= 16;
		}
	return hexNumber;
}


public static void main(String[] args) {
		BinToHex ob = new BinToHex();
		System.out.print("Enter a Binary Number:  ");
		long bin = new Scanner(System.in).nextLong();
		System.out.println("Given Binary: " + bin);
		System.out.println("Hexadecimal : " + ob.decimalToHex(bin));
	}
}
