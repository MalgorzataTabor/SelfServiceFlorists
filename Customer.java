import Flower.Flower;

import java.util.HashMap;

public class Customer {
    private ShoppingCart shoppingCart;
    private String imie;
    private int money;

    public Customer(String imie, int money) {
        shoppingCart = new ShoppingCart(this);
        this.imie = imie;
        this.money = money;

    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getImie() {
        return imie;
    }

    public int getMoney() {
        return money;
    }

    public void get(Flower flower) {
        shoppingCart.addFlower(flower);
    }

    public void pay() {

        shoppingCart.usunKwiatyKtorychNieZnamyCeny();
        money -= shoppingCart.obliczCeneZakupow();
    }

    public void pack(Box pudełkoKlienta) {

        pudełkoKlienta.włozenieListyKwiatówDoPudełka(getShoppingCart().getKwiaty());
        shoppingCart.setKwiaty(new HashMap<>());
    }
}

