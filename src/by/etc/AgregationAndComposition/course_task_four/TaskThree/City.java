package by.etc.AgregationAndComposition.course_task_four.TaskThree;

public class City {
    private String name;
    City(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Name: " + name;
    }
}
