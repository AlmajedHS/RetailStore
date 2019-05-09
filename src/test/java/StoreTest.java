import org.junit.Test;
/**
 * Created by almajedhs on 5/9/19.
 */

import static org.junit.Assert.*;

public class StoreTest {


    @Test
    public void User_Is_Employee_And_Have_Groceries_And_NonGroceries() {


        System.out.println("Test 1:");
        System.out.println("employee :True, affilate:false, loyality: 0");
        System.out.println("Bill:");
        System.out.println("1 apple:2$ , 1 computer:10$");


        final double expected = 9;

        TotalBill totalBill = new TotalBill();
        Discounts discounts = new Discounts();

        Customer customer = new Customer(true,false,0);

        BillContent billContent[] = new BillContent[2];
        billContent[0] = new BillContent("apple", 1, 2, true);
        billContent[1] = new BillContent("computer", 1, 10, false);

        int totalBillNonGroc = totalBill.calculateTotalBillNonGroceries(billContent);
        int totalBillGroc = totalBill.calculateTotalBillGroceries(billContent);

        int totalBillBeforeDiscounts = totalBillGroc + totalBillNonGroc;

        double nonGrocDiscount = discounts.applyPercentageDiscount(customer, totalBillNonGroc);
        double billDiscounts = discounts.applyBillDiscount(totalBillBeforeDiscounts);

        double totalFinalBill = totalBillBeforeDiscounts - nonGrocDiscount - billDiscounts;

        try {
            assertEquals(totalFinalBill,expected,0.001);
            System.out.println("Pass");
        } catch (AssertionError e) {
            System.out.println("Failed");
            throw e;
        }

        System.out.println();
        System.out.println();



    }
    @Test
    public void User_Is_Affilate_And_Have_Groceries_And_NonGroceries() {

        System.out.println("Test 2:");
        System.out.println("employee :false, affilate:true, loyality: 0");
        System.out.println("Bill:");
        System.out.println("1 apple:2$ , 1 computer:10$");

        final double expected = 11;

        TotalBill totalBill = new TotalBill();
        Discounts discounts = new Discounts();

        Customer customer = new Customer(false,true,0);

        BillContent billContent[] = new BillContent[2];
        billContent[0] = new BillContent("apple", 1, 2, true);
        billContent[1] = new BillContent("computer", 1, 10, false);

        int totalBillNonGroc = totalBill.calculateTotalBillNonGroceries(billContent);
        int totalBillGroc = totalBill.calculateTotalBillGroceries(billContent);

        int totalBillBeforeDiscounts = totalBillGroc + totalBillNonGroc;

        double nonGrocDiscount = discounts.applyPercentageDiscount(customer, totalBillNonGroc);
        double billDiscounts = discounts.applyBillDiscount(totalBillBeforeDiscounts);

        double totalFinalBill = totalBillBeforeDiscounts - nonGrocDiscount - billDiscounts;

        try {
            assertEquals(totalFinalBill,expected,0.001);
            System.out.println("Pass");
        } catch (AssertionError e) {
            System.out.println("Failed");
            throw e;
        }

        System.out.println();
        System.out.println();




    }

    @Test
    public void User_Is_Employee_And_Affilate_And_Loyal_And_Have_Groceries_And_NonGroceries() {

        System.out.println("Test 3:");
        System.out.println("employee :true, affilate:true, loyality: 6");
        System.out.println("Bill:");
        System.out.println("100 apple:2$ , 30 computer:10$, 50 oranges:2$, 1 bag:1000$");

        final double expected = 1130;

        TotalBill totalBill = new TotalBill();
        Discounts discounts = new Discounts();

        Customer customer = new Customer(true,true,0);

        BillContent billContent[] = new BillContent[4];
        billContent[0] = new BillContent("apple", 100, 2, true);
        billContent[1] = new BillContent("computer", 30, 10, false);
        billContent[2] = new BillContent("orange", 50, 2, true);
        billContent[3] = new BillContent("bag", 1, 1000, false);

        int totalBillNonGroc = totalBill.calculateTotalBillNonGroceries(billContent);
        int totalBillGroc = totalBill.calculateTotalBillGroceries(billContent);

        int totalBillBeforeDiscounts = totalBillGroc + totalBillNonGroc;

        double nonGrocDiscount = discounts.applyPercentageDiscount(customer, totalBillNonGroc);
        double billDiscounts = discounts.applyBillDiscount(totalBillBeforeDiscounts);

        double totalFinalBill = totalBillBeforeDiscounts - nonGrocDiscount - billDiscounts;

        try {
            assertEquals(totalFinalBill,expected,0.001);
            System.out.println("Pass");
        } catch (AssertionError e) {
            System.out.println("Failed");
            throw e;
        }

        System.out.println();
        System.out.println();


    }

}