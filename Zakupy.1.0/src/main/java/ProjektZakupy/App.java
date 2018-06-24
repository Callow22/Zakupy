package ProjektZakupy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Produkt produkt =new Produkt("pies",100,"zwierze");
        Produkt produkt1 =new Produkt("grzesiek",2,"zwierze");
        System.out.println("id: " + produkt.getID() + ", nazwa: " + produkt.getNazwa());

        ListaZakup instance = ListaZakup.getInstance();
        instance.dodajDoListy(produkt);
        instance.dodajDoListy(produkt1);

        System.out.println(instance.policzSume("zwierze"));



        System.out.println(instance.czytajListe().get(0).getNazwa());
        System.out.println(instance.czytajListe().get(1).getNazwa());
    }
}
