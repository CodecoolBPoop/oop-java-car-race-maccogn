package com.codecool;

public class Weather {
    private boolean raining;

    public boolean isRaining(){
        return raining;
    }

    public void setRaining(){
        if(RandomGenerator.randomNum(100,0)>69){
            this.raining = true;}
        else {
            this.raining = false;
        }
    }
}
