/**
 * Created by almajedhs on 5/9/19.
 */
public class Customer {

    private boolean employee;
    private boolean affilate;
    private double custmerLoyality;

    public Customer(boolean employee, boolean affilate, double customerLoyality){
        this.employee = employee;
        this.affilate = affilate;
        this.custmerLoyality = customerLoyality;
    }

    public boolean getEmployeeStatus(){
        return employee;
    }
    public boolean getAffilateStatus(){
        return affilate;
    }
    public double getCustomerLoyality(){
        return custmerLoyality;
    }

    public void setEmployeeStatus(boolean employee){
        this.employee = employee;
    }
    public void setAffilateStatus(boolean affilate){
        this.affilate = affilate;
    }
    public void affiliate(double customerLoyality){
        this.custmerLoyality = customerLoyality;
    }


}
