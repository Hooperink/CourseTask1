package by.etc.AgregationAndComposition.course_task_four.TaskFive;

public class Main {
    public static void main(String[] args) {
        Voucher []vouchers = new Voucher[6];
        vouchers[0] = new Voucher(12,"Egypt", "AI", "Vacation", "Plane", "Bus");
        vouchers[1] = new Voucher(11,"Egypt", "AI", "Vacation", "Plane", "Bus", "Train");
        vouchers[2] = new Voucher(19,"Turkey", "NAI", "Vacation", "Plane", "Bus");
        vouchers[3] = new Voucher(18,"Turkey", "None", "Vacation", "Plane", "Bus", "Ship");
        vouchers[4] = new Voucher(21,"Albania", "AI", "Vacation", "Train", "Bus");
        vouchers[5] = new Voucher(17,"Egypt", "NAI", "Health", "Plane", "Bus");

        VoucherHandler voucherHandler = new VoucherHandler(18, "", "AI", "", "Train", "Ship");
        voucherHandler.setVouchers(vouchers);
        //voucherHandler.findVoucher();
        voucherHandler.printVouchers();
        voucherHandler.sortByContry();
        System.out.println();
        voucherHandler.printVouchers();
    }
}
