import java.util.Scanner;

class Students {
    Scanner input = new Scanner(System.in);
    int roll_no;
    String name;
    void getInfo() {
        System.out.print("Enter Name :: ");
        name = input.nextLine();
        System.out.print("Enter Roll No. :: ");
        roll_no = input.nextInt();
    }
}

class Marks extends Students {
    int phy,chem,maths,computer,assign;
    void getMarks() {
        System.out.print("Enter Marks of Physics :: ");
        phy = input.nextInt();
        System.out.print("Enter Marks of Chemistry :: ");
        chem = input.nextInt();
        System.out.print("Enter Marks of Mathematics :: ");
        maths = input.nextInt();
        System.out.print("Enter Marks of Computer Science :: ");
        computer = input.nextInt();

        System.out.print("Enter Marks of Co-curricular Acitivities/Assignments :: ");
        assign = input.nextInt();
    } 
}

class Results extends Marks { 
    int total_marks;
    float avg;
   
    void getDetails() {
        getInfo();
        getMarks();
    }

    int TotalMarks() {
        total_marks = phy+chem+maths+computer+assign;
        return total_marks;
    }
    
    float AverageMarks() {
        int x = TotalMarks();
        avg = total_marks/5.0f;
        return avg;
    }

    void displayDetails() {
        
        System.out.println("\n\t    ANNUAL MARKSHEET");
        System.out.println("*****************************************");
        System.out.println("Name  \t : "+name);
        System.out.println("Roll No. : "+roll_no);
        System.out.println("-----------------------------------------\n");
        System.out.println("PHYSICS \t\t\t:  "+phy);
        System.out.println("CHEMISTRY \t\t\t:  "+chem);
        System.out.println("MATHEMATICS \t\t\t:  "+maths);
        System.out.println("COMPUTER SCIENCE \t\t:  "+computer);
        System.out.println("CO-CURRICULAR / ASSIGNMENTS \t:  "+assign);
        System.out.println("\n*****************************************");
        System.out.println("TOTAL MARKS OBTAINED (out of 500) :  "+TotalMarks());
        System.out.printf("PERCENTAGE OBTAINED :  %.2f %% \n", AverageMarks());
        System.out.println("\n*****************************************");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Results student = new Results();
        student.getDetails();
        student.displayDetails();
    }
}
