package ru.epam.cargo_project.transportation.service;

import ru.epam.cargo_project.cargo.domain.Cargo;
import ru.epam.cargo_project.carrier.domain.Carrier;

import java.util.Date;

public interface TransportationService {
    Date getTransportationBeginDate();

    void setTransportationBeginDate(Date transportationBeginDate);

    String getDescription();

    void setDescription(String description);

    String getBillTo();

    void setBillTo(String billTo);

    Cargo getCargo();

    void setCargo(Cargo cargo);

    Carrier getCarrier();

    void setCarrier(Carrier carrier);
}