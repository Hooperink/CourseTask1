package by.etc.course_task_four.SimpleClass.TaskTen;

public class AirlineHandler {
    private Airline []airlines;

    AirlineHandler(Airline []airlines){
        this.airlines = airlines;
    }

    public void getPlaneByDestination(String destination){
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().compareTo(destination) == 0){
                System.out.print(airlines[i]);
            }
        }
    }

    public void getPlaneByDayOfWeek(String dayOfWeek){
        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j < airlines[i].getDayOfWeek().length; j++) {
                if(airlines[i].getDayOfWeek()[j].compareTo(dayOfWeek) == 0){
                    System.out.print(airlines[i]);
                }
            }
        }
    }

    public void getPlaneByDayOfWeekAndTime(String dayOfWeek, String time){
        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j < airlines[i].getDayOfWeek().length; j++) {
                if(airlines[i].getDayOfWeek()[j].compareTo(dayOfWeek) == 0 && airlines[i].getFlightTime().compareTo(time) > 0){
                    System.out.print(airlines[i]);
                }
            }
        }
    }
}
