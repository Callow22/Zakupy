package ProjektZakupy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EdycjaTest {
    String nazwa[] = {"Baton", "Podręcznik"};
    double cena[] = {2, 20.0};
    String kategoria[] = {"Jedzenie", "Edukacja"};

    String nazwaTest[] = {"Chipsy", "Zeszyt"};
    double cenaTest[] = {0.00, 2.15};


    Produkt produkt = new Produkt(nazwa[0], cena[0], kategoria[0]);
    Produkt produkt1 = new Produkt(nazwa[1], cena[1], kategoria[1]);

    @Test
    public void Test(){
        produkt.edytuj(nazwaTest[0],cenaTest[0]);
        produkt1.edytuj(nazwaTest[1],cenaTest[1]);

        Assert.assertEquals(nazwaTest[0],produkt.getNazwa());
        Assert.assertEquals(cenaTest[0],produkt.getCena(),0);

        Assert.assertEquals(nazwaTest[1],produkt1.getNazwa());
        Assert.assertEquals(cenaTest[1],produkt1.getCena(),0);
    }

}