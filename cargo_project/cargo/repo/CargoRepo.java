package ru.epam.cargo_project.cargo.repo;
import ru.epam.cargo_project.transportation.domain.Transportation;
import ru.epam.cargo_project.cargo.domain.CargoType;

public interface CargoRepo {
     CargoType getCargoType();
     String getName();
     void setName(String name);
     int getWeight();
     void setWeight(int weight);

     Transportation[] getTransportations();

     void setTransportations(Transportation[] transportations);
}
