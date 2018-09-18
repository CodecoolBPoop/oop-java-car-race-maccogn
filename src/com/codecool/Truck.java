package com.codecool;

public class Truck extends Vehicles {
    private int speed = 100;
    private String name;
    private boolean breakDown = false;


    public void setSpeed(){
        this.speed = 100/3;
    }

    public int getSpeed(){
        return speed;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBreakDown(){
        if(RandomGenerator.randomNum(100,0)<5){
            this.breakDown = true;
        }
    }

    public String getName(){
        System.out.println("Truck name: " + this.name + " Speed: " + this.speed + "km/h" + " Break Down "+ breakDown);
        return this.name;
    }

    public boolean getBreakDown(){ return breakDown;}
}
