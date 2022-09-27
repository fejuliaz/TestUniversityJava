package chapter10.FruitMarket;

public class Banana extends Fruit{

    public Banana(){
        setCalories(106);
    }


    public void peel(){

        System.out.println("Fruit is peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }
}
