package com.codecool;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Race {
    static ArrayList<Car> Cars = new ArrayList<Car>();
    static ArrayList<Motorcycle> Motors = new ArrayList<Motorcycle>();
    static ArrayList<Truck> Trucks = new ArrayList<Truck>();
    static boolean isThereABrokenTruck = false;


    public static void main(String[] args) {
	// write your code here
        Weather actual = new Weather();
        actual.setRaining();
        boolean Raining = actual.isRaining();

        for(int round = 0 ; round< 51; round++){
            System.out.println("Round: "+round);
            System.out.println("Weather: " );
            System.out.print(Raining ? "Its raining \n" : "It s sunny day \n");
            Cars.clear();
            Motors.clear();
            Trucks.clear();
            isThereABrokenTruck = false;
            Race.fillVehicles(Raining);
            for(Car vehicle: Cars){
                vehicle.getName();
            }
            for(Motorcycle motor: Motors){
                motor.getName();
            }
            for(Truck truck: Trucks){
                truck.getName();
            }
        }

    }

    public static void fillVehicles(boolean raining){
        for(int i = 0; i <10; i++){
            Truck truck = new Truck();
            truck.setName(String.valueOf(RandomGenerator.randomNum(1000,0)));
            truck.setBreakDown();
            truck.setSpeed(isThereABrokenTruck);
            if(truck.getBreakDown()) {
                isThereABrokenTruck = true;
                for(Truck vehicle: Trucks){
                    vehicle.setSpeed();
                }
                truck.setBreakDownSpeed();
            }
            Trucks.add(truck);

        }

        for (int i= 0; i< 10; i++){
            Car car= new Car();
            car.setSpeed(isThereABrokenTruck);
            car.setName();
            Cars.add(car);


            Motorcycle motor = new Motorcycle();
            motor.setSpeed(raining, isThereABrokenTruck);
            motor.setName("Motorcycle"+i);
            Motors.add(motor);
        }


    }
}
