package ru.epam.cargo_project.cargo.service;

import ru.epam.cargo_project.cargo.domain.CargoType;
import ru.epam.cargo_project.transportation.domain.Transportation;

public interface CargoService {
     CargoType getCargoType();
     String getName();
     void setName(String name);
     int getWeight();
     void setWeight(int weight);

     Transportation[] getTransportations();

     void setTransportations(Transportation[] transportations);

}
