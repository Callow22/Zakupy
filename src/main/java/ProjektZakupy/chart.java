package ProjektZakupy;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class chart extends ApplicationFrame implements WindowListener{

    public chart( String title ) {
        super( title );
        setContentPane(createDemoPanel( ));
    }

    public void windowClosing(WindowEvent e) {
        this.dispose();
    }

    private static PieDataset createDataset( ) {
        String kategorie[] = {"Jedzenie", "Edukacja", "Rozrywka", "Inne"};

        ListaZakup instance = ListaZakup.getInstance();
        DefaultPieDataset dataset = new DefaultPieDataset( );
        for (int i = 0; i < kategorie.length; i++) {
            dataset.setValue( kategorie[i] , instance.getInstance().policzSume(kategorie[i]) );
        }
        return dataset;
    }

    private static JFreeChart createChart( PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Mobile Sales",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        return chart;
    }



    public static JPanel createDemoPanel( ) {
        JFreeChart chart = createChart(createDataset( ) );
        return new ChartPanel( chart );
    }

}