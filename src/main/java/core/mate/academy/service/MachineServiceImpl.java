package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<T> producer;
        if (type.equals(Truck.class)) {
            producer = (MachineProducer<T>) new TruckProducer();
        } else if (type.equals(Bulldozer.class)) {
            producer = (MachineProducer<T>) new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            producer = (MachineProducer<T>) new ExcavatorProducer();
        } else {
            return new ArrayList<>();
        }
        List<T> machines = producer.get();
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
