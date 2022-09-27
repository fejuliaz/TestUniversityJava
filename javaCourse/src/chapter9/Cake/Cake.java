package chapter9.Cake;

public class Cake {

    protected String flavor;
    protected double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake (String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }



}
