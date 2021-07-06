package codegym.collection.source;

public class MyLinkedList {

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
    public void addNode(int index, Object data) {
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

    public void addFirst(Object data) {
        Node temp = headNode;
        headNode = new Node(data);
        headNode.nextNode = temp;
        numNodes++;
    }

    public Node getNode(int index) {
        Node tempNode = headNode;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.nextNode;
        }
        return tempNode;
    }

    public void printList() {
        Node tempNode = headNode;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        }
    }
}
