public class Probem1_11 {
    public static void main(String[] args) {

        //one birth every 7 second
        //one death every 13 second
        //one migrant every 45 second

        int current_population = 312032486;

        int second_in_one_year = 60 * 60 * 24 * 365;

        int total_birth_in_one_year = second_in_one_year / 7;
        int total_death_in_one_year = second_in_one_year / 13;
        int total_migrant_in_one_year = second_in_one_year / 45;

        int first_year_population = (current_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        int second_year_population = (first_year_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        int third_year_population = (second_year_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        int fourth_year_population = (third_year_population + total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;
        int fifth_year_populaiton = (fourth_year_population+ total_birth_in_one_year + total_migrant_in_one_year) - total_death_in_one_year;

        System.out.println( " 1st year is "+ first_year_population + " people.");
        System.out.println( " 1st year is "+ second_in_one_year + " people.");
        System.out.println( " 1st year is "+ third_year_population + " people.");
        System.out.println( " 1st year is "+ fourth_year_population + " people.");
        System.out.println( " 1st year is "+ fifth_year_populaiton + " people.");




    }
}
