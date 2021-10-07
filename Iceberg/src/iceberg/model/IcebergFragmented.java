package iceberg.model;

import iceberg.model.Iceberg;

public class IcebergFragmented extends IcebergEvent{
    private final Iceberg [] fragments;

    public IcebergFragmented(Iceberg[] fragments) {
        this.fragments = fragments;
    }
}
