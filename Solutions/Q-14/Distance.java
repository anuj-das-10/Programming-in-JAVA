import java.lang.Math;
import java.util.Scanner;

class Distance {
    int x1, x2, y1, y2;
    Distance(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    void Distance_betwn_coordinates() {
    float distance = (float) Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
    System.out.printf("\nDistance Between P1(%d,%d) and P2(%d,%d) is  %.2f",x1, y1, x2, y2, distance);
    }



    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Co-ordinates of P1(x1,y1):  ");
        System.out.print("x1 : ");
            x1 = input.nextInt();
        System.out.print("y1 : ");
            y1 = input.nextInt();

        System.out.println("\nEnter Co-ordinates of P2(x2,y2):  ");
        System.out.print("x2 : ");
            x2 = input.nextInt();
        System.out.print("y2 : ");
            y2 = input.nextInt();


        Distance coordinates = new Distance(x1, y1, x2, y2);
        coordinates.Distance_betwn_coordinates();
    }

}