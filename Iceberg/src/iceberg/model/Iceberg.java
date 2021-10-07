package iceberg.model;

import java.time.LocalDate;

public class Iceberg {
    
    private final String name;
    private final Origin origin;
    private final LocalDate discovered;
    private final int size;
    
    public Iceberg(String name, Origin origin, LocalDate discovered, int size) {
        this.discovered = discovered;
        this.name = name;
        this.origin = origin;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Origin getOrigin() {
        return origin;
    }

    public LocalDate getDiscovered() {
        return discovered;
    }
    
    public enum Origin { Iceberg, Glaciar }
}


