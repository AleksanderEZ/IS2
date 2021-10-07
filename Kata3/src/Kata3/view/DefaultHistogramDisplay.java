package Kata3.view;

import Kata3.view.CreateHistogramDisplay;
import Model.Histogram;
import Model.Histogram;
import java.util.Iterator;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class DefaultHistogramDisplay extends ChartPanel implements CreateHistogramDisplay {

    public DefaultHistogramDisplay(){
        super(null);
    }
    
    @Override
    public void display(Histogram histogram) {
        setChart(creteFreeChart(histogram));
    }

    private JFreeChart creteFreeChart(Histogram histogram) {
        return ChartFactory.createBarChart("Histogram", "Valores", "Count", createDataset(histogram));
    }

    private CategoryDataset createDataset(Histogram histogram) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Iterator <Map.Entry> entries;
        entries = histogram.getHistogram().entrySet().iterator();
        
        while(entries.hasNext()){
            Map.Entry entry = entries.next();
            dataset.addValue((Integer) entry.getValue(), "", (Comparable) entry.getKey());
        }
        return dataset;
    }

}
