package com.company.devices;

public abstract class Device {
    final String producer;
    final String model;
    public final int yearOfProduction;
    public Double value;

    public Device(String producer, String model, int yearOfProduction, double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}
