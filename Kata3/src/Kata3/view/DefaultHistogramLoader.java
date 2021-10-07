package Kata3.view;

import Model.Histogram;
import Model.Histogram;

public class DefaultHistogramLoader implements createHistogramLoader {

    private final String [] valores = new String [] 
    {"Dario", "Dario", "Dario", "Sara", "Sara", "Marco", "Abian"};
    
    @Override
    public Histogram load() {
        return new Histogram(valores);
    }

}
