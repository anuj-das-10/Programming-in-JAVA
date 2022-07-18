import java.util.Scanner;

class AscendingOrder {

	public static void display(int arr[], int size) {
		for(int i=0; i < size; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("");
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array:  ");
		int size = sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter "+size+" Elements:");
		for(int i=0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		display(arr,size);

	// Sorting in Ascending Order! 
		for(int i=0; i < size-1; i++) {
			for(int x=0; x<size-1-i; x++) {
				if(arr[x] > arr[x+1]) {
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
			}
		}

		display(arr,size);
	}
}