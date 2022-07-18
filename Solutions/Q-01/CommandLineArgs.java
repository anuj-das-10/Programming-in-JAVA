class CommandLineArgs{
	public static void main(String[] args){
	int []x = new int[100];
	int sum=0;
	for(int i=0; i<args.length; i++){
		x[i] = Integer.parseInt(args[i]);
		sum += x[i];
	}
	
	System.out.println("The Sum of Integers: "+sum); 
	}
}






