import java.io.*;
import java.util.Scanner;

public class CopyFileContent {

     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            System.out.print("Provide Source File with Extension:  ");
            String source_fileName = sc.nextLine();
            System.out.print("Provide Destination File with Extension:  ");
            String destination_fileName = sc.nextLine();

        File readMyFile = new File(source_fileName);
        
        try {
            Scanner sourceFile = new Scanner(readMyFile);
            FileWriter fw = new FileWriter(destination_fileName);

            while(sourceFile.hasNextLine()){
                String line = sourceFile.nextLine();
                fw.write(line+"\n");
            }
            fw.close();
            sourceFile.close();
            System.out.println("\nContents of  \""+source_fileName+"\"  successfully copied to  \""+destination_fileName+"\"\n");
        }
        catch(FileNotFoundException e) {
            System.out.println("\nFile not found with the name specified!!\nPlease check and provide the name correctly!\n");
        }
    }
}
