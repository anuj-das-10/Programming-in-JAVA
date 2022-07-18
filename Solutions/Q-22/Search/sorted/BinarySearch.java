package Search.sorted;

public class BinarySearch {
	public void BinarySearch(int[] arr, int x){
		 int beg=0, end=(arr.length -1);
        int mid = (int)(beg+end)/2;
        
        while(beg<=end && arr[mid]!=x) {
        if(x < arr[mid])
			 end = mid-1;
		else
		 	 beg = mid+1;	
		
		mid = (int)((beg+end)/2);
        }
        
    if(arr[mid] == x) 
		System.out.println(x +" found at position "+(mid+1));
	else
		System.out.println(x +" not found in this array!");
    }
}