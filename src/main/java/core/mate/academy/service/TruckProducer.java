package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int TRUCKS_COUNT = 3;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new java.util.ArrayList<>();
        int currentCount = 0;
        while (currentCount < TRUCKS_COUNT) {
            Truck truck = new Truck();
            truck.setName("Truck " + (currentCount + 1));
            truck.setColor("Color " + (currentCount + 1));
            truck.setTruckType("Truck " + (currentCount + 1));
            trucks.add(truck);
            currentCount++;
        }
        return trucks;
    }
}
