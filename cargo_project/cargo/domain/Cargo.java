package ru.epam.cargo_project.cargo.domain;


import ru.epam.cargo_project.cargo.repo.CargoRepo;
import ru.epam.cargo_project.carrier.domain.CarrierType;
import ru.epam.cargo_project.carrier.repo.CarrierRepo;
import ru.epam.cargo_project.common.domain.BaseEntity;
import ru.epam.cargo_project.transportation.domain.Transportation;

import java.util.Arrays;

public abstract class Cargo extends BaseEntity implements CargoRepo {

    protected String name;
    protected int weight;
    protected Transportation[] transportations;
    protected CargoType cargoType;

    @Override
    public String toString() {
        return "Cargo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", cargoType=" + cargoType +
                ", transportations=" + Arrays.toString(transportations) +
                '}';
    }


    @Override
    public CargoType getCargoType() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Transportation[] getTransportations() {
        return new Transportation[0];
    }

    @Override
    public void setTransportations(Transportation[] transportations) {

    }
}
