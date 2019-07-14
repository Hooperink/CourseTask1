package by.etc.course_task_four.SimpleClass.TaskTen;

public class Main {
    public static void main(String[] args) {
        Airline []airlines = new Airline[5];
        airlines[0] = new Airline("Madrid", 123, "B", "13:20", "Monday, Friday");
        airlines[1] = new Airline("Spain", 321, "C", "21:42", "Tuesday");
        airlines[2] = new Airline("France", 533, "A", "09:17", "Wednesday, Saturday");
        airlines[3] = new Airline("Gong Kong", 893, "AC", "17:55", "Friday");
        airlines[4] = new Airline("Minsk", 711, "DC", "14:00", "Sunday");
        AirlineHandler airlineHandler = new AirlineHandler(airlines);

       // airlineHandler.getPlaneByDayOfWeek("Friday");
        airlineHandler.getPlaneByDayOfWeekAndTime("Friday", "13:00");
    }
}
