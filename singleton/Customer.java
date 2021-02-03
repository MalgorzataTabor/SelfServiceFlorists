package singleton;

import singleton.Flowers.Flower;

import java.util.HashMap;

public class Customer {
    private ShoppingCart shoppingCart;
    private String name;
    private int money;

    public Customer(String imie, int money) {
        shoppingCart = new ShoppingCart(this);
        this.name = imie;
        this.money = money;

    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getName() {
        return name;
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

    public void pack(Box customerBox) {

        customerBox.listOfFlowersInABox(getShoppingCart().getKwiaty());
        shoppingCart.setKwiaty(new HashMap<>());
    }
}

