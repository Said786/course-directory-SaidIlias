import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("some real number? ");
        double num = scan.nextDouble();

        double absNum = num;
        if(num < 0 ){

            absNum = -absNum;
        }

        System.out.printf("|%.3f| = %.3f", num , absNum);


    }
}
