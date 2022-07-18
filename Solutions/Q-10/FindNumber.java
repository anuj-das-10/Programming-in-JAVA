import java.util.Scanner;
import java.util.ArrayList;

class FindNumber {

	public static int searchNumber(ArrayList<Integer> list, int num) {
		for(int i=0; i < list.size(); i++) {

            if(list.get(i) == num) {
            	return (i+1);
            }
        }
       	return 0;
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter the size of Array: ");
        int size = input.nextInt();
        System.out.println("Enter "+size+" Elements: ");
        for(int i=0; i < size; i++) {
            list.add(input.nextInt());
        }
	// Displaying ArrayList
    	for(int i=0; i < list.size(); i++){
		System.out.print(list.get(i)+"  ");
		}
		System.out.print("\n");

		System.out.print("Enter the number to be searched:   ");
		int num = input.nextInt();

		if(searchNumber(list,num) == 0) {
			System.out.println(num+" not found in this given ArrayList!!");
		}
		else {
			System.out.println(num+" found at position:  "+searchNumber(list,num));
		}
	}
}