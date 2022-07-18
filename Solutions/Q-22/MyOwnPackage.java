import java.util.Scanner;
import Search.unsorted.LinearSearch;
import Search.sorted.BinarySearch;

class MyOwnPackage {

	static void display(int arr[]) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinearSearch ls = new LinearSearch();
	BinarySearch bs = new BinarySearch();

//	Performing Linear Search on unsorted array 
	System.out.println("LINEAR SEARCH:");
	int unsorted_arr[] = {32, 45, 55, 21, 87, 67, 34};
	display(unsorted_arr);
	int x = 21;
	ls.LinearSearch(unsorted_arr,x);

	System.out.println("\n");

//	Performing Binary Search on sorted array 
	System.out.println("BINARY SEARCH:");
	int sorted_arr[] = {10, 14, 18, 34, 45, 56, 78};
	display(sorted_arr);
	int y = 28;
	bs.BinarySearch(sorted_arr,y);
	
	}
}