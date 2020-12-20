
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Year? ");
        int year = scan.nextInt();

        System.out.println("Month? ");
        int month = scan.nextInt();

        int result = getDaysOfMonth(year,month);
        if (result == -1) {
            System.err.println("Invalid month number ");
            System.exit(1);
        }
        System.out.println(result);


    }
    public static int getDaysOfMonth(int year, int month){

        int days;
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

                days = isLeapYear(year) ? 29 : 28;
                break;

            default:
                days = -1;
                break;
        }
        System.out.println("Number of days " + days);

        return  days;
    }

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
    }

}
