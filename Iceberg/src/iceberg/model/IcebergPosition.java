package iceberg.model;

import iceberg.model.Iceberg;
import iceberg.model.IcebergEvent;
import java.time.LocalDate;

public class IcebergPosition extends IcebergEvent {
    int x;
    int y;

    public IcebergPosition(LocalDate date, Iceberg iceberg ,int x, int y) {
        this.date = date;
        this.iceberg = iceberg;
        this.x = x;
        this.y = y;
    }
}
