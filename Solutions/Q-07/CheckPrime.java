import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        System.out.print("Enter an Integer:  ");
        int x = new Scanner(System.in).nextInt();

        if(x == 1) {
            System.out.println(x+" is neither Prime nor Composite!");
            return;
        }
        else {
            for(int i=2; i <= x/2; i++) {
                if(x%i == 0) {
                    System.out.println(x + " is not a Prime Number!");
                    return;
                }
            }
            System.out.println(x + " is a Prime Number!");
        }
    }
}
