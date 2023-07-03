/**
 * First class -  Class Definition
 *
 */
import java.util.*;
//class definition
public class CustomerInformation
{//start class
    private String custId;
    private int counterPaid;
    private LinkedList<ItemInformation> itemList;

    //constructor without parameter
    public CustomerInformation ()
    {
        custId = "";
        counterPaid = 0;
        itemList = new LinkedList<>();
    }

    //constructor with parameter
    public CustomerInformation (String custId , int counterPaid)
    {
        this.custId = custId;
        this.counterPaid = counterPaid;
        this.itemList = new LinkedList<>();
    }

    //accessor method 
    public String getCustId ()
    {
        return custId;
    }

    public int getCounterPaid ()
    {
        return counterPaid;
    }

    public int getItemQuantity()
    {
        return itemList.size();
    }

    //mutator for each attributes
    public void setCustId (String custId)
    {
        this.custId = custId;
    }

    public void setCounterPaid (int counterPaid)
    {
        this.counterPaid = counterPaid;
    }

    //mutator for itemInfo 
    public void purchaseItem(ItemInformation item) 
    {
        itemList.add(item);
    }

    public void removePurchasedItem(ItemInformation item) 
    {
        itemList.remove(item);
    }
    
    public void addItems(List<ItemInformation> items) 
    {
        itemList.addAll(items);
    }    
    
    public LinkedList<ItemInformation> getAddItem() 
    {
        return itemList;
    }
    public ArrayList<ItemInformation> getItems() 
    {
        return null;
    }

    //display toString "\nCounter Paid : " + counterPaid +
    public String toString ()
    {
        return ("Customer Id : " + custId +  "\nCounter Paid : " + counterPaid + "\nItem Quantity : " + getItemQuantity());        
    }
}//end class