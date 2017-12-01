package com.learning.java.linkedlist;

public class LinkedList {

    private Node previousNode;
    private Node firstNode;

    public void addToLinkedlist(Person person) {
        Node currentNode = new Node();
        currentNode.setPerson(person);
        if (previousNode == null) {
            //this is the first node
            firstNode = currentNode;
        } else {
            previousNode.setNextNode(currentNode);
        }
        previousNode = currentNode;
    }

    public void printList(){
        Node localFirstNode = firstNode;
        do {
            Person person = localFirstNode.getPerson();
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
            localFirstNode = localFirstNode.getNextNode();
        } while (localFirstNode != null);

    }
}
