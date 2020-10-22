import java.util.Scanner;

public class Problem2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int total_minutes = scan.nextInt();

        //60min * 24hour = 1440 minute in a day.
        //1440min * 365day = 525600 min in year.

        int year = total_minutes / 525600;
        int days = total_minutes / 1440 ;
        int remainDay = days % 365;


        System.out.printf("%d minutes is approximately %d years and %d days", total_minutes, year,remainDay);

    }
}
