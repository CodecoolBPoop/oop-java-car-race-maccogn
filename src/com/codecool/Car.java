package com.codecool;



public class Car extends Vehicles{
    private int speed;
    private String name;

    public void setSpeed(boolean breakdown){
        if(breakdown){
            this.speed = 75;}else{
            this.speed = RandomGenerator.randomNum(110,80);}
    }

    public int getSpeed(){
        return speed;
    }

    public void setName(){
        this.name = RandomGenerator.randomName();
    }

    public String getName(){
        System.out.println("Car name: " + this.name + " Speed: " + this.speed + "km/h");
        return this.name;
    }
}
