import java.util.Scanner;

public class Problem3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int t_day = scan.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int add_day = scan.nextInt();

        String day = "";

        int futureDay = (t_day + add_day) % 7;



        if (t_day < 7 && t_day >= 0 ){

            switch (t_day) {
                case 0:
                    day = "Sunday ";
                    break;
                case 1:
                    day = "Monday ";
                    break;
                case 2:
                    day = "Tuesday ";
                    break;

                case 3:
                    day = "Wednesday ";
                    break;

                case 4:
                    day = "Thursday ";
                    break;

                case 5:
                    day = "Friday ";
                    break;
                case 6:
                    day = "Saturday ";
                    break;


            }
            System.out.print("Today is " + day);
        }

        switch (futureDay){
            case 0:
                day = "Sunday ";
                break;
            case 1:
                day = "Monday ";
                break;
            case 2:
                day = "Tuesday ";
                break;

            case 3:
                day = "Wednesday ";
                break;

            case 4:
                day = "Thursday ";
                break;

            case 5:
                day = "Friday ";
                break;
            case 6:
                day = "Saturday ";
                break;


        }
        System.out.print("and the future day is " + day);


    }
}
