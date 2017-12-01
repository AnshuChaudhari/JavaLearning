package com.learning.java.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 54);
        Person p2 = new Person("John", 19);
        Person p3 = new Person("Julie", 23);
        Person p4 = new Person("Kelly", 34);
        Person p5 = new Person("Peter", 22);

        LinkedList linkedList = new LinkedList();
        linkedList.addToLinkedlist(p1);
        linkedList.addToLinkedlist(p2);
        linkedList.addToLinkedlist(p3);
        linkedList.addToLinkedlist(p4);
        linkedList.addToLinkedlist(p5);

        linkedList.printList();

    }

}
