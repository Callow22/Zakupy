package ProjektZakupy;

public class ZakupFactory {
    public ZakupInterface getType(boolean isNil, String nazwa, double cena, String kategoria) {

        if(isNil == false) {
            return new Produkt(nazwa, cena, kategoria);
        }
        else if(isNil == true) {
            return new NullProdukt();
        }

        return null;
    }
}
