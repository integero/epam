package ru.epam.lessons.lesson_3.cargo_class;

import java.util.HashSet;

public abstract class Carrier {
    private HashSet<Place> placesOnService;
    private Danger dangerLevel;

    public Carrier(HashSet<Place> placesOnService, Danger dangerLevel) {
        this.placesOnService = placesOnService;
        this.dangerLevel = dangerLevel;
    }

    public Danger getDangerLevel() {
        return dangerLevel;
    }

    public HashSet<Place> getPlacesOnService() {
        return placesOnService;
    }
}
