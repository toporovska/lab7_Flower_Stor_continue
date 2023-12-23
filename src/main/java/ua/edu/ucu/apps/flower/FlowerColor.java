package ua.edu.ucu.apps.flower;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("red"), GREEN("gree"), BLUE("blue");

    private String value;

    FlowerColor(String value) {
        this.value = value;
    }
    @JsonValue 
    public String toString() {
        return value;
    }
}
