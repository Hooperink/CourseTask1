package by.etc.course_task_four.SimpleClass.TaskNine;

public class Main {
    public static void main(String[] args) {
        Book []books = new Book[5];
        books[0] = new Book(1, "Harry", "Rosmen", "Rouling", 2001, 900, 30, "s");
        books[1] = new Book(2, "Hay", "Rosn", "Rouling", 1390, 245, 30, "b");
        books[2] = new Book(3, "Prty", "Ert", "Rkl", 2100, 543, 30, "a");
        books[3] = new Book(4, "Hgrw", "Opre", "NOT ME", 1940, 34, 30, "c");
        books[4] = new Book(5, "Qwea", "Rosmen", "ME", 2001, 1111, 30, "ab");

        BookHandler bookHandler = new BookHandler(books);
        //bookHandler.getBookByAuthor("Rouling");
        //bookHandler.getBookByPublishingHouse("Ert");
        bookHandler.getBookByYear(2000);
    }
}
