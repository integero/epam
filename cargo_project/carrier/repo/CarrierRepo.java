package ru.epam.cargo_project.carrier.repo;

import ru.epam.cargo_project.carrier.domain.CarrierType;
import ru.epam.cargo_project.transportation.domain.Transportation;

public interface CarrierRepo {
     String getName();

     void setName(String name);

     String getAddress();

     void setAddress(String address);

     CarrierType getCarrierType();

     void setCarrierType(CarrierType carrierType);

     Transportation[] getTransportations();

     void setTransportations(Transportation[] transportations);
}

