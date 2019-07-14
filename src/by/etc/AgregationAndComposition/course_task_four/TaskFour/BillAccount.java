package by.etc.AgregationAndComposition.course_task_four.TaskFour;

public class BillAccount {
    private int accountNumber;
    private boolean isBlocked = false;
    private Client client;
    private int balance;
    BillAccount(int accountNumber, boolean isBlocked, int balance){
        this.accountNumber = accountNumber;
        this.isBlocked = isBlocked;
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBlocked(boolean blocked) {
        this.isBlocked = blocked;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean getIsBloсked(){
        return isBlocked;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Client: " + this.client.getName() + " " + this.client.getSurname() + " " + this.client.getPatronymic()
                + ", account number: " + this.accountNumber + ", balance: " + this.balance +
                ", status (is blocked): " + this.isBlocked;
    }
}
