package epam.lesson_3.cargo_class;

public abstract class Cargo {
    private String name;
    private Integer barcode;
    private Fragile fragile;
    private Danger danger;
    private WeightAdnVolume weightAdnVolume;

    public Cargo(String name, Integer barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }

    public Fragile getFragile() {
        return fragile;
    }

    public void setFragile(Fragile fragile) {
        this.fragile = fragile;
    }

    public Danger getDanger() {
        return danger;
    }

    public void setDanger(Danger danger) {
        this.danger = danger;
    }

    public WeightAdnVolume getWeightAdnVolume() {
        return weightAdnVolume;
    }

    public void setWeightAdnVolume(WeightAdnVolume weightAdnVolume) {
        this.weightAdnVolume = weightAdnVolume;
    }
}
