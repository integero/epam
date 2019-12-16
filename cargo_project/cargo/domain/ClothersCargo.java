package ru.epam.cargo_project.cargo.domain;


public class ClothersCargo extends Cargo {

  private String size;
  private String material;


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  @Override
  public CargoType getCargoType() {
    return CargoType.CLOTHERS;
  }
}
