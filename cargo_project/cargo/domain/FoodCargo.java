package ru.epam.cargo_project.cargo.domain;

import java.util.Date;

public class FoodCargo extends Cargo {

  private Date expirationDate;
  private int storeTemperature;


  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public int getStoreTemperature() {
    return storeTemperature;
  }

  public void setStoreTemperature(int storeTemperature) {
    this.storeTemperature = storeTemperature;
  }
}
