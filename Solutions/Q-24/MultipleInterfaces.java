import java.util.Scanner;

interface Area {
	public void calcArea();
}

interface Perimeter {
	public void calcPerimeter();
}

class Circle implements Area, Perimeter{
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}

	public void calcArea() {
		double area = Math.PI * radius * radius;
		System.out.println("The Area of the Circle is "+ area);
	}

	public void calcPerimeter() {
		double peri = 2 * Math.PI * radius;
		System.out.println("The Circumference of the Circle is "+ peri);
	}
}

class Rectangle implements Area, Perimeter{
	int l, b;

	Rectangle(int length, int breadth) {
		l = length;		
		b = breadth;
	}

	public void calcArea() {
		int area = l*b;
		System.out.println("The Area of Rectangle is "+ area);
	}

	public void calcPerimeter() {
		int peri = 2*(l+b);
		System.out.println("The Perimeter of the Rectangle is "+peri);
	}
}

class MultipleInterfaces {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Radius of Circle:   ");
	int radius = sc.nextInt();
	Circle cc = new Circle(radius);
	cc.calcArea();
	cc.calcPerimeter();

	System.out.println("");

	System.out.print("Enter the Length of Rectangle:   ");
	int length = sc.nextInt();
	System.out.print("Enter the Breadth of Rectangle:   ");
	int breadth = sc.nextInt();
	Rectangle rr = new Rectangle(length, breadth);
	rr.calcArea();
	rr.calcPerimeter();
	}
}
