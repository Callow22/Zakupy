package ProjektZakupy;

import java.util.ArrayList;
import java.util.List;

public class ListaZakup {
    private List<ZakupInterface> listaZakup = new ArrayList<>();
    private static ListaZakup instance;
    static int size = 0;


    private ListaZakup() {
    }

    public static ListaZakup getInstance() {
        if (instance == null) {
            instance = new ListaZakup();
        }

        return instance;
    }

    public void dodajDoListy(ZakupInterface usluga) {
        instance.listaZakup.add(usluga);
        size++;
    }

    public int size() {
        return size;
    }

    public List<ZakupInterface> czytajListe() {
        return instance.listaZakup;
    }

    public double policzSume(String kategoria) {
        double suma = 0;
        for (int i = 0; i < instance.listaZakup.size(); i++) {
            if(instance.listaZakup.get(i).getKategoria() == kategoria) {
                suma += instance.listaZakup.get(i).getCena();
            }
        }
        return suma;
    }

    public void usunZListy(int id) {
        for (int i = 0; i < instance.listaZakup.size(); i++) {
            if (id == instance.listaZakup.get(i).getID()) {
                instance.listaZakup.remove(instance.listaZakup.get(i));
            }
        }
    }
}
