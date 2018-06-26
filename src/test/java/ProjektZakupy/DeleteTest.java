package ProjektZakupy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteTest {
    String nazwa[]={"Baton", "Zeszyt","Podrecznik","Marchewka","Spodnie"};
    double cena[]={2.0,14.0,15.0,30,150.0};
    String kategorie[] = {"Jedzenie", "Edukacja", "Rozrywka", "Inne"};

    ListaZakup lista=ListaZakup.getInstance();
    Produkt produkt=new Produkt();
    Produkt produkt1=new Produkt();

    @Test
    public void test(){
        lista.dodajDoListy(produkt);
        lista.dodajDoListy(produkt1);
        Assert.assertEquals(2,lista.size(),0);
        lista.usunZListy(0);
        Assert.assertEquals(1,lista.size(),0);

    }
}