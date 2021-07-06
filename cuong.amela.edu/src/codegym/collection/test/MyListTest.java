package codegym.collection.test;

import codegym.collection.source.MyList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.addElement(1);
        listInteger.addElement(2);
        listInteger.addElement(3);
        listInteger.addElement(3);
        listInteger.addElement(4);

        System.out.println("element 4: "+listInteger.getElement(4));
        System.out.println("element 1: "+listInteger.getElement(1));
        System.out.println("element 2: "+listInteger.getElement(2));

        //listInteger.getElement(6);
        //System.out.println("element 6: "+listInteger.getElement(6));

        //listInteger.getElement(-1);
        //System.out.println("element -1: " + listInteger.getElement(-1));

        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(4);

        System.out.println(myList);

        myList.add(5);
        myList.add(2, 6);
        myList.remove(3);

        System.out.println("My list after insert and remove: " + myList);

        if (myList.contains(3)){
            System.out.println("My list contain 3");
        }

        myList.clear();
        System.out.println("My list after clear: " + myList);
    }
}
