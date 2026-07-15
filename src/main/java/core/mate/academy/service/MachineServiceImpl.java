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
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer;
        if (type.equals(Truck.class)) {
            producer = new TruckProducer();
        } else if (type.equals(Bulldozer.class)) {
            producer = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            producer = new ExcavatorProducer();
        } else {
            return new ArrayList<>();
        }
        return (List<Machine>) producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
