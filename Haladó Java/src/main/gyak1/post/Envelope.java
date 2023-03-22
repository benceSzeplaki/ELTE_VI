package main.gyak1.post;

import main.gyak1.City;

public class Envelope {

    private City cityToSend;
    private final int zipCode;

    public Envelope(City city) {
        this.cityToSend = city;
        this.zipCode = city.getZipCode();
    }

    public Envelope(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return this.zipCode;
    }
}
