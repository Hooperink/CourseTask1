package by.etc.course_task_four.SimpleClass.TaskNine;

public class BookHandler {

    private Book []book;
    BookHandler(Book []book){
        this.book = book;
    }

    public void getBookByAuthor(String author){
        boolean ifAuthor = false;
        for (int i = 0; i < book.length; i++) {
            if(book[i].getAuthor() == author){
                System.out.print(book[i]);
                ifAuthor = true;
            }
        }
        if (!ifAuthor){
            System.out.print("No such book");
        }
    }

    public void getBookByPublishingHouse(String house){
        boolean ifHouse = false;
        for (int i = 0; i < book.length; i++) {
            if(book[i].getPublishingHouse() == house){
                System.out.print(book[i]);
                ifHouse = true;
            }
        }
        if (!ifHouse){
            System.out.print("No such book");
        }
    }

    public void getBookByYear(int year){
        boolean ifYear = false;
        for (int i = 0; i < book.length; i++) {
            if(book[i].getYearOfPublishing() > year){
                System.out.print(book[i]);
                ifYear = true;
            }
        }
        if (!ifYear){
            System.out.print("No such book");
        }
    }
}
