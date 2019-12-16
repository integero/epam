package ru.epam.lessons.lesson_3.cargo_class;

public abstract class WeightAdnVolume {
    private Float weight;
    private Float length;
    private Float height;
    private Float width;

    public WeightAdnVolume(Float weight, Float length, Float height, Float width) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
}
