package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String trackSuspensionType;

    public Excavator() {
    }

    public String getTrackSuspensionType() { return trackSuspensionType; }

    public void setTrackSuspensionType(String trackSuspensionType) {
        this.trackSuspensionType = trackSuspensionType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
