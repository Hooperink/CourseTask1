package by.etc.AgregationAndComposition.course_task_four.TaskTwo;

public class Wheel {
    private String mark;
    private String seasonType;
    private int id;
    Wheel(String mark, String seasonType, int id){
        this.mark = mark;
        this.seasonType = seasonType;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mark: " + mark + ", type of season: " + seasonType + "\n";
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSeasonType(String seasonType) {
        this.seasonType = seasonType;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getSeasonType() {
        return seasonType;
    }
}
