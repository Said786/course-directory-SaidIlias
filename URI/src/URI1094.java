import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int coelho = 0, rato = 0, sapo = 0;
        int experiments = scan.nextInt();
        for (int i = 0; i < experiments; i++) {
            int amount = scan.nextInt();
            String type = scan.next();
            switch (type) {
                case "C":
                    coelho += amount;
                    break;
                case "R":
                    rato += amount;
                    break;
                case "S":
                    sapo += amount;
                    break;
            }
        }
        int total = coelho + rato + sapo;
        double coelhoRatio = (double) coelho / total * 100.0;
        double ratoRation = (double) coelho / total * 100.0;
        double sapoRatio = (double) coelho / total * 100.0;

        System.out.printf("Total: %d cobaias\n" +
                "Total de coelhos: %d%n" +
                "Total de ratos: %d%n" +
                "Total de sapos: %d%n" +
                "Percentual de coelhos: %.2f %%%n" +
                "Percentual de ratos: %.2f%n %%%n" +
                "Percentual de sapos: %.2f %%%n", total, coelho, rato, sapo, coelhoRatio, ratoRation, sapoRatio);

    }
}
