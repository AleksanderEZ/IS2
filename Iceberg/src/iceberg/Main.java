package iceberg;

import iceberg.model.Iceberg;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Iceberg iceberg1 = new Iceberg("K-91", Iceberg.Origin.Glaciar, LocalDate.of(1996, Month.JUNE, 13));
        
    }
}
