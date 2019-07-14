package by.etc.AgregationAndComposition.course_task_four.TaskFour;

public class Client {
    private String name;
    private String surname;
    private String patronymic;
    private BillAccount []billAccounts = new BillAccount[0];
    Client(String name, String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public void setBillAccounts(BillAccount ... billAccounts) {
        BillAccount []billAccounts1 = new BillAccount[this.billAccounts.length + billAccounts.length];
        for (int i = 0; i < this.billAccounts.length; i++) {
            billAccounts1[i] = this.billAccounts[i];
        }
        for (int i = this.billAccounts.length, k = 0; i < billAccounts1.length ; i++, k++) {
            billAccounts1[i] = billAccounts[k];
        }
        this.billAccounts = new BillAccount[billAccounts1.length];
        this.billAccounts = billAccounts1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public BillAccount[] getBillAccounts() {
        return billAccounts;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }
    public void blockBill(int i){
        for (int j = 0; j < billAccounts.length; j++) {
            if(this.billAccounts[j].getAccountNumber() == i){
                if (billAccounts[j].getIsBloсked()){
                    System.out.print("Unblocked");
                    billAccounts[j].setBlocked(false);
                } else {
                    System.out.print("Locked");
                    billAccounts[j].setBlocked(true);
                }
            }
        }
    }

    public int balanceOfClient(){
        int sum = 0;
        for (int i = 0; i < this.billAccounts.length; i++) {
            sum += this.billAccounts[i].getBalance();
        }
        return sum;
    }

    public void ptintNegativeAndPositiveBalance(){
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < billAccounts.length ; i++) {
            if (billAccounts[i].getBalance() > 0){
                positive += billAccounts[i].getBalance();
            }
            if (billAccounts[i].getBalance() < 0){
                negative += billAccounts[i].getBalance();
            }
        }
        System.out.print("Positive balance: " + positive + ", negative balance: " + negative);
    }

    @Override
    public String toString() {
        return "Client: " + this.name + " " + this.surname + " " + this.patronymic;
    }
}
