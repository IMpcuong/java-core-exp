package codegym.collection.source;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public int size() {
        return this.size;
    }

    //Adding new object to last position of array
    public void addElement(E element) {
        if (size == elements.length) ensureCapacity(size + 1);
        elements[size++] = element;
    }

    //Adding new object to last position of array
    public boolean add(E element) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = element;
        return true;
    }

    public void add(int index, E element) {
       if (index >= size || index < 0) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
       if (size == elements.length) ensureCapacity(size + 1); //increase the capacity of elements by 1
       for (int i = index + 1; i < size; i++) {
           elements[i + 1] = elements[i];
       }
       elements[index] = element;
       size++;
    }

    public E remove(int index) {
        E result = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return result;
    }

    public E getElement(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        return (E) elements[i];
    }

    public E clone() throws CloneNotSupportedException {
        E clone = (E) super.clone();
        return clone;
    }

    public void clear(){
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }

        size = 0;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (element == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        if (contains(element)) {
            for (int i = 0; i < size; i++) {
                if(elements[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        String result = "";
        result += "Array List: [";
        for(int i = 0; i < size-1; i++) {
            result += elements[i].toString() + ", ";
        }
        if (size > 0) {
            result += elements[size-1].toString();
        }
        result += "]";
        return result;
    }
}
