package ProjektZakupy;

public abstract class AbstractZakup implements ZakupInterface {
    protected int id_produktu;
    protected String nazwa_produktu;
    protected double cena_produktu;
    protected String kategoria;

    public abstract boolean isNil();

    public abstract String getNazwa();
    public abstract int getID();
    public abstract double getCena();
    public abstract String getKategoria();
    public abstract void edytuj(String nazwa, double cena);

}
