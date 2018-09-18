package com.codecool;

public class Motorcycle extends Vehicles {
    private int speed = 100;
    private String name;


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
        System.out.println("Motor name: " + this.name + " Speed: " + this.speed + "km/h");
        return this.name;
    }
}
