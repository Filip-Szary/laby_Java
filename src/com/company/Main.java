package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Filip", "Szary");
        Pet cat = new Pet("Brytyjski", 20.0, "Kitku", null);
        FarmAnimal cow = new FarmAnimal("limousine", 150.0, "Krówka", null);
        Car clio = new Car("Clio", "Reanult", 2010, 5);
        Phone phone = new Phone("Samsung", "Galaxy s21+", 2021, 6.7, "Android");
        me.pet = cat;
        clio.value = 15000.0;

        cat.feed();
        cow.feed();

        cat.takeForAWalk();
        cow.beEaten();
        cow.beEaten();
    }
}