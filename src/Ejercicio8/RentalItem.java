package Ejercicio8;

public class RentalItem {

    protected String itemName;
    protected int itemID;
    protected String available;


    public RentalItem(String itemName, int itemID, String available) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.available = available;
    }

    public RentalItem(){

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String toString() {
        return "itemName{" + itemName +
                "itemID='" + itemID + '\'' +
                ", available=" + available +
                '}';
    }
}
