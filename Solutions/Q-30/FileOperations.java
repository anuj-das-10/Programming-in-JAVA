import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileOperations {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader reader = null;
        int charCount = 0, wordCount = 0, lineCount = 0;
        
        try {
            System.out.print("Enter File Name with Extension(must present in the same directory):  ");
            String fileName = input.nextLine();                                    
            reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();              
            while (currentLine != null) {
                lineCount++;                                   
                String []words = currentLine.split(" ");        
                wordCount = wordCount + words.length;           
                for (String word : words) {    
                    charCount = charCount + word.length();      
                }
                 
            currentLine = reader.readLine();                            //Reading next line into currentLine
            }
             
            //Printing Number of Characters, Words and Lines
            System.out.println("FILE DETAILS"); 
            System.out.println("Number Of Characters : "+charCount); 
            System.out.println("Number Of Words      : "+wordCount);
            System.out.println("Number Of Lines      : "+lineCount);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
                try{
                    reader.close();                                     //Closing the reader
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
        }
    }   
}