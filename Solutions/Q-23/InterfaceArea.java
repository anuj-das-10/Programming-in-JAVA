import java.util.Scanner;

interface CaculateArea {
	public int CalcArea();
}

class Square implements CaculateArea {					//Implementing Interface
	int s;
	Square(int side) {
		s = side;
	}
	public int CalcArea() {
		int areaC = s*s;
		return areaC;
	}
}

class Rectangle implements CaculateArea {				//Implementing Interface
	int l,b;
	Rectangle(int length, int breadth) {
		l = length;
		b = breadth;
	}
	public int CalcArea() {
		int areaR = l*b;
		return areaR;
	}
}


class InterfaceArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Side of the Square:   ");
		int side = s.nextInt();
		Square sqr = new Square(side);
		System.out.println("The Area of Square is "+ sqr.CalcArea() +" square unit");

		System.out.println("");

		System.out.print("Enter the Length of the Rectangle:   ");
		int length = s.nextInt();
		System.out.print("Enter the Breadth of the Rectangle:   ");
		int breadth = s.nextInt();
		Rectangle rect = new Rectangle(length,breadth);
		System.out.println("The Area of Rectangle is "+ rect.CalcArea() +" square unit");
	}
}