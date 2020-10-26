import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double number = scan.nextDouble();

        if (0.000000 <= number && number <= 25.000000 ){
            System.out.println("Intervalo (0,25]");
        } else  if (25.000001 <= number && number <= 50.00000000 ){
            System.out.println("Intervalo (25,50]");
        }else  if (50.000001 <= number && number <= 75.00000000 ){
            System.out.println("Intervalo (50,75]");
        }else  if (75.000001 <= number && number <= 100.00000000 ){
            System.out.println("Intervalo (75,100]");
        }else
            System.out.println("Fora de intervalo");

    }
}
