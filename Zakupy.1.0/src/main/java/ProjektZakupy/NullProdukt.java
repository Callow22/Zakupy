package ProjektZakupy;

public class NullProdukt extends AbstractZakup implements ZakupInterface {

    public NullProdukt() {
    }

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getNazwa() {
        return "OBJECT IS NULL";
    }

    @Override
    public int getID() {
        return -1;
    }

    @Override
    public double getCena() {
        return -1.0;
    }

    @Override
    public String getKategoria() {
        return "OBJECT IS NULL";
    }

    @Override
    public void edytuj(String nazwa, double cena) {
        this.nazwa_produktu = nazwa;
        this.cena_produktu = cena;
    }
}
