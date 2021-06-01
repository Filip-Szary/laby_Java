package com.company.devices;

public abstract class Car extends Device {
    public String color;
    public Double mileage;
    public Double value;
    public int horsepower;

    public Car(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }



   /* public String toString() {
        return producer + " " + model + " " + yearOfProduction + "" +
                doors + " " + mileage + " " + horsepower + " " + color + " " +
                engineVolume + " " + value;
    }*/

    @Override
    public void turnOn() {
        System.out.println("Samochód jest włączony");
    }

    public abstract void refuel();

}