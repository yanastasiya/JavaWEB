package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Train implements Comparable{
    String destination;
    int numberOfTrain;
    Time departureTime;

    public Train(String destination, int numberOfTrain, Time departureTime) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
    }
    public void showInformation(int number, ArrayList<Train> trains){
        System.out.println("Enter number of train:");
        //Scanner in=new Scanner();

        int count=0;
        for(int i=0; i<5; i++){
            if(number== trains.get(i).numberOfTrain){
                System.out.println(trains.get(i).toString());
                count++;
            }
        }
        if(count==0){
            System.out.println("We don't have trains with this number");
        }
        return;
    }
    public void showAllTrains(ArrayList<Train> trains){
        for(int i=0; i<5; i++){
            System.out.println(trains.get(i).toString());
        }
        return;
    }
    /*public Train[] sortNumber(Train[] trains){
        Train[] tempTrains=new Train[5];
        Train min;
        for(int i=0; i<5; i++){
            for(int j=i+1; i<5; j++){
                if(trains[i].numberOfTrain<trains[j].numberOfTrain){
                    min=trains[i];
                }else{
                    min=trains[j];
                }
            }
            tempTrains[i]=min;
        }
        return tempTrains;
    }*/

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", departureTime=" + departureTime +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
