package by.etc.course_task_four.SimpleClass.TaskFour;


public class Main {
    public static void main(String[] args) {
        Train arr[] = new Train[5];
        arr[0] = new Train("13:23", "Будапешт", 13);
        arr[1] = new Train("14:23", "Будапешт", 17);
        arr[2] = new Train("17:23", "Абнг", 10);
        arr[3] = new Train("11:25", "Бразилия", 19);
        arr[4] = new Train("09:13", "Будапешт", 11);
        arr = Train.sortByNumber(arr);
        System.out.print("Sort by number");
        System.out.println();
        Train.print(arr);
        System.out.println();
        System.out.print("Sort by destination and time");
        System.out.println();
        arr = Train.sortByDestinationAndTime(arr);
        Train.print(arr);
        System.out.println();
        Train.getInfoByNumber(arr, Train.getNumberFromHand());
    }
}
