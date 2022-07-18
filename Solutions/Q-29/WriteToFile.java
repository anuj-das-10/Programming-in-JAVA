import java.io.*;
import java.util.Scanner;
 
public class WriteToFile {

   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Path(C:\\\\..) or Enter File Name with Extension(if present in the same directory):  ");
        String fileName = sc.nextLine();
       
        try {
            FileWriter fw = new FileWriter(fileName);
                System.out.println("Type Here to write on \""+fileName+"\" :");
                String line = sc.nextLine();
                fw.write(line);
                fw.close();
                System.out.println("\nContents successfully written to  \""+fileName+"\"\n");
        }
        catch(FileNotFoundException e) {
           System.out.println("\nFile not found with the name specified!!\nPlease check and provide the name correctly!\n");
        }
    }
}