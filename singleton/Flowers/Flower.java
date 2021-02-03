package singleton.Flowers;


import singleton.PriceList;

public abstract class Flower {

    private int howManyFlowers;
    private String name;
    private PriceList priceList;
    private FlowerColor flowerColor;


    public Flower(int howManyFlowers, String name, FlowerColor flowerColor) {
        this.howManyFlowers = howManyFlowers;
        this.name = name;
        this.flowerColor = flowerColor;
        priceList = PriceList.getInstance();
    }

    public int getHowManyFlowers() {
        return howManyFlowers;
    }

    public String getName() {
        return name;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    @Override
    public String toString() {

        Integer price = getPriceList().get(getName());
        if (price == null) {
            price = -1;
        }
        return getName() + " Color: " + getFlowerColor() +
                ", quantity " + getHowManyFlowers()
                + " , price " + price;
    }
}
