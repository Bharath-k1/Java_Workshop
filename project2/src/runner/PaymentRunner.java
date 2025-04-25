package runner;

import things.Payment;

import java.time.LocalDateTime;

public class PaymentRunner {
    public static void main(String[] args) {
        System.out.println("payments details are..");
        Payment.dispalyPaymentInformation();
        Payment.dispalyPaymentAmount(2000);
        Payment.dispalyTransactionDetails(3000, LocalDateTime.now());
    }
}
