public class Florist {

    public Florist() {

        PriceList p = PriceList.getInstance();
        p.set("Flower.Rose", 5);
        p.set("Flower.Orchid", 12);
        p.set("Flower.Lilac", 8);
    }

}
