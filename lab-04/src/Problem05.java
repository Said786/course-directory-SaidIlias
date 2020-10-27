import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Year? ");
        int year = scan.nextInt();

        System.out.println("Month? ");
        int month = scan.nextInt();

        int days = 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
                days = 30;
                break;

            case 2:

               // days = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
                    days = 29;
                }else {
                    days = 28;
                }
                    break;
            default:
                System.out.println("Invalid month number ");
                break;
        }

        System.out.println("Number of days: " + days );
    }
}
