package com.example.binusezyfoody;

import java.util.ArrayList;

public class OrdersArray {
    public static ArrayList<Orders> itemarray = new ArrayList<>();
    public static void holdorder(String item, int Price, int qty){
        Orders orderlist =new Orders(item, Price, qty);
        itemarray.add(orderlist);
    }
}
