import java.util.Scanner;

public class Problem3_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = scan.nextDouble();

        if (weight > 0 && weight <= 1){
            System.out.println("shipping cost will be 3.5$ ");
        }else if (weight > 1 && weight <= 3){
            System.out.println("shipping cost will be 5.5$ ");
        }else if (weight > 3 && weight <= 10){
            System.out.println("shipping cost will be 8.5$");
        }else if (weight > 10 && weight <= 20){
            System.out.println("shipping cost will be 10.5$");
        }else
            System.out.println("the package cannot be shipped.");



    }
}
