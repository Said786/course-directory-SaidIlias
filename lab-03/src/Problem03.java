import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st number? ");
        int num1 = scan.nextInt();

        System.out.print("2nd number? ");
        int num2 = scan.nextInt();

        System.out.print("3rd number? ");
        int num3 = scan.nextInt();

        int max = 0;

        if (num1 > num2){
            if(num1 > num3){
                max = num1;
            }else {
                max = num3;
            }
        }else {
            if (num2 > num3){
                max = num2;
            } else {
                max = num3;
            }
        }

        System.out.printf("The value %d is the greatest one.%n",max);
    }
}
