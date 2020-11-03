import java.util.Scanner;

public class Problem3_23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter two point: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        boolean inRectangle = (Math.pow(Math.pow(x,2),0.5) <= 10.0 /2) ||
                (Math.pow(Math.pow(y,2),0.5) <= 10.0 /2);

        if(inRectangle){
            System.out.printf("Point (%.1f, %.1f is in rectangle", x, y);
        }else
            System.out.printf("Point (%.1f, %.1f is not in rectangle", x, y);


    }
}
