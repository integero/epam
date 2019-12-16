package ru.epam.cargo_project.storage.repo;

import ru.epam.cargo_project.cargo.domain.Cargo;
import ru.epam.cargo_project.carrier.domain.Carrier;
import ru.epam.cargo_project.transportation.domain.Transportation;

public interface StorageRepo {
    int ARRAY_CAPACITY = 10;

    void addCargo(Cargo cargo);
    Cargo getCargoById(long id);
    Cargo[] getCargosByName(String name);
    void deleteCargo();
    void addCarrier(Carrier carrier);
    Carrier getCarrierById(long id);
    Carrier[] getCarriersByName(String name);
    void deleteCarrier();
    Transportation getTransportationById(long id);
    void addTransportation(Transportation transportation);
    void deleteTransportation();
    void printAllTransportations();

    void printAllCargos();

    void printAllCarriers();

}
