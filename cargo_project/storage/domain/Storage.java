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

  }

  @Override
  public void addCarrier(Carrier carrier) {

  }

  @Override
  public void addTransportation(Transportation transportation) {

  }

  @Override
  public void printAllTransportations() {

  }

  @Override
  public void printAllCargos() {

  }

  @Override
  public void printAllCarriers() {

  }
}
