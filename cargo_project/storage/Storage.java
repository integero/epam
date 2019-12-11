package epam.cargo_project.storage;

import epam.cargo_project.cargo.Cargo;
import epam.cargo_project.cargo.CargoType;
import epam.cargo_project.carrier.Carrier;
import epam.cargo_project.carrier.CarrierType;
import epam.cargo_project.transportation.Transportation;

import java.util.Arrays;
import java.util.Date;

public class Storage {
    private static long cargoId = 0;
    private static long carrierId = 0;
    private static long transportId = 0;
    Cargo[] cargoStore;
    Carrier[] carrierStore;
    Transportation[] transportationStore;

    public Cargo[] getCargoStore() {
        return cargoStore;
    }

    public void setCargoStore(Cargo[] cargoStore) {
        this.cargoStore = cargoStore;
    }

    public Carrier[] getCarrierStore() {
        return carrierStore;
    }

    public void setCarrierStore(Carrier[] carrierStore) {
        this.carrierStore = carrierStore;
    }

    public Transportation[] getTransportationStore() {
        return transportationStore;
    }

    public void setTransportationStore(Transportation[] transportationStore) {
        this.transportationStore = transportationStore;
    }

    public Storage() {
        cargoStore = new Cargo[0];
        carrierStore = new Carrier[0];
        transportationStore = new Transportation[0];
    }

    public void addCarrier(String name, String addres, CarrierType carrierType) {
        carrierStore = Arrays.copyOf(carrierStore, carrierStore.length + 1);
        Carrier carrier = new Carrier();
        carrier.setId(carrierId);
        carrierId++;
        carrier.setName(name);
        carrier.setAddress(addres);
        carrier.setCarrierType(carrierType);

        carrierStore[carrierStore.length - 1] = carrier;

    }

    public void printCarrier() {
        for (Carrier carrier : carrierStore) {
            System.out.print("  Id  : " + carrier.getId());
            System.out.print("  name: " + carrier.getName());
            System.out.print("  addres: " + carrier.getAddress());
            System.out.print("  type: " + carrier.getCarrierType());
            System.out.println();
        }

    }

    public void addCargo(String name, int weight, CargoType cargoType) {
        cargoStore = Arrays.copyOf(cargoStore, cargoStore.length + 1);
        Cargo carg = new Cargo();
        carg.setId(cargoId);
        cargoId++;
        carg.setName(name);
        carg.setWeight(weight);
        carg.setCargoType(cargoType);
        cargoStore[cargoStore.length - 1] = carg;
    }

    public void printCargo() {
        for (Cargo cargo : cargoStore) {
            System.out.print("  Id  : " + cargo.getId());
            System.out.print("  name: " + cargo.getName());
            System.out.print("  weght: " + cargo.getWeight());
            System.out.print("  type: " + cargo.getCargoType());
            System.out.println();
        }
    }
       public void addTransportation(String description, String billTo, String date) {
           transportationStore = Arrays.copyOf(transportationStore, transportationStore.length + 1);
           Transportation transp = new Transportation();
           transp.setId(transportId);
           transportId++;
           transp.setDescription(description);
           transp.setBillTo(billTo);
           transp.setDate(date);
           transportationStore[transportationStore.length - 1] = transp;
    }

    public void printTransportation() {
        for (Transportation transportation : transportationStore) {
            System.out.print("  Id  : " + transportation.getId());
            System.out.print("  description: " + transportation.getDescription());
            System.out.print("  billTo: " + transportation.getBillTo());
            System.out.print("  date: " + transportation.getDate());
            System.out.println();
        }
    }

}
