import java.util.Scanner;

class RecursiveFibonacci {

	public static int fibo(int x) {
		if(x == 0 || x == 1) 
      		return 0;
   		if(x == 2 || x == 3) 
     		return 1;
  
	  return fibo(x-1) + fibo(x-2);
	}

public static void main(String[ ] args) {
	System.out.print("Enter the number of terms:  ");
	int terms = new Scanner(System.in).nextInt();
	
	 System.out.println("FIBONACCI SERIES:  ");	
		for (int i = 1; i <= terms; i++) {
      		System.out.print(fibo(i) + "  ");
    	}
	}
}