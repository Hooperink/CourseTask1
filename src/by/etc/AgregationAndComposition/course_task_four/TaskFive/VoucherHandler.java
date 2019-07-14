package by.etc.AgregationAndComposition.course_task_four.TaskFive;

public class VoucherHandler {
    private Voucher []vouchers;
    private int days;
    private String []transport;
    private String country;
    private String typeOfVoucher;
    private String typeOfFood;
    VoucherHandler(int days, String country, String typeOfFood, String typeOfVoucher, String ... transport){
        this.days = days < 0 ? 0 : days;
        this.country = country;
        this.typeOfFood = typeOfFood;
        this.typeOfVoucher = typeOfVoucher;
        this.transport = transport;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTransport(String[] transport) {
        this.transport = transport;
    }

    public void setTypeOfVoucher(String typeOfVoucher) {
        this.typeOfVoucher = typeOfVoucher;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setVouchers(Voucher[] vouchers) {
       this.vouchers = vouchers;
    }

    public String getCountry() {
        return country;
    }

    public String[] getTransport() {
        return transport;
    }

    public String getTypeOfVoucher() {
        return typeOfVoucher;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getDays() {
        return days;
    }

    public  Voucher[] getVouchers() {
        return vouchers;
    }

    public void printVouchers(){
        for (int i = 0; i < vouchers.length; i++) {
            System.out.print(vouchers[i]);
        }
    }

    public void unsetVoucher(int i){
        Voucher []buffer = new Voucher[vouchers.length - 1];
        for (int j = 0, k = 0; j < vouchers.length;k++, j++) {
            if (j == i && i != vouchers.length - 1){
                j++;
            }
            if (j == i && i == vouchers.length - 1){
                break;
            }
            buffer[k] = vouchers[j];
        }
        this.vouchers = buffer;
    }

    public Voucher[] findVoucher() {
        for (int i = 0; i < vouchers.length; i++) {
            if (days < vouchers[i].getDays() && days != 0 ||
                    (country.compareTo(vouchers[i].getCountry()) != 0 && country.compareTo("") != 0) ||
                    (typeOfFood.compareTo(vouchers[i].getTypeOfFood()) != 0 && typeOfFood.compareTo("") != 0) ||
                    (typeOfVoucher.compareTo(vouchers[i].getTypeOfVoucher()) != 0 && typeOfVoucher.compareTo("") != 0) ||
                    !checkForTransport(vouchers[i])) {
                         unsetVoucher(i);
                         i--;
                    }
        }
        return vouchers;

    }

    public boolean checkForTransport(Voucher voucher){
        boolean isTransport = false;
        if (transport.length == 1 && transport[0].compareTo("") == 0){
            return isTransport = true;
        }
            String []buff = voucher.getTransport();
        for (int i = 0; i < transport.length; i++) {
            for (int j = 0; j < buff.length; j++) {
                if (transport[i].compareTo(buff[j]) == 0){
                   return isTransport = true;
                }
            }
        }
        return isTransport;
    }

    public void sortByDays(){
        for (int i = 0; i < vouchers.length - 1; i++) {
             int max = i;
            for (int j = i + 1; j < vouchers.length; j++) {
                if (vouchers[j].getDays() < vouchers[max].getDays()){
                    max = j;
                }
            }
            Voucher buff = vouchers[max];
            vouchers[max] = vouchers[i];
            vouchers[i] = buff;
        }
    }
    public void sortByContry(){
        for (int i = 0; i < vouchers.length - 1; i++) {
             int max = i;
            for (int j = i + 1; j < vouchers.length; j++) {
                if (vouchers[j].getCountry().compareTo(vouchers[max].getCountry()) < 0){
                    max = j;
                }
            }
            Voucher buff = vouchers[max];
            vouchers[max] = vouchers[i];
            vouchers[i] = buff;
        }
    }
}
