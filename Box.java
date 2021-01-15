import Flower.Flower;

import java.util.Map;

public class Box {

    private Map<Flower, Integer> kwiaty;
    private Customer customer;

    public Box(Customer customer) {

        this.customer = customer;
        kwiaty = customer.getShoppingCart().getKwiaty();
    }

    public void włozenieListyKwiatówDoPudełka(Map<Flower, Integer> kwiaty) {
        this.kwiaty = kwiaty;
    }

    @Override
    public String toString() {
        if (kwiaty.size() == 0) {
            return "wózek włąsciela " + customer.getImie() + " --- pusty";

        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("Wózek włąciciela " + customer.getImie() + "\n");
            for (Flower flower : kwiaty.keySet()) {
                builder.append(flower + "\n");

            }
            return builder.toString();
        }

    }
}
