/**
* This class models a GroceryItem class

* @author Krish Thawani
*/

public class GroceryItem {
    private int itemCode;
    private int shelfLife;
    public GroceryItem(int itemCode, int shelfLife) {
        this.itemCode = itemCode;
        if (shelfLife < 0 || shelfLife > 30) {
            throw new IllegalArgumentException("Shelf life must range between 1 and 30 days.");
        }
        this.shelfLife = shelfLife;
    }

    public int getItemCode() {
        return itemCode;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public String getItem() {
        return String.format("Item Code: %s\tShelf Life: %s", itemCode, shelfLife);
    }

}