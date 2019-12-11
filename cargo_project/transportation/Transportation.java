package epam.cargo_project.transportation;

import epam.cargo_project.cargo.Cargo;
import epam.cargo_project.carrier.Carrier;

import java.util.Date;

public class Transportation {
    private Long id;
    private Cargo cargo;
    private Carrier carrier;
    private String description;
    private String billTo;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(String  strDate) {
/*        int[]  ddd=new int[3];
        for (int i = 0; i < 3; i++) {

            ddd[i]=Integer.parseInt(strDate);
        }
        date.setYear(ddd[2]);
        date.setMonth(ddd[1]);
        date.setDate(ddd[0]);
  */
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
}
