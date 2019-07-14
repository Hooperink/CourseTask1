package by.etc.AgregationAndComposition.course_task_four.TaskFive;

public class Voucher {
    private int days;
    private String []transport;
    private String country;
    private String typeOfVoucher;
    private String typeOfFood;
    Voucher(int days, String country, String typeOfFood, String typeOfVoucher, String ... transport){
        this.days = days;
        this.country = country;
        this.typeOfFood = typeOfFood;
        this.typeOfVoucher = typeOfVoucher;
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public String getCountry() {
        return country;
    }

    public String[] getTransport() {
        return transport;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getTypeOfVoucher() {
        return typeOfVoucher;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setTransport(String[] transport) {
        this.transport = transport;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void setTypeOfVoucher(String typeOfVoucher) {
        this.typeOfVoucher = typeOfVoucher;
    }

    @Override
    public String toString() {
        StringBuilder k = new StringBuilder();
        k.append("Days: " + days + ", country: " + country + ", type of voucher: " + typeOfVoucher + ", type of food: "
         + typeOfFood + ", transport: ");
        for (int i = 0; i < transport.length; i++) {
            if (i != transport.length - 1){
                k.append(transport[i] + ", ");
            } else {
                k.append(transport[i] + "\n");
            }
        }
        return k.toString();
    }
}
