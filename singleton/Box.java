package singleton;

import singleton.Flowers.Flower;

import java.util.Map;

public class Box {

    private Map<Flower, Integer> kwiaty;
    private Customer customer;

    public Box(Customer customer) {

        this.customer = customer;
        kwiaty = customer.getShoppingCart().getKwiaty();
    }

    public void listOfFlowersInABox(Map<Flower, Integer> kwiaty) {
        this.kwiaty = kwiaty;
    }

    @Override
    public String toString() {
        if (kwiaty.size() == 0) {
            return "Trolley " + customer.getName() + " --- empty";

        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("Owner trolley  " + customer.getName() + "\n");
            for (Flower flower : kwiaty.keySet()) {
                builder.append(flower + "\n");

            }
            return builder.toString();
        }

    }
}
