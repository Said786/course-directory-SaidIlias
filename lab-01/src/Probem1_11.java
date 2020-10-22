public class Probem1_11 {
    public static void main(String[] args) {

        //one birth every 7 second
        //one death every 13 second
        //one migrant every 45 second

        int current_population = 312032486;

        double second_in_one_year = 60 * 60 * 24 * 365;

        double total_birth_in_one_year = second_in_one_year / 7.0;
        double total_death_in_one_year = second_in_one_year / 13.0;
        double total_migrant_in_one_year = second_in_one_year / 45.0;


        double first_year_population = (current_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        double second_year_population = (first_year_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        double third_year_population = (second_year_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        double fourth_year_population = (third_year_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        double fifth_year_populaiton = (fourth_year_population+ total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;

        System.out.printf( " 1st year is %.0f people.\n", first_year_population);
        System.out.printf( " 2nd year is %.0f people.\n", second_in_one_year );
        System.out.printf( " 3th year is %.0f people.\n", third_year_population );
        System.out.printf( " 4th year is %.0f people.\n", fourth_year_population );
        System.out.printf( " 5th year is %.0f people.\n", fifth_year_populaiton );




    }
}
