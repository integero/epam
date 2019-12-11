package epam.cargo_project;

import epam.cargo_project.cargo.Cargo;
import epam.cargo_project.carrier.Carrier;
import epam.cargo_project.storage.Storage;
import epam.cargo_project.transportation.Transportation;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import static epam.cargo_project.cargo.CargoType.*;
import static epam.cargo_project.carrier.CarrierType.*;

public class DemoTransportCompany {
    public static void main(String[] args) {


        Storage st =new Storage();
        st.addCargo("cargo_1",123,FOOD);
        st.addCargo("cargo_2",678,CLOTHER);
        st.addCargo("cargo_3",678,COMPUTERS);

        st.addCarrier("firstCarrier","Voroneg",SHIP);
        st.addCarrier("secondCarrier","Moscow",PLANE);
        st.addCarrier("nonameCarrier","Anadyr",TRAIN);

        st.addTransportation("one","Bill Gates","11.12.13");
        st.addTransportation("two","Thrump","03.01.18");
        st.addTransportation("five","Robinson","01.01.2001");

        st.getCargoStore()[0].setTransportations(st.getTransportationStore());

        st.printCargo();
        System.out.println();
        st.printCarrier();
        System.out.println();
        st.printTransportation();

    }
}
