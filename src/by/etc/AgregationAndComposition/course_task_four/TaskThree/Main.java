package by.etc.AgregationAndComposition.course_task_four.TaskThree;

public class Main {
    public static void main(String[] args) {
        State state = new State(new City("Minsk"),"BY",
                new Region("Grodnenskaya", new City("Grodno"), new District("Oshmianskiy",260000, new City("Osh"))),
                new Region("Gomelskaya", new City("Gomel"), new District("Berez", 585000, new City("berez"))),
                new Region("Mogilevsk", new City("Mogilev"), new District("Shul", 3414000, new City("QQQ"))));

        System.out.println("Ammount of regions: " + state.getRegions().length);
        System.out.println("Capital: " + state.getCapital().getName());
        System.out.println("Square: " + state.getSquare());
        state.getRegionsCities();
    }

}
