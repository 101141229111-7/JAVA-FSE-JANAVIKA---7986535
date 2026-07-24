public class Main {

    static double predict(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return predict(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialAmount = 1000;
        double growthRate = 0.10;
        int years = 3;

        double futureValue = predict(initialAmount, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}