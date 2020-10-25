import java.util.Scanner;

public class Problem3_22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter a point with two coordinates: ");
        double point_1 = scan.nextDouble();
        double point_2 = scan.nextDouble();

        int Distance = (int) (Math.pow(Math.pow(point_1,2)+Math.pow(point_2,2),0.5));

        if (Distance <= 10){
            System.out.printf("Point (%.1f %.1f) is in the circle%n", point_1, point_2);

        }else
            System.out.printf("Point (%.1f %.1f) is not in the circle%n", point_1, point_2);


    }
}
