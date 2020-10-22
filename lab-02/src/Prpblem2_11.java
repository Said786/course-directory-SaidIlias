import java.util.Scanner;

public class Prpblem2_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter the number of years: ");
        int year = scan.nextInt();

        double initial_population =312032486;

        double second_in_one_year = 60 * 60 * 24 * 365;

        double total_birth_in_one_year = second_in_one_year / 7.0;
        double total_death_in_one_year = second_in_one_year / 13.0;
        double total_migrant_in_one_year = second_in_one_year / 45.0;

        double new_population_range = (total_birth_in_one_year + total_migrant_in_one_year)-total_death_in_one_year;

        for (int x = 0 ; x < year; x++){
            initial_population += new_population_range;

        }
        System.out.printf("The population in %d years is %.0f ",year, initial_population);

    }
}
