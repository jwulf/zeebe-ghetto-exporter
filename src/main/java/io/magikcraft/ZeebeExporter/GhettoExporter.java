package io.magikcraft.ZeebeExporter;

import io.zeebe.exporter.api.context.Context;
import io.zeebe.exporter.api.context.Controller;
import io.zeebe.exporter.api.record.Record;
import io.zeebe.exporter.api.spi.Exporter;

public class GhettoExporter implements Exporter {

    public void configure(Context context) {
        System.out.println("Configuring Ghetto Exporter");
    }

    public void open(Controller controller) {
        System.out.println("Opening Ghetto Exporter");
    }

    public void close() {
        System.out.println("Closing Ghetto Exporter");

    }

    public void export(Record record) {
        System.out.println(record);
    }
}
