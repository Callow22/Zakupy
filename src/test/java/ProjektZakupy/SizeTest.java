package ProjektZakupy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SizeTest {
    String nazwa[]={"Baton", "Zeszyt","Podrecznik","Marchewka","Spodnie"};
    double cena[]={2.0,14.0,15.0,30,150.0};
    String kategorie[] = {"Jedzenie", "Edukacja", "Rozrywka", "Inne"};

    ListaZakup lista=ListaZakup.getInstance();
    Produkt produkt=new Produkt();

    @Test
    public void test(){
        Assert.assertEquals(0,lista.size(),0);

        lista.dodajDoListy(produkt);
        Assert.assertEquals(1,lista.size(),0);
    }

}