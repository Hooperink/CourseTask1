package by.etc.course_task_four.SimpleClass.TaskEight;

public class Customer {
    private int id;
    private String firstName;
    private String surname;
    private String patronymic;
    private String address;
    private int creditCard;
    private int bankAccountNumber;

    Customer(int id, String firstName, String surname, String patronymic, String address, int creditCard, int bankAccountNumber){
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " +this.firstName + ", Surname: " + this.surname + ", Patronymic: "+ this.patronymic
                + ", Address: " + this.address + ", Credit card: " + this.creditCard + ", Bank account number: " + this.bankAccountNumber + "\n";
    }
}