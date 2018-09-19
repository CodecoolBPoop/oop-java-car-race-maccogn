package com.codecool;

import java.util.Random;

public class RandomGenerator {
    static Random rand = new Random();
    private static String[] firstName= {"Vortex","Fang","Hero", "Majesty", "Guerilla", "Presence", "Sprite", "Olympian","Eminance","Dawn"};
    private static String[] secondName = {"Whirlpool","Basilisk", "Olympian", "Prime", "Blaze", "Aeon", "Prodigy", "Conqueror", "Liberty", "Reach"};

    public static int randomNum(int max, int min){
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String randomName(){
        String first = firstName[randomNum(firstName.length -1,0)];
        String second = secondName[randomNum(secondName.length -1,0)];
        return first+second;
    }
}
