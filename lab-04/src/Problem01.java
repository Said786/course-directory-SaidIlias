public class Problem01 {
    public static void main(String[] args) {
        double sum = 0.0;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;

        if(Math.abs(sum - 1.0) < 0.0000001 ){
            System.out.println("Equal ");
        }else
            System.out.println("Not equal ");

    }
}
