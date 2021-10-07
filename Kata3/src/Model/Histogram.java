package Model;


import java.util.HashMap;
import java.util.Map;

public class Histogram <T> {
    private final T [] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T, Integer> getHistogram(){
        Map<T, Integer> map = new HashMap<>();
        for(T dato: data){
            map.put(dato, map.containsKey(dato) ? map.get(dato) + 1 : 1);
        }
        return map;
    }
}
