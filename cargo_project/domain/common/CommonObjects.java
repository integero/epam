package epam.cargo_project.domain.common;


import epam.cargo_project.domain.cargo.Cargo;
import epam.cargo_project.domain.carrier.Carrier;
import epam.cargo_project.domain.transportation.Transportation;

public class CommonObjects {
    public void printAll(Object object) {
        System.out.println(object);
    }

    public Object getObjById(Object[] objects, long iD) {
        for (Object obj : objects) {
            if (commId(obj) == iD)
                return obj;
        }
        return null;
    }
    public void addAnything(Object object){

    }

    private long commId(Object object) {
        Cargo cc=new Cargo();
        if (object instanceof Cargo)
            return ((Cargo) object).getId();
        if (object instanceof Carrier)
            return ((Carrier) object).getId();
        if (object instanceof Transportation)
            return ((Transportation) object).getId();
        return -1;
    }
}
