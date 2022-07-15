import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 3000; // стоимость билета
        int milePrice = 20; // каждые 20 рублей потраченные на билет = 1 миля
        int milesBonus = ticketPrice/milePrice;
        System.out.println(milesBonus + " бонусных миль");

    }
}
