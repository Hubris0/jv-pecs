package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int EXCAVATOR_COUNT = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new java.util.ArrayList<>();
        int currentCount = 0;
        while (currentCount < EXCAVATOR_COUNT) {
            Excavator excavator = new Excavator();
            excavator.setName("Excavator " + (currentCount + 1));
            excavator.setColor("Color " + (currentCount + 1));
            excavator.setTrackSuspensionType("Vehicle Continuous Tracks");
            excavators.add(excavator);
            currentCount++;
        }
        return excavators;
    }
}