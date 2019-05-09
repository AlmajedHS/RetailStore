/**
 * Created by almajedhs on 5/9/19.
 */
public class BillContent {

    private String itemName;
    private int itemQuantity;
    private int itemPrice;
    private boolean grocery;

    public BillContent(String itemName,int itemQuantity,int itemPrice, boolean grocery){
        this.itemName =itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.grocery = grocery;
    }

    public String getItemName(){
        return itemName;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }

    public int getItemPrice(){
        return itemPrice;
    }
    public boolean getGrocery(){
        return grocery;
    }


    public void setItemName(String name){
        this.itemName = name;
    }

    public void setItemQuantity(int qunatity){
        this.itemQuantity = qunatity;
    }

    public void setItemPrice(int price){
        this.itemPrice = price;
    }

    public void setGrocery(boolean grocery){
        this.grocery = grocery;
    }



}
