package com.codecool;

public class Motorcycle extends Vehicles {
    private int speed = 100;
    private String name;
    private int distanceTraveled;
    private double moveForAnHour;

    public void setSpeed(boolean isRaining, boolean breakdown) {
        if(breakdown){ this.speed = 75; }
        if(isRaining) {
            this.speed = this.speed - RandomGenerator.randomNum(50, 5);
        }
    }

    public int getSpeed(){ return speed;}

    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        System.out.println("Motor name: " + this.name + " Speed: " + this.speed + "km/h" + " Distance Traveled: " + distanceTraveled);
        return this.name;
    }
}
