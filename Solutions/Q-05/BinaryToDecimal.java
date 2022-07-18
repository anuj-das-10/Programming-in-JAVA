import java.lang.Math;
import java.util.Scanner;

class BinaryToDecimal {
    static int convertToDec(String bin) {
        int[] binArray = new int[1024];
        int eqv_dec = 0;
    
        for (int i = bin.length() - 1; i >= 0; i--) {
            binArray[i] = Character.getNumericValue(bin.charAt(i));
        }

        for (int i = 0; i < bin.length(); i++) {
            if (binArray[i] == 1) 
                eqv_dec += (int)Math.pow(2, bin.length()-1 - i);
            else
                continue;
        }
        return eqv_dec;
    }

    // Driver Code!
    public static void main(String[] args) {
        System.out.print("Enter Binary Number:  ");
        String bin = new Scanner(System.in).next();
        System.out.println("Given Binary: " + bin);
        int eqv_dec = convertToDec(bin);
        System.out.println("Equivalent Decimal Number: " + eqv_dec);
    }
}
