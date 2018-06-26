package ProjektZakupy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ALL")
public class ProduktTest {
    String nazwa[] = {"Baton typu grzesiek", "Bilet do kina", "Podrecznik", "Chomik", "Chleb"};
    double cena[] = {1, 2.0, -15.2, 190, 3};
    String kategoria[] = {"Jedzenie", "Rozrywka", "Edukacja", "12345", "RAZDWATRZY"};

    Produkt produkt = new Produkt(nazwa[0], cena[0], kategoria[0]);
    Produkt produkt1 = new Produkt(nazwa[1], cena[1], kategoria[1]);
    Produkt produkt2 = new Produkt(nazwa[2], cena[2], kategoria[2]);
    Produkt produkt3 = new Produkt(nazwa[3], cena[3], kategoria[3]);
    Produkt produkt4 = new Produkt(nazwa[4], cena[4], kategoria[4]);

    @Test
    public void produkttest() throws Exception{

        Assert.assertEquals(nazwa[0],produkt.getNazwa());
        Assert.assertEquals(nazwa[1],produkt1.getNazwa());
        Assert.assertEquals(nazwa[2],produkt2.getNazwa());
        Assert.assertEquals(nazwa[3],produkt3.getNazwa());
        Assert.assertEquals(nazwa[4],produkt4.getNazwa());

        Assert.assertEquals(cena[0],produkt.getCena(),0);
        Assert.assertEquals(cena[1],produkt1.getCena(),0);
        Assert.assertEquals(cena[2],produkt2.getCena(),0);
        Assert.assertEquals(cena[3],produkt3.getCena(),0);
        Assert.assertEquals(cena[4],produkt4.getCena(),0);

        Assert.assertEquals(kategoria[0],produkt.getKategoria());
        Assert.assertEquals(kategoria[1],produkt1.getKategoria());
        Assert.assertEquals(kategoria[2],produkt2.getKategoria());
        Assert.assertEquals(kategoria[3],produkt3.getKategoria());
        Assert.assertEquals(kategoria[4],produkt4.getKategoria());

    }

}