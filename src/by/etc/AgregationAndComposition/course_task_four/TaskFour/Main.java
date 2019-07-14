package by.etc.AgregationAndComposition.course_task_four.TaskFour;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Arthur", "Conan","Olegovich");
        Client client2 = new Client("Mih", "Lon","Vikro");
        BillAccount billAccount = new BillAccount(1243212425, false, 450);
        BillAccount billAccount2 = new BillAccount(23523425, false, -400);
        BillAccount billAccount3 = new BillAccount(526234425, false, 600);
        BillAccount billAccount4 = new BillAccount(94544425, false, -1233);
        BillAccount billAccount5 = new BillAccount(6743525, true, 600);
        BillAccount billAccount6 = new BillAccount(37654, false, 9432);
        BillAccount billAccount7 = new BillAccount(321136, true, 456);
        BillAccount billAccount8 = new BillAccount(87652, false, -87);
        Bank bank = new Bank("Bnb",client, client2);
        client.setBillAccounts(billAccount,billAccount2,billAccount4,billAccount5,billAccount6);
        client2.setBillAccounts(billAccount3, billAccount7, billAccount8);
        billAccount.setClient(client);
        billAccount2.setClient(client);
        billAccount3.setClient(client2);
        billAccount4.setClient(client);
        billAccount5.setClient(client);
        billAccount6.setClient(client);
        billAccount7.setClient(client2);
        billAccount8.setClient(client2);
        bank.setBillAccounts(billAccount, billAccount2, billAccount3, billAccount4, billAccount5, billAccount6, billAccount7, billAccount8);
        bank.sortBills();
        System.out.println(client + ", total balance: " + client.balanceOfClient());
        client.ptintNegativeAndPositiveBalance();

    }
}
