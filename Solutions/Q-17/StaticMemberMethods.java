import java.util.Scanner;

class DemoStatic {
	static final float PI = 3.14f;							//static data member 
	
	static String ReverseString(String str) {				// static method
		char ch=' ';
		String strrev="";
		for(int i = str.length()-1; i >= 0; i--) {
			ch = str.charAt(i);
			strrev += ch;
		}
		return strrev;
	}

	static void PalindromeCheck(String str) {				// static method
		String strEntered = str;
		String RevString = ReverseString(str);
		if(strEntered.equals(RevString)) {
			System.out.println("\nIt is a Palindrome.");
		}
		else {
			System.out.println("\nIt is not a Palindrome.");
		}
	}
}

class StaticMemberMethods{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("\nThe value of PI is " + DemoStatic.PI+"\n");
		System.out.print("Enter a String to Check:  ");
		String str = input.nextLine();
		System.out.println("\nGiven String is: "+str);
		String revString = DemoStatic.ReverseString(str);
		System.out.println("Reversed String is : "+revString);
		DemoStatic.PalindromeCheck(str);
		
	}
}