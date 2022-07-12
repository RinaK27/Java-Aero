import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int price = 3000; // стоимость билета
        int x = 20; // каждые 20 рублей потраченные на билет = 1 миля
        int xx = price / x;
        int miles = (xx); // мили за купленный билет
        System.out.println(miles + " бонусных миль");

    }
}