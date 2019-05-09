/**
 * Created by almajedhs on 5/9/19.
 */
public class TotalBill {

    public int calculateTotalBillNonGroceries(BillContent[] billContents){
        int totalBillNonGroc = 0;

        for(int i = 0;i<billContents.length;i++){

            if(!billContents[i].getGrocery()){
                int tmp =  billContents[i].getItemPrice() * billContents[i].getItemQuantity();
                totalBillNonGroc += tmp;
            }

        }

        return totalBillNonGroc;
    }

    public int calculateTotalBillGroceries(BillContent[] billContents){
        int totalBillNonGroc = 0;

        for(int i = 0;i<billContents.length;i++){

            if(billContents[i].getGrocery()){
                int tmp =  billContents[i].getItemPrice() * billContents[i].getItemQuantity();
                totalBillNonGroc += tmp;
            }

        }

        return totalBillNonGroc;
    }
}
