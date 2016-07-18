package com.spk.coll;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String args[]) {

        Queue<Item> items = new PriorityQueue<Item>();
        items.add(new Item("AA", 111));
        items.add(new Item("BB", 444));
        items.add(new Item("CC", 333));
        items.add(new Item("DD", 222));

        System.out.println("All elements of PriorityQueue :-"+items);
        System.out.println();
              
        System.out.println("1st Element Polled/Consumed from head of the PriorityQueue : " + items.poll());
        System.out.println("All elements of PriorityQueue :-"+items);
        System.out.println();
      
        System.out.println("2nd Element Polled/Consumed from head of the PriorityQueue: " + items.poll());
        System.out.println("All elements of PriorityQueue :-"+items);
        System.out.println();
      
        System.out.println("3rd Element Polled/Consumed from head of the PriorityQueue : " + items.poll());
        System.out.println("All elements of PriorityQueue :-"+items);
        System.out.println();
      
        //items.add(null); // null elements not allowed in PriorityQueue - NullPointerException
    }
}

class Item implements Comparable<Item> {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash=5; //Take a prime hash e.g. 5, 7, 17 or 31 (prime number as hash, results in distinct hashcode for distinct object)

        hash = hash + (this.name != null ? this.name.hashCode() : 0);
        hash = hash + this.price;
        return hash;
    }

    @Override
    public int compareTo(Item i) {
        if (this.price == i.price) {
            return this.name.compareTo(i.name);
        }

        return this.price - i.price;
    }

    @Override
    public String toString() {
        return String.format("%s: $%d", name, price);
    }
}

