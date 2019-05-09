import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by almajedhs on 5/9/19.
 */
public class Groceries {

    private String groceriesList[];

    public Groceries(){
        groceriesList = new String[]{"apple","orange","bakery","bread","meat","seafood","pasta","rice",
                "oil","egg","milk","juice","cheese","banana","chicken","cereal","fruit","vegetables",
                "snacks","food","peppers","berries","avocados","date",};
    }

    public String[] getGroceriesList(){
        return groceriesList;
    }

    public boolean isGrocery(String item){
        ArrayList tmpArray = new ArrayList(Arrays.asList(groceriesList));
        if(tmpArray.contains(item)){
            return true;
        }
        return false;
    }
    public void printGroceiesList(){
        for(int i = 0;i<groceriesList.length;i++){
            if(i < groceriesList.length-1){
                System.out.print(groceriesList[i] + " ");
            }else{
                System.out.println(groceriesList[i]);
            }

        }
    }

    public void addGrocery(String item){
        ArrayList tmpArray = new ArrayList(Arrays.asList(groceriesList));
        tmpArray.add(item);
        groceriesList = (String[]) tmpArray.toArray(new String[tmpArray.size()]);
    }
}
