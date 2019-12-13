package epam.cargo_project.domain.storage;

import epam.cargo_project.domain.cargo.Cargo;
import epam.cargo_project.domain.cargo.CargoType;
import epam.cargo_project.domain.carrier.Carrier;
import epam.cargo_project.domain.carrier.CarrierType;
import epam.cargo_project.domain.transportation.Transportation;

import java.util.Arrays;

public class Storage {
    private static long INCREMENT=10;
    private static long cargoId = 0;
    private static long cargoIndex = 0;
    private static long carrierId = 0;
    private static long carrierIndex = 0;
    private static long transportId = 0;
    private static long transportIndex = 0;
    private Cargo[] cargoStore;
    private Carrier[] carrierStore;
    private Transportation[] transportationStore;

    public Cargo[] getCargoStore() {
        return cargoStore;
    }
    public Cargo getCargoById(long cargoId){
        for (int i = 0; i < cargoIndex; i++) {
            if (cargoStore[i].getId()==cargoId)
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
    public Carrier getCarrierById(long carrierIndex){
        for (int i = 0; i < carrierIndex; i++) {
            if (carrierStore[i].getId()==cargoId)
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
    public Transportation getTransportationById(long transportIndex){
        for (int i = 0; i < transportIndex; i++) {
            if (transportationStore[i].getId()==transportIndex)
                return transportationStore[i];
        }
        return null;
    }

    public void setTransportationStore(Transportation[] transportationStore) {
        this.transportationStore = transportationStore;
    }

    public Storage() {
        cargoStore = new Cargo[0];
        carrierStore = new Carrier[0];
        transportationStore = new Transportation[0];
    }

    public void addCarrier(Carrier carrier) {
        carrierStore = Arrays.copyOf(carrierStore, carrierStore.length + 1);
        carrier.setId(carrierId);
        carrierId++;
        carrierStore[carrierStore.length - 1] = carrier;

    }

    public void printCarrier() {
        for (Carrier carrier : carrierStore) {
            System.out.println(carrier);

        }

    }

    public void addCargo(Cargo cargo) {
        cargoStore = Arrays.copyOf(cargoStore, cargoStore.length + 1);
        cargo.setId(cargoId);
        cargoId++;
        cargoStore[cargoStore.length - 1] = cargo;
    }

    public void printCargo() {
        for (Cargo cargo : cargoStore) {
            System.out.println(cargo);

        }
    }

    public void addTransportation(Transportation transportation) {
        transportationStore = Arrays.copyOf(transportationStore, transportationStore.length + 1);
        transportation.setId(transportId);
        transportId++;
        transportationStore[transportationStore.length - 1] = transportation;
    }

    public void printTransportation() {
        for (Transportation transportation : transportationStore) {
            System.out.println(transportation);
       }
    }

}
