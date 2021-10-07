package kata3segundointento;

import Kata3.view.DefaultHistogramLoader;
import Kata3.view.CreateHistogramDisplay;
import Kata3.view.DefaultHistogramDisplay;
import Model.Histogram;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;

public class Main extends JFrame {
    
    private CreateHistogramDisplay histogramDisplay;
    
    public static void main(String[] args) {
        new Main().execute();
}

    public Main() {
        super();
        setTitle("Histogram");
        setLocation(0, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        rootPane.setLayout(new BorderLayout());
        rootPane.add(createDisplayPanel(), BorderLayout.CENTER);
    }
    
    private void execute() {
        Histogram histogram = new DefaultHistogramLoader().load();
        histogramDisplay.display(histogram);
        setVisible(true);
    }

    private Component createDisplayPanel() {
        DefaultHistogramDisplay display = new DefaultHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }
}
