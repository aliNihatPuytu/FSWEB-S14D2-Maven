package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private Boolean battery;
    private Integer globRating;

    public Lamp(LampType style, Boolean battery, Integer globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public Boolean isBattery() {
        return battery;
    }

    public Integer getGlobRating() {
        return globRating;
    }
}
