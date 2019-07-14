package by.etc.AgregationAndComposition.course_task_four.TaskFour;

public class Bank {
    private String name;
    private Client []clients = new Client[0];
    private BillAccount []billAccounts = new BillAccount[0];
    Bank(String name, Client ... clients){
        this.name = name;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClients(Client ... clients) {
        Client []clients1 = new Client[clients.length + this.clients.length];
        for (int i = 0; i < this.clients.length; i++) {
            clients1[i] = this.clients[i];
        }
        for (int j = this.clients.length, k = 0; j < clients1.length; j++, k++){
            clients1[j] = clients[k];
        }
        this.clients = new Client[clients1.length];
        this.clients = clients1;
    }

    public BillAccount[] getBillAccounts() {
        return billAccounts;
    }

    public void setBillAccounts(BillAccount ... billAccounts) {
        BillAccount []billAccounts1 = new BillAccount[billAccounts.length + this.billAccounts.length];
        for (int i = 0; i < this.billAccounts.length; i++) {
            billAccounts1[i] = this.billAccounts[i];
        }
        for (int i = this.billAccounts.length, k = 0; i < billAccounts.length ; i++, k++) {
            billAccounts1[i] = billAccounts[k];
        }
        this.billAccounts = new BillAccount[billAccounts1.length];
        this.billAccounts = billAccounts1;
    }

    public void blockBill(int i){
        for (int j = 0; j < billAccounts.length; j++) {
            if(billAccounts[j].getAccountNumber() == i){
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

    public void sortBills(){
        for (int i = 0; i < this.billAccounts.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < this.billAccounts.length; j++) {
                if (billAccounts[j].getBalance() > billAccounts[max].getBalance()) {
                    max = j;
                }
            }
                BillAccount buff = this.billAccounts[i];
                this.billAccounts[i] = this.billAccounts[max];
                this.billAccounts[max] = buff;

        }
    }

    public int balanceOfAllAccounts(){
        int sum = 0;
        for (int i = 0; i < this.clients.length; i++) {
            sum += clients[i].balanceOfClient();
        }
        return sum;
    }
}
