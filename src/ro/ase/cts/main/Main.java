package ro.ase.cts.main;


import ro.ase.cts.models.Device;
import ro.ase.cts.models.Room;

public class Main {
    public static void main(String[] args) {
        // Dispozitive inteligente individuale
        Device grillSensor = new Device("Grill Temperature Sensor", 3.5);
        Device meatFridge = new Device("Meat Fridge", 25.0);
        Device smartLights = new Device("Smart Lights", 4.0);
        Device sauceDispenser = new Device("Automatic Sauce Dispenser", 2.5);
        Device ventilationSystem = new Device("Ventilation System", 6.0);
        Device tabletCashier = new Device("Tablet - Cashier", 1.2);
        Device outsideLight = new Device("Lamp", 3.1);

        // Camere individuale
        Room kitchen = new Room("Kitchen");
        kitchen.addDevice(grillSensor);
        kitchen.addDevice(meatFridge);
        kitchen.addDevice(sauceDispenser);
        kitchen.addDevice(ventilationSystem);

        Room diningArea = new Room("Dining Area");
        diningArea.addDevice(smartLights);

        Room cashierZone = new Room("Cashier Zone");
        cashierZone.addDevice(tabletCashier);

        // Compozit final: Kebab Shop-ul în întregime
        Room kebabShop = new Room("Vezinuvezicumperiescu Kebab Shop");
        kebabShop.addDevice(kitchen);
        kebabShop.addDevice(diningArea);
        kebabShop.addDevice(cashierZone);
        kebabShop.addDevice(outsideLight);

        // Raport final
        smartLights.report();
        kitchen.report();
        kebabShop.report();
    }
}