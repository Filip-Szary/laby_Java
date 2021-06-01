package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Filip";
        me.lastName = "Szary";

        Animal dog = new Animal();
        dog.name = "Tramp";
        dog.species = "Jack Russell terrier";
        dog.weight = 10.0;

        Car clio = new Car("Clio", "Renault");
        clio.color = "gray";
        clio.millage = 200000.0;
        clio.engineVolume = 1.2;

        me.pet = dog;

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        System.out.println("Imię zwierzęcia: " + dog.name);
        System.out.println("Obecna waga: " + dog.weight);

        dog.feed();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        System.out.println("Obecna waga: " + dog.weight);

        dog.takeForAWalk();
        dog.feed();

        System.out.println("Auto: " + clio.producer + " " + clio.model);
        me.car = clio;
        System.out.println("Auto Filipa: " + me.car.producer + " " + me.car.model);
    }
}