import java.util.Scanner;

class RecursiveFactorial {

    static int findFactorial(int x){
        if(x==0) {
            return 1;
        }
        else {
            return x * findFactorial(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:  ");
        int x = input.nextInt();
        System.out.println("The Factorial of "+ x +" is " + findFactorial(x));
    }
}
