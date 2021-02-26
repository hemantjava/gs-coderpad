package com.example.gscoderpad.high.single;

import org.w3c.dom.Node;

public class LinkedList {
    private Node head; //LinkedList Node

    static class Node {  //LinkedList Node
        private int data;
        private Node next;


        // Constructor to create a new node
        // Next is by default initialized
        // as null
        public Node(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    public int size() {
        int length = 0;
        Node currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    // Method to insert a new node
    public void insert(int data) {

        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null)
            head = newNode;
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = newNode;
        }

    }

    public void insertFront(int data) {

        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void printList(LinkedList list) {
        Node currentNode = list.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean deleteByKey(int key) {
        Node currentNode = head, prevNode = null;
        if (currentNode == null) {
            return false;
        } else if (currentNode.data == key) {
            head = currentNode.next;
            return true;
        }
        while (currentNode != null) {
            if (currentNode.data == key) {
                prevNode.next = currentNode.next;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;

    }


}