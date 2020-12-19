public class Problem10 {
    public static void main(String[] args) {
        final int Number_of_primes = 50;
        final int Number_of_primes_per_line = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");


        while (count < Number_of_primes) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++ ){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;

                if (count % Number_of_primes_per_line == 0){
                    System.out.println();
                }
                else
                    System.out.print(number +  " ");
            }
            number++;
        }

    }
}
