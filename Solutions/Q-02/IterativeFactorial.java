import java.util.Scanner;

class IterativeFactorial {

    static int findFactorial(int x) {
    int fact = 1;
       for(int i=x; i > 0; i--) {
        fact *= i;
       }
       return fact;
     }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:  ");
        int x = input.nextInt();
        System.out.println("The Factorial of "+ x +" is " + findFactorial(x));
    }
 }