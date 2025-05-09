package ro.ase.cts.main;


import ro.ase.cts.models.Device;
import ro.ase.cts.models.Room;

public class Main {
    public static void main(String[] args) {
        Device grillSensor = new Device("Grill Temperature Sensor", 3.5);
        Device fridge = new Device("Fridge", 25.0);
        Device sauceDispenser = new Device("Automatic Sauce Dispenser", 2.5);
        Device ventilationSystem = new Device("Ventilation System", 6.0);
        Device tabletCashier = new Device("Tablet - Cashier", 1.2);
        Device outsideLight = new Device("Lamp", 3.1);

        Room kitchen = new Room("Kitchen");
        kitchen.addDevice(grillSensor);
        kitchen.addDevice(fridge);
        kitchen.addDevice(sauceDispenser);
        kitchen.addDevice(ventilationSystem);

        Room diningArea = new Room("Dining Area");
        diningArea.addDevice(ventilationSystem);

        Room cashierZone = new Room("Cashier Zone");
        cashierZone.addDevice(tabletCashier);

        Room kebabShop = new Room("Vezinuvezicumperiescu Kebab Shop");
        kebabShop.addDevice(kitchen);
        kebabShop.addDevice(diningArea);
        kebabShop.addDevice(cashierZone);
        kebabShop.addDevice(outsideLight);

        ventilationSystem.report();
        kitchen.report();
        kebabShop.report();
    }
}