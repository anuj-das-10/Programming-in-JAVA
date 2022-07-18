import java.util.Scanner;

class ExceptionHandling {

static int divide(int x,int y) throws ArithmeticException {
	if(y==0){
		throw new ArithmeticException();
	}
else {
	return x/y;
}
}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y = sc.nextInt();
		int res = divide(x,y);
		System.out.println(x+" / "+y+" = "+res);
	}
	catch(ArithmeticException ae) {
		System.out.println("Arithmetic Exception:	Can not divide an Integer by Zero!!");
	}
	
	System.out.println("\nRemaining Code Executing....");
	}

}