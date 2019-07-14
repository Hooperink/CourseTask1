package by.etc.course_task_two.course.task2_4;

//Являются ли 3 числа взаимно простыми?

public class DecompositionTaskSix {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 7;
        isSimple(a,b,c);
    }

    public static void isSimple(int a, int b, int c){
        if ((DecompositionTaskOne.getNOD(DecompositionTaskOne.getNOD(a,b),c)) == 1){
            System.out.print("Mutually simple");
        } else {
            System.out.print("Not mutually simple");
        }
    }
}
