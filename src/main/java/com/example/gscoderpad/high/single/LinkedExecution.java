package com.example.gscoderpad.high.single;

public class LinkedExecution {
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        // Insert the values
        System.out.println(list.isEmpty());
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println(list.isEmpty());
        // Print the LinkedList
        list.printList(list);
        System.out.println("Length:"+list.size());
        list.insertFront(4);
        list.printList(list);
        System.out.println("size: "+list.size());
        list.deleteByKey(2);
        list.printList(list);
        System.out.println("size: "+list.size());
       }
}
