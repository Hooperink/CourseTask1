package by.etc.course_task_four.SimpleClass.TaskEight;

public class Main {
    public static void main(String[] args) {
        Customer []arr = new Customer[5];
        arr[0] = new Customer(1, "Bsd","Bsd", "Asd", "Osh", 123, 2343);
        arr[1] = new Customer(2, "Asd","Qsd", "Asd", "Osh", 43541, 2343);
        arr[2] = new Customer(3, "Qsd","Asd", "Asd", "Osh", 7564, 2343);
        arr[3] = new Customer(4, "Tsd","Rsd", "Asd", "Osh", 32423, 2343);
        arr[4] = new Customer(5, "Ard","Zsd", "Asd", "Osh", 512321, 2343);
        CustomerInfoFinder customerInfoFinder = new CustomerInfoFinder(arr);
        customerInfoFinder.printInfo();
        System.out.println();
        //customerInfoFinder.sortBySurname();
        //customerInfoFinder.printInfo();
        customerInfoFinder.getByCards(1, 9000);

    }
}
