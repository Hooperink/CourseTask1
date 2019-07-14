package by.etc.course_task_four.SimpleClass.TaskNine;

public class Book {
    int id;
    String bookName;
    String publishingHouse;
    String author;
    int yearOfPublishing;
    int numberOfPages;
    int price;
    String bindingType;


    Book(int id, String bookName, String publishingHouse, String author, int yearOfPublishing, int numberOfPages, int price, String bindingType){
        this.id = id;
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public String getBindingType() {
        return bindingType;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", book Name: " + bookName + ", publishing house: " + publishingHouse +", author: "+ author + ", the year of publishing: " + yearOfPublishing +
                ", number of pages: " + numberOfPages + ", price: " + price + ", type of binding: " + bindingType + "\n";
    }
}
