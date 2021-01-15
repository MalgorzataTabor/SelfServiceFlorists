

import Flower.Flower;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCart {
    private Customer owner;
    private PriceList priceList = PriceList.getInstance();
    private Map<Flower, Integer> kwiaty;


    public ShoppingCart(Customer owner) {
        kwiaty = new HashMap<>();
        this.owner = owner;
    }

    public Map<Flower, Integer> getKwiaty() {
        return kwiaty;
    }

    public void setKwiaty(Map<Flower, Integer> kwiaty) {
        this.kwiaty = kwiaty;
    }

    public void addFlower(Flower flower) {
        kwiaty.put(flower, priceList.get(flower.getName()));
    }

    public void usunKwiatyKtorychNieZnamyCeny() {

        Iterator<Map.Entry<Flower, Integer>> iterator = kwiaty.entrySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() == null) {
                iterator.remove();
            }
        }
    }

    public int obliczCeneZakupow() {
        int price = 0;
        for (Flower flower : kwiaty.keySet()) {
            for (int i = 0; i < flower.getHowManyFlowers(); i++) {
                if (price + kwiaty.get(flower) > owner.getMoney())
                    break;
                else
                    price += kwiaty.get(flower);
            }
        }
        return price;
    }

    @Override
    public String toString() {

        if (kwiaty.size() == 0) {
            return "Wózek klienta " + owner.getImie() + " jest pusty ";
        } else {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Wózek klienra " + owner.getImie() + "\n");

            for (Flower flower : kwiaty.keySet()) {
                stringBuilder.append(flower + "\n");


            }
            return stringBuilder.toString();
        }

    }


}


