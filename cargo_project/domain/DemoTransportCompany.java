package epam.cargo_project.domain;

import epam.cargo_project.domain.cargo.Cargo;
import epam.cargo_project.domain.common.CommonObjects;
import epam.cargo_project.domain.storage.Storage;

public class DemoTransportCompany {
    public static void main(String[] args) {
        CommonObjects ccc=new CommonObjects();
        Storage st=new Storage();
        Cargo firstCaro=new Cargo();
        firstCaro.setName("Banana");
        st.addCargo(firstCaro);
        System.out.println(st.getCargoById(0));
    }
}
