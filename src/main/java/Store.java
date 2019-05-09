import java.util.Scanner;

/**
 * Created by almajedhs on 5/9/19.
 */
public class Store {


    public static void main(String[] args) {


        Groceries groceries = new Groceries();
        TotalBill totalBill = new TotalBill();
        Discounts discounts = new Discounts();
        Customer customer;
        BillContent billContent[];

        Scanner scanner = new Scanner(System.in);
        String exit = "";
        System.out.println("Welcome");

        //add users
        do {
            System.out.println("Is the customer an employee? yes or no");
            String employee = scanner.next();
            employee.toLowerCase();
            boolean isEmployee = false;
            if (employee.equals("yes"))
                isEmployee = true;

            System.out.println("Is the customer an affiliate? yes or no");
            String affiliate = scanner.next();
            affiliate.toLowerCase();
            boolean isAffilate = false;
            if (affiliate.equals("yes"))
                isAffilate = true;

            System.out.println("For how many years this customer has been coming to us?");
            double years = scanner.nextDouble();


            customer = new Customer(isEmployee, isAffilate, years);

            System.out.println("How mnay items are included in the bill?");

            int numberOfItems = scanner.nextInt();

            billContent = new BillContent[numberOfItems];
            for (int i = 0; i < numberOfItems; i++) {
                System.out.println("Enter the item name:");
                String name = scanner.next();

                System.out.println("Enter the item qunatity:");
                int quantity = scanner.nextInt();

                System.out.println("Enter the item price:");
                int price = scanner.nextInt();


                billContent[i] = new BillContent(name.toLowerCase(), quantity, price, groceries.isGrocery(name.toLowerCase()));
            }

            int totalBillNonGroc = totalBill.calculateTotalBillNonGroceries(billContent);
            int totalBillGroc = totalBill.calculateTotalBillGroceries(billContent);

            int totalBillBeforeDiscounts = totalBillGroc + totalBillNonGroc;

            double nonGrocDiscount = discounts.applyPercentageDiscount(customer, totalBillNonGroc);
            double billDiscounts = discounts.applyBillDiscount(totalBillBeforeDiscounts);

            double totalFinalBill = totalBillBeforeDiscounts - nonGrocDiscount - billDiscounts;

            System.out.println("Your total bill after discount is : " + totalFinalBill);

            System.out.println("want to add another bill? enter yes or no");
            exit = scanner.next();

        }while(!exit.equals("no"));

    }

}
