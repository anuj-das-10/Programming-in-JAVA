import java.util.Scanner;

class BinToDec {

    public static void main(String[] args) {
        System.out.print("Enter a Binary Number:  ");
        String binary = new Scanner(System.in).next();
        System.out.println("Equivalent Decimal Number: " + Integer.parseInt(binary,2));

    }
}