package ro.ase.cts.models;

public class Device extends AbstractDevice{
    private double energyConsumption;

    public Device(String name, double energyConsumption) {
        super(name);
        this.energyConsumption = energyConsumption;
    }

    @Override
    public void report() {
        System.out.println("Device: " + this.name + ", energyConsumption: " + this.energyConsumption + " kWh.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getEnergyConsumption() {
        return this.energyConsumption;
    }

    @Override
    public void addDevice(AbstractDevice device) { throw new UnsupportedOperationException("Can't add device.");}

    @Override
    public void deleteDevice(int index) { throw new UnsupportedOperationException("Can't delete device.");}

    @Override
    public AbstractDevice getDevice(String name) { throw new UnsupportedOperationException();}

    @Override
    public String toString() {
        return "Device{" +
                "name='" + this.name + '\'' +
                ", energyConsumption=" + this.energyConsumption +
                '}';
    }
}
