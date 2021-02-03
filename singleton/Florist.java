package singleton;

public class Florist {

    public Florist() {

        PriceList p = PriceList.getInstance();
        p.set("Rose", 5);
        p.set("Orchid", 12);
        p.set("Lilac", 8);
    }

}
