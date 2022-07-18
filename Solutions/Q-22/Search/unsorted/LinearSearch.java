package Search.unsorted;

public class LinearSearch{
	public void LinearSearch(int[] arr, int x){
		for(int i=0; i < arr.length; i++){
		if(arr[i]==x){
		System.out.println(x+" found at position "+(i+1));
		return;
		}
	}
System.out.println(x+" not found in this array!");
}
}