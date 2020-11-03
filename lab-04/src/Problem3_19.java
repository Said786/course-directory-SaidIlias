import java.util.Scanner;

public class Problem3_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the edges of triangle: ");
        System.out.println("enter the first edge x1, y1");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("enter the first edge x1, y1");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        System.out.println("enter the first edge x1, y1");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);


        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3)
                || (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

        if (!valid){
            System.out.println("The input is invalid ");
        }else {
            System.out.println("Perimeter of triangle is " + (side1 + side2 + side3));
        }

    }
}
