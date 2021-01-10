package com.example.binusezyfoody;
public class Orders {
    private String itemname;
    private int itemprice;
    private int itemqty;

    public Orders(String item, int Price, int qty) {
        itemname = item;
        itemprice = Price;
        itemqty = qty;
    }
    public String getName() {
        return itemname;
    }
    public int getprice(){
        itemprice= itemprice*itemqty;
        return itemprice;
    }
    public int getqty(){
        return itemqty;
    }


}
