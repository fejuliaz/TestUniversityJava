package chapter10.FruitMarket;

public class Apple extends Fruit {

    public Apple(){
        setCalories(67);
    }

    public void removeSeeds(){
        System.out.println("Seeds are removed");
    }

    @Override

    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
