package codegym.collection.source;

public class MyLinkedList<E> {

    private class Node {
        private Node nextNode;
        private Object data;
        
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node headNode;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        headNode = new Node(data);
    }

    //Start from index 0
    public void addNode(int index, E data) {
        Node tempNode = headNode;
        Node holder; //node we want to add data to index i - 1 from index 0

        //assign tempNode -> (index - 2)
        for (int i = 0; i < index - 1 && tempNode.nextNode != null; i++) {
            tempNode = tempNode.nextNode;
        }
        holder = tempNode.nextNode; //places in (index - 2), assign (node i - 1) to holder (node)
        tempNode.nextNode = new Node(data); //assign data to (node i - 1) = holder (node)
        tempNode.nextNode.nextNode = holder; //assign holder (node) to (node i) (next node)
        numNodes++;
    }

    public void addFirst(E data) {
        Node temp = headNode;
        headNode = new Node(data);
        headNode.nextNode = temp;
        numNodes++;
    }

    public void addLast(E data) {
        Node temp = headNode;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = new Node(data);
        temp.nextNode.nextNode = null;
        numNodes++;
    }

    public Node getNode(int index) {
        Node tempNode = headNode;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.nextNode;
        }
        return tempNode;
    }

    public E remove(int index) {
        E rm_element = null;
        Node temp = headNode;
        Node previous = headNode;
        for(int i = 0; i < index; i++) {
            previous = temp;
            temp = temp.nextNode;
        }
        rm_element = (E) temp.getData();
        previous.nextNode = temp.nextNode;
        numNodes--;
        return rm_element;
    }

    public boolean remove(E e) {
        boolean result = false;
        Node temp = headNode;
        Node previous = headNode;
        while(temp.nextNode != null){
            if(temp.getData() == e){
                if(temp == headNode){
                    headNode = temp.nextNode;
                } else {
                    previous.nextNode = temp.nextNode;
                }
                numNodes--;
                result = true;
                break;
            }
            previous = temp;
            temp = temp.nextNode;
        }
        return result;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E o)  {
        Node temp = headNode;
        while(temp.nextNode != null) {
            if(temp.getData() == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = headNode;
        if(contains(o)){
            for(int i = 0; i < numNodes; i++) {
                if(temp.getData() == o) {
                    return i;
                }
                temp = temp.nextNode;
            }
        }
        return -1;
    }

    public void printList() {
        Node tempNode = headNode;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        }
    }
}
