package ListAndArrayListPart1.GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {

        groceryList.add(item);
        System.out.println("Item " + item + " is added in the list");
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (newItem) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
        System.out.println("Grocery item " + (theItem) + " has been removed");

    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
