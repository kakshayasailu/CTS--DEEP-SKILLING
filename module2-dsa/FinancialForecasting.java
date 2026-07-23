public class FinancialForecasting {

    public static void main(String[] args) {

        double amount = 10000;
        double rate = 0.10;
        int years = 5;

        for (int i = 1; i <= years; i++) {
            amount = amount * (1 + rate);
        }

        System.out.printf("Future Value: %.2f%n", amount);
    }
}