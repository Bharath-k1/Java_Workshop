package things;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
    public static String OrderFrom;
    public static String OrderTo;
    public static double amount;
    public static LocalDate deliveryDate;
    public static LocalTime deliveryTime;


    public static void dispalyOrderInformation(){
        OrderFrom="Flipkart";
        OrderTo = "Bharat";
        amount=1000;
        deliveryDate=LocalDate.now();
        deliveryTime=LocalTime.now();

        System.out.println("Order From:"+OrderFrom);
        System.out.println("Order To:"+OrderTo);
        System.out.println("Order From:"+amount);
        deliveryDate=LocalDate.now();
        System.out.println("Order From:"+deliveryDate);
        System.out.println("Order From:"+deliveryTime);


    }
}


