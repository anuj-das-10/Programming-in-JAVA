class Sum {
	int x, y;
	Sum(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void display() {
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
	}
}

class DerivedB extends Sum {
	DerivedB(int x, int y) {
		super(x,y);
	}

	void sumOfXY() {
		int sum = x + y;
		System.out.println("The sum of "+x+" and "+y+" is: " + sum);
	}
}

class SingleInheritance {
	public static void main(String[] args) {
		DerivedB obj = new DerivedB(6,7);
		obj.display();
		obj.sumOfXY();
	}
}