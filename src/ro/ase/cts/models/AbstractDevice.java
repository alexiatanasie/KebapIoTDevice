package ro.ase.cts.models;

public abstract class AbstractDevice {
    protected String name;

    public AbstractDevice(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract double getEnergyConsumption();

    public abstract void report();

    public abstract void addDevice(AbstractDevice device);

    public abstract void deleteDevice(int index);

    public abstract AbstractDevice getDevice(String name);

}
