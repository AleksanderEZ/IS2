

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {1, 2, 3, 4, 5, 6, 3, 8, 2, 3, 14, 4, 5, 9};
        
        Histogram histogram = new Histogram(data);
        
        Iterator<Map.Entry<Integer, Integer>> entries;
        entries = histogram.getHistogram().entrySet().iterator();
        
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
