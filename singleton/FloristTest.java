package singleton;

import singleton.Flowers.*;

public class FloristTest {

    public static void main(String[] args) {


        Florist kwiaciarnia = new Florist();


        Customer janek = new Customer("Janek", 200);

        janek.get(new Rose(5));
        janek.get(new Orchid(5));
        janek.get(new Freesia(3, FlowerColor.BLACK));
        janek.get(new Lilac(3));

        ShoppingCart wozekJanka = janek.getShoppingCart();
        System.out.println("Przed płaceniem\n" + wozekJanka);


        janek.pay();

        System.out.println("Po zapłaceniu\n" + janek.getShoppingCart());

        System.out.println("Jankowi zostało : " + janek.getMoney() + " zł");
        Box pudelkoJanka = new Box(janek);
        janek.pack(pudelkoJanka);

        System.out.println("Po zapakowaniu do pudełka\n" + janek.getShoppingCart());

        System.out.println(pudelkoJanka);

        Customer stefan = new Customer("Stefan", 60);

        stefan.get(new Lilac(3));
        stefan.get(new Rose(5));


        System.out.println(stefan.getShoppingCart());

        stefan.pay();
        Box pudelkoStefana = new Box(stefan);
        stefan.pack(pudelkoStefana);

        System.out.println(pudelkoStefana);

        System.out.println("Stefanowi zostało : " + stefan.getMoney() + " zł");
    }
}

