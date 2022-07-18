import java.util.Scanner;
import java.util.ArrayList;

class AscendingOrder {

	static void display(ArrayList<Integer> list) {
		for(int i=0; i < list.size(); i++){
				System.out.print(list.get(i)+"  ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    
        System.out.print("Enter the size of the Array: ");
        int size = input.nextInt();
        System.out.println("Enter "+size+" Elements: ");
        for(int i=0; i < size; i++){
            list.add(input.nextInt());
        }
        display(list);
    
    // Sorting in Ascending Order!
        int n = list.size();
			for(int i=0; i < n-1; i++){
				for(int j=0; j < n-1-i; j++){
					if(list.get(j) > list.get(j+1)){
                		Integer temp;
						temp = list.get(j);
						list.set(j, list.get(j+1));
                		list.set(j+1, temp);
					}
				}
			}
    	display(list);
	}
}