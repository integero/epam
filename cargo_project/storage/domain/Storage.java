package ru.epam.cargo_project.storage.domain;

import ru.epam.cargo_project.cargo.domain.Cargo;
import ru.epam.cargo_project.carrier.domain.Carrier;
import ru.epam.cargo_project.common.utils.ArrayUtils;
import ru.epam.cargo_project.storage.repo.StorageRepo;
import ru.epam.cargo_project.transportation.domain.Transportation;

import java.util.Objects;

public class Storage implements StorageRepo {

//  private static final int ARRAY_CAPACITY = 10;

    private static Cargo[] cargos = new Cargo[ARRAY_CAPACITY];
    private static int cargoIndex = 0;

    private static Carrier[] carriers = new Carrier[ARRAY_CAPACITY];
    private static int carrierIndex = 0;

    private static Transportation[] transportations = new Transportation[ARRAY_CAPACITY];
    private static int transportationIndex = 0;


    @Override
    public void addCargo(Cargo cargo) {
        cargo.setId(IdGenerator.generateId());
        cargos[cargoIndex] = cargo;
        cargoIndex++;

        if (cargoIndex == cargos.length) {
            Cargo[] newCargos = new Cargo[cargos.length * 2];
            ArrayUtils.copyArray(cargos, newCargos);
            cargos = newCargos;
        }
    }

    @Override
    public Cargo getCargoById(long id) {
        for (Cargo cargo : cargos) {
            if (cargo != null && Long.valueOf(id).equals(cargo.getId())) {
                return cargo;
            }
        }

        return null;
    }

    @Override
    public Cargo[] getCargosByName(String name) {
        Cargo[] result = new Cargo[cargos.length];
        int curIndex = 0;
        for (Cargo cargo : cargos) {
            if (cargo != null && Objects.equals(cargo.getName(), name)) {
                result[curIndex++] = cargo;
            }
        }
        return result;
    }

    @Override
    public void deleteCargo() {

    }

    @Override
    public void addCarrier(Carrier carrier) {
        carrier.setId(IdGenerator.generateId());
        carriers[carrierIndex] = carrier;
        carrierIndex++;
        if (carrierIndex == carriers.length) {
            Carrier[] newCarriers = new Carrier[carriers.length * 2];
            ArrayUtils.copyArray(carriers, newCarriers);
            carriers = newCarriers;
        }
    }

    @Override
    public Carrier getCarrierById(long id) {
        for (Carrier carrier : carriers) {
            if (carrier != null && Long.valueOf(id).equals(carrier.getId())) {
                return carrier;
            }
        }

        return null;
    }

    @Override
    public Carrier[] getCarriersByName(String name) {
        Carrier[] result = new Carrier[carriers.length];

        int curIndex = 0;
        for (Carrier carrier : carriers) {
            if (carrier != null && Objects.equals(carrier.getName(), name)) {
                result[curIndex++] = carrier;
            }
        }

        return result;
    }

    @Override
    public void deleteCarrier() {

    }

    @Override
    public Transportation getTransportationById(long id) {
        for (Transportation transportation : transportations) {
            if (transportation != null && Long.valueOf(id).equals(transportation.getId())) {
                return transportation;
            }
        }
        return null;
    }

    @Override
    public void addTransportation(Transportation transportation) {
        transportation.setId(IdGenerator.generateId());
        transportations[transportationIndex] = transportation;
        transportationIndex++;

        if (transportationIndex == transportations.length) {
            Transportation[] newTransportations = new Transportation[transportations.length * 2];
            ArrayUtils.copyArray(transportations, newTransportations);
            transportations = newTransportations;
        }

    }

    @Override
    public void deleteTransportation() {

    }

    @Override
    public void printAllTransportations() {
        ArrayUtils.printArray(transportations);
    }

    @Override
    public void printAllCargos() {
        ArrayUtils.printArray(cargos);
    }

    @Override
    public void printAllCarriers() {
        ArrayUtils.printArray(carriers);
    }
}
