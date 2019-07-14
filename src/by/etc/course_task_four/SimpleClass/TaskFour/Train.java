package by.etc.course_task_four.SimpleClass.TaskFour;

import java.util.Scanner;

public class Train {
    private String departureTime;
    private String destination;
    private int trainNumber;

    Train (String departureTime, String destination, int trainNumber){
        this.departureTime = departureTime;
        this.destination = destination;
        this.trainNumber = trainNumber;
    }

    public void printInfo(){
        System.out.print("Train number " + trainNumber + " leave for " + destination + " at " + departureTime);
    }

    public int getTrainNumber (){
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public static void getInfoByNumber(Train arr[], int number){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getTrainNumber() == number){
                arr[i].printInfo();
                System.out.println();
                flag = true;
            }
        }
        if(!flag) {
            System.out.print("There is no such train");
            System.out.println();
        }
    }

    public static  void print(Train arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i].printInfo();
            System.out.println();
        }
    }

    public static Train[] sortByDestination (Train arr[] ){
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j - 1].getDestination().compareTo(arr[j].getDestination()) > 0 ){
                    max = j;
                }
                Train buffer = arr[i];
                arr[i] = arr[max];
                arr[max] = buffer;
            }

        }
        return arr;
    }

    public static Train[] sortByDestinationAndTime (Train arr[]){
        arr = sortByDestination(arr);
        int start = 0, end = 0;
        for (int i = 0, j = i + 1; j < arr.length; i++) {
            if (arr[i].getDestination().compareTo(arr[j].getDestination()) == 0){
                start = i;
                while (j < arr.length && arr[i].getDestination().compareTo(arr[j].getDestination()) == 0){
                    j++;
                }
                end = j;
            }
        }
        return sortByTime(arr, start, end);
    }

    public static Train[] sortByTime (Train arr[], int start, int end){
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end ; j++) {
                if (arr[j - 1].getDepartureTime().compareTo(arr[j].getDepartureTime()) > 0 ){
                    Train buffer = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        return arr;
    }

    public static Train[] sortByNumber(Train arr[]){
        int max;
        Train buffer;
        for (int i = 0; i < arr.length - 1 ; i++) {
            max = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[max].getTrainNumber() < arr[j].getTrainNumber()){
                    max = j;
                }
            }
            buffer = arr[i];
            arr[i] = arr[max];
            arr[max] = buffer;
        }
        return arr;
    }

    public static int getNumberFromHand(){
        Scanner in = null;
        int k = 0;
        try{
            in = new Scanner(System.in);
            System.out.print("Enter number of train" + "\n");
            if (in.hasNextInt()){
                k = in.nextInt();
            }
        } finally {
            if (in != null){
                in.close();
            }
        }
        return k;
    }
}
