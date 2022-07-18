import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class ReadFileContent{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.print("Provide Path(C:\\\\..) or Enter File Name with Extension(if present in the same directory):  ");
        String fileName = input.nextLine();                  
	File readMyFile = new File(fileName);
		
	try{
		Scanner s = new Scanner(readMyFile);
		while(s.hasNextLine()){
			String line = s.nextLine();
			System.out.println(line);
		}
		s.close();
	}	
	catch(FileNotFoundException e){
			e.printStackTrace();
	}
	}
}
