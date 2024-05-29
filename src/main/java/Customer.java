public class Customer {
    private  String type;
    private  double totalAmount;

    public Customer(String type, double totalAmount) {
        this.type = type;
        this.totalAmount = totalAmount;
    }

    public String getType() {
        return type;
    }


    public double getTotalAmount() {
        return totalAmount;
    }

}
//
//class DiscountCalculator {
//    public double calculateDiscount(Customer customer) {
//        if (customer.getType().equals("Regular")) {
//            return customer.getTotalAmount() * 0.1;
//        } else if (customer.getType().equals("VIP")) {
//            return customer.getTotalAmount() * 0.2;
//        } else if (customer.getType().equals("SpecialEvent")) {
//            return customer.getTotalAmount() * 0.3;
//        }
//        return 0;
//    }
//}
interface DiscountCalculator{
    public double calculateDiscount(Customer customer);
}

class RegularCustomer implements DiscountCalculator{

    @Override
    public double calculateDiscount(Customer customer) {
        return customer.getTotalAmount() * 0.1;
    }
}


class VIPCustomer implements DiscountCalculator{

    @Override
    public double calculateDiscount(Customer customer) {
        return customer.getTotalAmount() * 0.2;
    }
}