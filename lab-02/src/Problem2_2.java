import java.util.Scanner;

public class Problem2_2 {
    public static void main(String[] args) {
        double p = 3.14159, radius, areaOfCylinder, volume, length;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");

        radius = scan.nextDouble();
        length = scan.nextDouble();


        areaOfCylinder = radius * radius * p;
        volume = areaOfCylinder * length;

        System.out.printf("The area is %.4f \n", areaOfCylinder);
        System.out.printf("The volume is %.1f", volume);

    }
}
