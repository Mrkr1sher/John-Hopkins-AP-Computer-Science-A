/**
* This program creates 50 GroceryItem objects and sorts them into 2 ArrayLists depending on if their shelf life is greater or less than 7 days.
*
* @author Krish Thawani
*/

import java.util.Random;
import java.util.ArrayList;
public class Unit12Lab1 {
    public static void main(String[] args) {

        Random rnGenerator = new Random(1234567890);
        int shelfLife;
        GroceryItem[] groceries = new GroceryItem[50];

        for (int i = 1; i <= 50; i++) {
            shelfLife = rnGenerator.nextInt(30) + 1;
            groceries[i - 1] = new GroceryItem(i, shelfLife);
        }

        ArrayList<GroceryItem> lessThan7Days = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> greaterThan7Days = new ArrayList<GroceryItem>();
        
        for (GroceryItem grocery : groceries)
            if (grocery.getShelfLife() > 7)
                greaterThan7Days.add(grocery);
            else
                lessThan7Days.add(grocery);

        System.out.println("\n\n" + "Items with Shelf Life Less Than 7 Days: (" + lessThan7Days.size() + " items)." + "\n");
        for (GroceryItem less : lessThan7Days)
            System.out.println(less.getItem());

        System.out.println("\n" + "Items with Shelf Life Greater Than 7 Days: (" + greaterThan7Days.size() + " items)." + "\n");
        for (GroceryItem greater : greaterThan7Days)
            System.out.println(greater.getItem());
        System.out.println("\n\n");
    }
}