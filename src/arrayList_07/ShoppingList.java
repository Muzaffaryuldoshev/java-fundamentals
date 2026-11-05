package arrayList_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.sort;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Apple");
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Egg");
        shoppingList.add("Cheese");


        System.out.println("Shopping List" + shoppingList);

        if(!shoppingList.isEmpty()){
            System.out.println("Tne number of products: " + shoppingList.size());
        }else{
            System.out.println("List is empty!");
        }

        System.out.println("item at index 2: " + shoppingList.get(2));
        if(shoppingList.contains("Bread")){
            int indexBread = shoppingList.indexOf("Bread");
            shoppingList.set(indexBread,"Whole Wheat Bread");
            System.out.println("Updated list: " + shoppingList);
        } else{
            System.out.println("Bread is not on the list");
        }

        System.out.println("before removal: "+shoppingList );
        System.out.println("removing third item: " + shoppingList.remove(3));

        System.out.println("Cheese on the list true/false: " + shoppingList.contains("Cheese"));

        Collections.sort(shoppingList);
        System.out.println("relisting the list in alphabetical order: " + shoppingList);


        ArrayList<String> unkownItems = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            unkownItems.add("X");
        }

        System.out.println("List with 10 uknown items: " + unkownItems);

        Collections.fill(unkownItems, "Bread");
        System.out.println("Updated list: " + unkownItems);

        int frequencyBread = Collections.frequency(unkownItems, "Bread");
        System.out.println("Frequency of Bread on the list: " + frequencyBread);


        Collections.fill(unkownItems, "Whole Wheat Bread");
        System.out.println("Updated list: " + unkownItems);


        unkownItems.clear();
        System.out.println("List after clearing: " + unkownItems);



    }
}
