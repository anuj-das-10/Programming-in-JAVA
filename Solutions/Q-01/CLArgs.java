class CLArgs{
	public static void main(String ...args){
	int sum=0;
	for(String number : args) {
		sum += Integer.parseInt(number);
	}
	
	System.out.println("The Sum of Integers: "+sum); 
	}
}
