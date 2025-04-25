package things;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Payment {
    public static String paymentFrom;
    public static String paymentTo;
    public static double amount;
    public static LocalDate transactionDate;
    public static LocalTime transactionTime;


    public static void dispalyPaymentInformation() {
        paymentFrom = "XYZ";
        paymentTo = "ABC";
        amount = 1000;
        transactionDate = LocalDate.now();
        transactionTime = LocalTime.now();

        System.out.println("payment From:" + paymentFrom);
        System.out.println("payment To:" + paymentTo);
        System.out.println("payment From:" + amount);
        System.out.println("payment From:" + transactionDate);
        System.out.println("payment From:" + transactionTime);


    }

    public static void dispalyPaymentAmount(double amount) {
        System.out.println("paid amount is" + amount);
    }

    public static void dispalyTransactionDetails(double amount, LocalDateTime paymentdoneon) {
        System.out.println("paid amount is" + amount);
        System.out.println("paid Done on" + paymentdoneon);

    }

}