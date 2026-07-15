package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULLDOZERS_COUNT = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new java.util.ArrayList<>();
        int currentCount = 0;
        while (currentCount < BULLDOZERS_COUNT) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setName("Bulldozer " + (currentCount + 1));
            bulldozer.setColor("Color " + (currentCount + 1));
            bulldozer.setBladeType("Blade " + (currentCount + 1));
            bulldozers.add(bulldozer);
            currentCount++;
        }
        return bulldozers;
    }
}
