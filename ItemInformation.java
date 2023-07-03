public class ItemInformation 
{//open class
    //declare attributes
    private String itemId;
    private String itemName;
    private double itemPrice;
    private String datePurchase;

    
    //constructor without parameter
    public ItemInformation()
    {
        itemId = "";
        itemName = "";
        itemPrice = 0.0;
        datePurchase = "";
    }//end of contructor without parameter
    
    //constructor with parameter
    public ItemInformation(String itemId, String itemName, double itemPrice, String datePurchase)
    {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.datePurchase = datePurchase;
    }
    
    //mutator 
    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public void setItemName (String itemName)
    {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    public void setDatePurchase (String datePurchase)
    {
        this.datePurchase = datePurchase;
    }

    //accessor 
    public String getItemId ()
    {
        return itemId;
    }

    public String getItemName()
    {
        return itemName;
    }

    public double getItemPrice ()
    {
        return itemPrice;
    }

    public String getDatePurchase ()
    {
        return datePurchase;
    }
    
    public String toString()
    {
        return ("\nItem Id: " + itemId + "\nItem Name: " + itemName + "\nItem Price: " + itemPrice + "\nDate Purchase: " + datePurchase);
    }
}//end class