package ru.epam.cargo_project.storage.service;

import ru.epam.cargo_project.cargo.domain.Cargo;
import ru.epam.cargo_project.carrier.domain.Carrier;
import ru.epam.cargo_project.transportation.domain.Transportation;

public interface StorageService {
    static void addCargo(Cargo cargo){}
    static void addCarrier(Carrier carrier){}
    static void addTransportation(Transportation transportation){}
    void printAllTransportations();
    void printAllCargos();
    void printAllCarriers();
}
