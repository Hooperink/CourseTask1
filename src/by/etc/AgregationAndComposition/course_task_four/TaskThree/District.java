package by.etc.AgregationAndComposition.course_task_four.TaskThree;

public class District {
    private String name;
    private int square;
    City []cities;
    District(String name, int square, City ... cities){
        this.name = name;
        this.square = square;
        this.cities = cities;
    }

    public City[] getCities() {
        return cities;
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
