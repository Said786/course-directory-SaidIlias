import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int coordinate = scan.nextInt();

        System.out.print("Coordinate of the 1'st point: ");
        int point1 = scan.nextInt();

        System.out.print("Coordinate of the 2'nd point: ");
        int point2 = scan.nextInt();

        int distance1 = abs(coordinate - point1) ;
        int distance2 = abs(coordinate - point2) ;

        if (distance1 < distance2) {

            System.out.printf("The 1'st point is closer. The distance is %d.%n", distance1);
        } else if ( distance2 < distance1) {
            System.out.printf("The 2'nd point is closer. The distance is %d.%n", distance2);
        } else {
            System.out.printf("The distance for two points is the same and equals to %d.%n", distance1);
        }

    }
    public static int abs(int x){
        return x < 0 ? -x : x;
    }
}
