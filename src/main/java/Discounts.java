/**
 * Created by almajedhs on 5/9/19.
 */
public class Discounts {



    public double applyPercentageDiscount(Customer customer, double bill){
        double discount = 0;
        if(customer.getEmployeeStatus()){
            discount =  bill*0.3;
        }else if(customer.getAffilateStatus()){
            discount =  bill*0.1;
        }else if(customer.getCustomerLoyality() >= 2.00){
            discount =  bill*0.05;
        }

        return  discount;

    }

    public double applyBillDiscount(double bill){

        int numberOfHunBills = (int) bill/100;
        double discount = numberOfHunBills * 5;

        return discount;
    }
}
