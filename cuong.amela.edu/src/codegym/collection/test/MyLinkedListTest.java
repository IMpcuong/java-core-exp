package codegym.collection.test;

import codegym.collection.source.MyLinkedList;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.addNode(4,9);
        linkedList.addNode(4,9);
        linkedList.printList();
    }
}
