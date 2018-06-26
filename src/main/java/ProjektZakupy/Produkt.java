package ProjektZakupy;

public class Produkt extends AbstractZakup implements ZakupInterface {
    static int id = 0;
    private int id_produktu;
    private String nazwa_produktu;
    private double cena_produktu;
    private String kategoria;

    public Produkt() {}
    public Produkt(String nazwa, double cena, String kategoria) {
        id_produktu = id;
        nazwa_produktu = nazwa;
        cena_produktu = cena;
        this.kategoria = kategoria;
        id++;
    }

    public int getID() {
        return id_produktu;
    }

    public String getNazwa() {
        return nazwa_produktu;
    }

    public double getCena() {
        return cena_produktu;
    }

    @Override
    public String getKategoria() {
        return kategoria;
    }

    @Override
    public void edytuj(String nazwa, double cena) {
        this.nazwa_produktu = nazwa;
        this.cena_produktu = cena;
    }


    @Override
    public boolean isNil() {
        return false;
    }
}
