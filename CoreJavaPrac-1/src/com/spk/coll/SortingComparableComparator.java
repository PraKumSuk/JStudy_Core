package com.spk.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingComparableComparator {
	
	public static void main(String[] args) {
		//Creating Order objects
        Order ord1 = new Order(101, 2000, "Sony");        
        Order ord2 = new Order(102, 4000, "Hitachi");
        Order ord3 = new Order(103, 6000, "Philips");
        
        //Adding orders to order list
        List<Order> orders = new ArrayList<Order>();
        orders.add(ord3);
        orders.add(ord1);
        orders.add(ord2);
        
        System.out.println("Unsorted Collection : " + orders);
        
        Collections.sort(orders);
        
        System.out.println("List of Order object sorted in natural order : " + orders);

        Collections.sort(orders, Collections.reverseOrder());
        System.out.println("List of object sorted in descending order : " + orders);

        Collections.sort(orders, new Order.OrderByAmount());
        System.out.println("List of Order object sorted using Comparator - amount : " + orders);

        Collections.sort(orders, new Order.OrderByCustomer());
        System.out.println("Collection of Orders sorted using Comparator - by customer : " + orders);
	}
}

//Note : Used lot of inner classes, so member declarations, setters getters in each
//class can be avoided as this is only a DEMO

//NEW CLASS for ORDER ID implementing COMPARABLE
class Order implements Comparable<Order> {
	
	//Members
    private int orderId;
    private int amount;
    private String customer;
    
    //Constructor
    public Order(int orderId, int amount, String customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.customer = customer;
    }
    
    //Getter Setter
  	public int getOrderId() {return orderId;}
    public void setOrderId(int orderId) {this.orderId = orderId;}
  
    public int getAmount() {return amount; }
    public void setAmount(int amount) {this.amount = amount;}

    public String getCustomer() {return customer;}
    public void setCustomer(String customer) {this.customer = customer;}

    //Sorting on orderId is natural sorting for Order.    
    @Override
    public int compareTo(Order o) {
        return this.orderId > o.orderId ? 1 : (this.orderId < o.orderId ? -1 : 0);
    }
    
    // Implementing toString method to print orderId of Order    
    @Override
    public String toString(){
        return String.valueOf(orderId);
    }
    
    // NEW CLASS for ORDERBYAMOUNT implementing COMPARATOR
    //Comparator implementation to Sort Order object based on Amount     
    public static class OrderByAmount implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.amount > o2.amount ? 1 : (o1.amount < o2.amount ? -1 : 0);
        }
    }
    
    // NEW CLASS for ORDERBYNAME implementing COMPARATOR
    //Comparator implementation to Sort Order object based on Customer name.
  	public static class OrderByCustomer implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.customer.compareTo(o2.customer);
        }
    }
}