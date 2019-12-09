package epam.lesson_3.cargo_class;

public abstract class Transportation {
    private Cargo cargo;
    private Carrier carrier;
    private Place from;
    private Place to;
    public Transportation(Cargo cargo, Carrier carrier, Place from, Place to) {
        this.cargo = cargo;
        this.carrier = carrier;
        this.from = from;
        this.to = to;
    }
}
