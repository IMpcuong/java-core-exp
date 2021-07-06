package codegym.collection.source;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void addElement(E element) {
        if (size == elements.length) ensureCapacity();
        elements[size++] = element;
    }

    public E getElement(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        return (E) elements[i];
    }
}
