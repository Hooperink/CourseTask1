package by.etc.course_task_four.SimpleClass.TaskTen;

public class Airline {
    private String destination;
    private int flightNumber;
    private String planeType;
    private String flightTime;
    private String dayOfWeek[];

    Airline(String destination, int flightNumber, String planeType, String flightTime, String dayOfWeek){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.flightTime = flightTime;
        this.dayOfWeek = dayParser(dayOfWeek);
    }

    public static String[] dayParser(String dayOfWeek){
       String []parse;
       parse = dayOfWeek.split("[,.]");
        for (int i = 0; i < parse.length; i++) {
           parse[i] = parse[i].trim();
        }
       return parse;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public String getPlaneType() {
        return planeType;
    }

    public String[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    @Override
    public String toString() {
        StringBuilder k = new StringBuilder("Destination: " + destination + ", flight number: " + flightNumber + ", type of plane: " + planeType +
                ", flight time: " + flightTime + ", day of flight: ");
        for (int i = 0; i < dayOfWeek.length; i++) {
            k.append(dayOfWeek[i]);
            if (i < dayOfWeek.length - 1){
                k.append(", ");
            } else {
                k.append("\n");
            }
        }
        return k.toString();
    }
}

