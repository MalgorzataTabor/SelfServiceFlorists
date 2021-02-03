package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Małgorzata
 * Date: 12.01.2021
 */
// cennik <kwiat, cena>

public class PriceList {
    private static PriceList ourInstance = new PriceList();
    private Map<String, Integer> cennik;

    public static PriceList getInstance() {
        return ourInstance;
    }

    private PriceList() {
        cennik = new HashMap<String, Integer>();
    }

    public void set(String nazwaKwiatu, int cena) {
        cennik.put(nazwaKwiatu, cena);
    }

    public Integer get(String nazwaKwiatu) {
        return cennik.get(nazwaKwiatu);
    }
}

// zwrócenie ceny

// wypełnienie mapy, przypisanie ceny do kwiatka
