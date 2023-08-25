package section18.exercises.model.services;

public class PaypalService implements OnlinePaymentService {

    public double paymentFee(double amount) {
        return amount + (amount * 0.02);
    }

    @Override
    public double interest(double amount, int months) {
        return amount * (0.01 * months);
    }

}
