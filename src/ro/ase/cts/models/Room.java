package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Room extends AbstractDevice{
    private List<AbstractDevice> devices = new ArrayList<>();

    public Room(String name) {
        super(name);
    }

    @Override
    public void report() {
        System.out.println("Room: " + this.name + ", total consumption: " + getEnergyConsumption() + " kWh.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getEnergyConsumption() {
            return devices.stream()
                    .mapToDouble(AbstractDevice::getEnergyConsumption)
                    .sum();
    }

    @Override
    public void addDevice(AbstractDevice device) {
        devices.add(device);
    }

    @Override
    public void deleteDevice(int index) {
        if (index >= 0 && index < devices.size()) {
            devices.remove(index);
        }
    }

    @Override
    public AbstractDevice getDevice(String name) {
        if (this.name.equals(name)) return this;
        for (AbstractDevice device : devices) {
            AbstractDevice found = device.getDevice(name);
            if (found != null) return found;
        }
        return null;
    }
}
