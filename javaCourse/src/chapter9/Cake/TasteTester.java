package chapter9.Cake;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("chocolate");
        cake.setPrice(10.99);
        System.out.println("Cake flavor is " + cake.getFlavor());
        System.out.println("Cake price is " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(34.89);
        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price is " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor is " + weddingCake.getFlavor());
        System.out.println("Wedding cake price is  " + weddingCake.getPrice());
    }
}
