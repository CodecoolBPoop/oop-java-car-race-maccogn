package com.codecool;

public class Vehicles {
    private double moveForAnHour;
    private int distanceTraveled;

    public void setMoveForAnHour(){

    }

    public void setDistanceTraveled(int hour, int speed){
        this.distanceTraveled = hour*speed;
    }

    public int getDistanceTraveled(){
        return distanceTraveled;
    }

}
