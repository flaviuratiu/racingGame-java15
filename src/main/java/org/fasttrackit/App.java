package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();


        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        String vehicleName = scanner.nextLine();
        System.out.println("Entered name: " + vehicleName);

        Scanner scanner2 = new Scanner(System.in);
        int enteredNumber = scanner2.nextInt();

        System.out.println("Welcome to the racing game!");

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        Car carReference = new Car(engine1);
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;
        carReference.fuelLevel = 100;
        carReference.damaged = true;

//        carReference.engine =  new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

        double currentDistance = carReference.accelerate(60, 1);
        System.out.println("Current distance: " + currentDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);

        System.out.println("Is car damaged? " + carReference.damaged);

        // One object with two references

        System.out.println("Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity = 2100;

        System.out.println("Updated engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        // concatenation
        System.out.println("Properties of " + carReference.name);
        System.out.println("Color: " + carReference.color);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

//        carReference = null;

        System.out.println(carReference.name);

        Car car2 = new Car(new Engine());
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println("Properties of " + car2.name);
        System.out.println("Color: " + car2.color);
        System.out.println("Damaged: " + car2.damaged);

        // modulo (modulus) operator
//        System.out.println(4 % 2);
//        System.out.println(4 % 2 == 0);
//        System.out.println(4 % 3);
    }

}
