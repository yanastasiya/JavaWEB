package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train("Moskow", 23455, new Time(23, 45)));
        trains.add(new Train("Moskow", 76549, new Time(22, 43)));
        trains.add(new Train("Moskow", 48710, new Time(16, 52)));
        trains.add(new Train("Moskow", 39858, new Time(9, 49)));
        trains.add(new Train("Moskow", 16740, new Time(14, 12)));
        System.out.println(trains(1).getNumberOfTrain(1).compareTo(trains.get(0)));
        trains.get(1).showAllTrains(trains);
        trains.get(1).showInformation(23455, trains);
        trains.get(1).showAllTrains(trains);
    }
}
