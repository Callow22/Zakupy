package ProjektZakupy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiczenieTest {
    String nazwa[]={"Baton", "Zeszyt","Podrecznik","Marchewka","Spodnie"};
    double cena[]={2.0,14.0,15.0,30,150.0};
    String kategorie[] = {"Jedzenie", "Edukacja", "Rozrywka", "Inne"};

    ListaZakup lista=ListaZakup.getInstance();

    Produkt produkt=new Produkt(nazwa[0],cena[0],kategorie[0]);
    Produkt produkt1=new Produkt(nazwa[1],cena[1],kategorie[1]);
    Produkt produkt2=new Produkt(nazwa[2],cena[2],kategorie[1]);
    Produkt produkt3=new Produkt(nazwa[3],cena[3],kategorie[0]);
    Produkt produkt4=new Produkt(nazwa[4],cena[4],kategorie[3]);

    @Test
    public void test(){
        lista.dodajDoListy(produkt);
        lista.dodajDoListy(produkt1);
        lista.dodajDoListy(produkt2);
        lista.dodajDoListy(produkt3);
        lista.dodajDoListy(produkt4);

        Assert.assertEquals(cena[0]+cena[3],lista.policzSume(kategorie[0]),0);
        Assert.assertEquals(cena[1]+cena[2],lista.policzSume(kategorie[1]),0);
        Assert.assertEquals(cena[4],lista.policzSume(kategorie[3]),0);
    }
}