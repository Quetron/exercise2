package com.company;

public class Main {

    public static void main(String[] args) {
        String[] cityNames = {"Sunday", "Monday", "Teusday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] currentTemps = {45, 29, 10, 22, 41, 28, 33};
        int[] rainProbability = {95, 60, 25, 5, 0, 75, 90};
        for (int i = 0; i < currentTemps.length; i++) {
            if (currentTemps[i] <= 32 && rainProbability[i] > 50) {
                System.out.println(cityNames[i]);
            }

        }
    }
}