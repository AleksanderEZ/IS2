package iceberg.model;

import java.time.LocalDate;

public class IcebergVolume extends IcebergEvent {
    int volume;

    public IcebergVolume(LocalDate date, Iceberg iceberg, int volume) {
        this.date = date;
        this.iceberg = iceberg;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }
}