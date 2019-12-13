package epam.cargo_project.domain.storage;

import epam.cargo_project.domain.cargo.Cargo;
import epam.cargo_project.domain.carrier.Carrier;
import epam.cargo_project.domain.transportation.Transportation;

import java.util.Arrays;

public class Storage {
    private static int INCREMENT = 10;
    private static long cargoId = 0;
    private static int cargoIndex = 0;
    private static long carrierId = 0;
    private static int carrierIndex = 0;
    private static long transportId = 0;
    private static int transportIndex = 0;
    private Cargo[] cargoStore;
    private Carrier[] carrierStore;
    private Transportation[] transportationStore;

    public Cargo[] getCargoStore() {
        return cargoStore;
    }

    public Cargo getCargoById(long cargoId) {
        for (int i = 0; i < cargoIndex; i++) {
            if (cargoStore[i].getId() == cargoId)
                return cargoStore[i];
        }
        return null;
    }

    public void setCargoStore(Cargo[] cargoStore) {
        this.cargoStore = cargoStore;
    }

    public Carrier[] getCarrierStore() {
        return carrierStore;
    }

    public Carrier getCarrierById(long carrierIndex) {
        for (int i = 0; i < carrierIndex; i++) {
            if (carrierStore[i].getId() == cargoId)
                return carrierStore[i];
        }
        return null;
    }

    public void setCarrierStore(Carrier[] carrierStore) {
        this.carrierStore = carrierStore;
    }

    public Transportation[] getTransportationStore() {
        return transportationStore;
    }

    public Transportation getTransportationById(long transportIndex) {
        for (int i = 0; i < transportIndex; i++) {
            if (transportationStore[i].getId() == transportIndex)
                return transportationStore[i];
        }
        return null;
    }

    public void setTransportationStore(Transportation[] transportationStore) {
        this.transportationStore = transportationStore;
    }

    public Storage() {
        cargoStore = new Cargo[INCREMENT];
        carrierStore = new Carrier[INCREMENT];
        transportationStore = new Transportation[INCREMENT];
    }

    public void addCarrier(Carrier carrier) {
        if (carrierIndex == carrierStore.length) {
            carrierStore = Arrays.copyOf(carrierStore, carrierStore.length + INCREMENT);
        }
        carrierStore[carrierIndex] = carrier;
        carrierIndex++;
        carrier.setId(carrierId);
        carrierId++;
    }

    public void printCarrier() {
        for (Carrier carrier : carrierStore) {
            System.out.println(carrier);
        }
    }

    public void addCargo(Cargo cargo) {
        if (cargoIndex == cargoStore.length) {
            cargoStore = Arrays.copyOf(cargoStore, cargoStore.length + INCREMENT);
        }
        cargoStore[cargoIndex] = cargo;
        cargoIndex++;
        cargo.setId(cargoId);
        cargoId++;
    }

    public void printCargo() {
        for (Cargo cargo : cargoStore) {
            System.out.println(cargo);

        }
    }

    public void addTransportation(Transportation transportation) {
        if (transportIndex == transportationStore.length) {
            transportationStore = Arrays.copyOf(transportationStore, transportationStore.length + INCREMENT);
        }
        transportationStore[transportIndex] = transportation;
        transportIndex++;
        transportation.setId(transportId);
        transportId++;
    }

    public void printTransportation() {
        for (Transportation transportation : transportationStore) {
            System.out.println(transportation);
        }
    }
}
