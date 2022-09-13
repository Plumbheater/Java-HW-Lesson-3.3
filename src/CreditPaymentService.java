public class CreditPaymentService {
    public double calculate(int amount, int months) {
        double result;
        double x = 9.99 / 100 / 12;

        if (amount > 0) {
            result = amount * (x * (Math.pow(1 + x, months) / (Math.pow(1 + x, months) - 1)));
        } else {
            result = 0;
        }
        return (int) Math.round(result);

    }
}

