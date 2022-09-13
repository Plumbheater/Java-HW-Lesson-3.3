import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int months = 12;
        double paid = service.calculate(amount, months);
        System.out.println(paid);

    }

}
