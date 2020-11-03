import java.util.Scanner;

public class Problem3_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.println("enter a three digit number: ");
        int guess = scan.nextInt();

        int lottery_digit_1 = lottery / 100;
        int lottery_remain_digits = lottery % 100;
        int lottery_digit_2 = lottery_digit_1 / 10;
        int lottery_digit_3 = lottery_remain_digits % 10;

        int guess_1 = guess / 100;
        int remain_guess = guess % 100;
        int guess_2 = remain_guess / 10;
        int guess_3 = remain_guess % 10;

        if (lottery == guess){
            System.out.println("Exact match. You won 10000$ ");
        }else if ((lottery_digit_1 == guess_1 && lottery_digit_1 == guess_3 && lottery_digit_3 == guess_3)
                || (lottery_digit_1 == guess_2 && lottery_digit_2 == guess_1 && lottery_digit_3 == guess_3)||
                (lottery_digit_1 == lottery_digit_3 && lottery_digit_2 == guess_2 && lottery_digit_3 == guess_1)
                ||
                (lottery_digit_1 == guess_2 && lottery_digit_2 == guess_3 && lottery_digit_3 == guess_1)
                ||
                (lottery_digit_1 == guess_3 && lottery_digit_2 == guess_1 && lottery_digit_3 == guess_2))
            System.out.print("Random match. You won 5000$");
        else if (lottery_digit_1 == guess_2 || lottery_digit_2 == guess_1 || lottery_digit_3 == guess_3 ||
                lottery_digit_1 == guess_1 || lottery_digit_2 == guess_3 || lottery_digit_3 == guess_2 ||
                lottery_digit_1 == guess_3 || lottery_digit_2 == guess_2 || lottery_digit_3 == guess_1)
        {
            System.out.println("One digit match. You won 1000$ ");
        }
        else
            System.out.println("You lost ");

    }
}
