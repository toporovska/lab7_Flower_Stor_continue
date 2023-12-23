package ua.edu.ucu.apps.flower;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FlowerType {
    CHAMOMILE("chamomile"), ROSE("rose"), TULIP("tulip");

    private String value;

    FlowerType(String value) {
        this.value = value;
    }
    @JsonValue
    public String toString() {
        return value;
    }
}
