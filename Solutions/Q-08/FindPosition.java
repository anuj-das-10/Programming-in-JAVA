import java.util.Scanner;

class FindPosition {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num, size;
        System.out.print("Enter the size of the array:  ");
        size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter " + size + " Elements:  ");
        for (int i=0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Given Array:  ");
        for (int i=0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\nEnter the number to search in the array:  ");
        num = sc.nextInt();
        for (int i=0; i < size; i++) {
            if (num == arr[i]) {
                System.out.println(num + " found at position: " + (i+1));
                return;
            }
        }
        System.out.println(num + " not found in this Array!");       
    }
}