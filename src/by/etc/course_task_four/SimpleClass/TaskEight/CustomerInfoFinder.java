package by.etc.course_task_four.SimpleClass.TaskEight;

public class CustomerInfoFinder {
    private Customer []arr;
    CustomerInfoFinder(Customer []arr){
        this.arr = arr;
    }

    public void sortBySurname(){
        System.out.print("Sorting by surname.\n");
        for (int i = 0; i < this.arr.length - 1 ; i++) {
            int max = i;
            for (int j = i + 1; j < this.arr.length ; j++) {
                if (arr[j].getSurname().compareTo(arr[max].getSurname()) < 0){
                    max = j;
                }
            }
            Customer buffer = arr[max];
            arr[max] = arr[i];
            arr[i] = buffer;
        }
    }

    public void printInfo(){
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public void getByCards(int min, int max){
        if (min > max){
            int buff = max;
            max = min;
            min = buff;
        }
        System.out.print("Get info by cards in range from " + min + " to " + max + "\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCreditCard() <= max && arr[i].getCreditCard() >= min){
                System.out.print(arr[i]);
            }
        }
    }
}
