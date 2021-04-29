package com.second.batch;

public class Item {
    private int itemId = 0;
    private String itemName="";
    private static Item itemInstance;

   private  Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public static Item getInstance(int itemId, String itemName){
       if(itemInstance==null)
       {
           itemInstance = new Item(itemId,itemName);
       }
       return itemInstance;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
