import java.util.Scanner;

class SuperA {
	int x, y;
	void getXY() {
		System.out.print("Enter the value of X:  ");
		x = new Scanner(System.in).nextInt();
		System.out.print("Enter the value of Y:  ");
		y = new Scanner(System.in).nextInt();
	}
}

class Sum extends SuperA {
	void sumOfXY() {
		int sum = x + y;
		System.out.println("The sum of "+ x +" and "+ y +" is: "+ sum);
	}
}

class Product extends SuperA {
	void productOfXY() {
		int prod = x * y;
		System.out.println("The product of "+ x +" and "+ y +" is: "+ prod);
	}
}

class HierarchicalInheritance {
	public static void main(String[] args) {
		Sum obj1 = new Sum();
		obj1.getXY();
		obj1.sumOfXY();

		System.out.println("\n");

		Product obj2 = new Product();
		obj2.getXY();
		obj2.productOfXY();
	}
}