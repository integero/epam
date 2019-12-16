package ru.epam.cargo_project.storage.repo;

import ru.epam.cargo_project.cargo.domain.Cargo;
import ru.epam.cargo_project.carrier.domain.Carrier;
import ru.epam.cargo_project.transportation.domain.Transportation;

public interface StorageRepo {
    int ARRAY_CAPACITY = 10;

    void addCargo(Cargo cargo);

    void addCarrier(Carrier carrier);

    void addTransportation(Transportation transportation);

    void printAllTransportations();

    void printAllCargos();

    void printAllCarriers();

}
