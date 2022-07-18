import java.util.Scanner;

class MethodsOverloading {
	public static final float pi = 3.14f;
	
    static int CalculateArea(int side) {
		return side*side;	
	}

	static int CalculateArea(int length, int breadth) {
		return length*breadth;
	}

	static float CalculateArea(int radius, float pi) {
		return pi*radius*radius;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Calculate Area of Square\n2. Calculate Area of Rectangle\n3. Calculate Area of Circle");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
 
		switch(choice){
		case 1: System.out.print("Enter the side of the Square: ");
				int side = input.nextInt();
				int areaS = CalculateArea(side);
				System.out.println("The Area of Square is "+areaS);
				break;

		case 2: System.out.print("Enter the Length of the Rectangle: ");
				int length = input.nextInt();
				System.out.print("Enter the Breadth of the Rectangle: ");
				int breadth = input.nextInt();
				int areaR = CalculateArea(length,breadth);
				System.out.println("The Area of Rectangle is "+areaR);
				break;

		case 3: System.out.print("Enter the Radius of the Circle: ");
				int radius = input.nextInt();
				float areaC = CalculateArea(radius,pi);
				System.out.println("The Area of Circle is "+areaC);
				break;
		}
	}
}
