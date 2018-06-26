package ProjektZakupy;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DodajOkno extends JFrame{
    private JPanel DodajPanel;
    private JTextField textField_id;
    private JTextField textField_nazwa;
    private JTextField textField_cena;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DodajOkno frame = new DodajOkno();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DodajOkno() {
        setBounds(100, 100, 500, 379);
        DodajPanel = new JPanel();
        DodajPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(DodajPanel);
        DodajPanel.setLayout(null);
        JLabel lblIdUsugi = new JLabel("ID Produktu:");
        lblIdUsugi.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblIdUsugi.setBounds(51, 25, 125, 27);
        DodajPanel.add(lblIdUsugi);

        JLabel lblNazwaUsugi = new JLabel("Nazwa Produktu:");
        lblNazwaUsugi.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNazwaUsugi.setBounds(51, 58, 125, 27);
        DodajPanel.add(lblNazwaUsugi);

        JLabel lblCenaUsugi = new JLabel("Cena Produktu:");
        lblCenaUsugi.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblCenaUsugi.setBounds(51, 90, 125, 27);
        DodajPanel.add(lblCenaUsugi);

        textField_id = new JTextField();
        textField_id.setBounds(176, 30, 177, 22);
        textField_id.setEditable(false);
        DodajPanel.add(textField_id);
        textField_id.setColumns(10);

        textField_nazwa = new JTextField();
        textField_nazwa.setColumns(10);
        textField_nazwa.setBounds(176, 63, 177, 22);
        DodajPanel.add(textField_nazwa);

        textField_cena = new JTextField();
        textField_cena.setColumns(10);
        textField_cena.setBounds(176, 95, 177, 22);
        DodajPanel.add(textField_cena);

        JButton btnDodaj = new JButton("Dodaj");
        btnDodaj.setBounds(176, 214, 177, 23);
        DodajPanel.add(btnDodaj);

        final ListaZakup instance = ListaZakup.getInstance();
        if(instance.czytajListe().size() > 0) {
            textField_id.setText(String.valueOf(instance.czytajListe().size()));
        }
        else {
            textField_id.setText(String.valueOf(0));
        }

        final String kategorie[] = {"Jedzenie", "Edukacja", "Rozrywka", "Inne"};

        final JComboBox<String> comboBox = new JComboBox<String>(kategorie);
        comboBox.setBounds(176, 128, 177, 20);
        DodajPanel.add(comboBox);
        int selectedIndex = comboBox.getSelectedIndex();


        JLabel lblKategoria = new JLabel("Kategoria:");
        lblKategoria.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblKategoria.setBounds(51, 123, 115, 27);
        DodajPanel.add(lblKategoria);

        btnDodaj.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {

                try
                {
                    Double.parseDouble(textField_cena.getText());
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Wprowadzono nieprawid�ow� warto�� w polu 'Cena'");
                    return;
                }
                double cena = Double.parseDouble(textField_cena.getText());

                ZakupFactory zakupFactory = new ZakupFactory();
                String nazwa = textField_nazwa.getText();
                if(nazwa.equals("")) {
                    System.out.println("Failed");

                    ZakupInterface zakup = zakupFactory.getType(true, null, 0, null);
                    instance.dodajDoListy(zakup);
                }
                else {
                    String kategoria = kategorie[comboBox.getSelectedIndex()];

                    ZakupInterface usluga = zakupFactory.getType(false, nazwa, cena, kategoria);

                    instance.dodajDoListy(usluga);
                    textField_id.setText(String.valueOf(usluga.getID()));
                    textField_nazwa.setText("");
                    textField_cena.setText("");
                    textField_id.setText(String.valueOf(instance.getInstance().size()));
                }

                Dodano frame1 = new Dodano();
                frame1.setVisible(true);

            }

        });


    }

}
