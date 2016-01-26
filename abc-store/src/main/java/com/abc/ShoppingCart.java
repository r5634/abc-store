package com.abc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

List<String> items;

public ShoppingCart(){
    items = new ArrayList<String>();
}

public void add(String item) {
    items.add(item);
}

public int getTotalItems() {
    return items.size();
}

public Boolean doesContain(String itemName) {
    return items.contains(itemName);
}

public Double checkout() {
    double total = 0;
    for(String item: items){
        if(item.equals("Bread")){
            total += 1;
        }else if(item.equals("Milk")){
            total += 0.6;
        }else if(item.equals("Banana")){
            total += 0.4;
        }
    }
    return total;
}   
}
/*
 * Map<String === itemname , Item === Item object>

Map<String, Item> cart = new HashMap<String, Item>();

Class Item{
private int count;
private String Name;
private int prices;
//getters and setters go here
}
*/
