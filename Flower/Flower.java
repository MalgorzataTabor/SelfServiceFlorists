package Flower;

public abstract class Flower {

    private int howManyFlowers;
    private String name;
    private FlowerColor color;
    private PriceList priceList;




    public Flower(int howManyFlowers, String name, FlowerColor color) {
        this.howManyFlowers = howManyFlowers;
        this.name = name;
        this.color = color;
        priceList = PriceList.getInstance();
    }

    public int getHowManyFlowers() {
        return howManyFlowers;
    }

    public String getName() {
        return name;
    }

    public FlowerColor getColor() {
        return color;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    @Override
    public String toString() {

        Integer price = getPriceList().get(getName());
        if(price == null ){
            price=-1;}
        return getName() + ". kolor: " +getColor() +
                ", ilość " + getHowManyFlowers()
                + " , cena " + price;
    }
}
