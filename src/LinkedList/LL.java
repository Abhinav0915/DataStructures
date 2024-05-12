package LinkedList;

public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //Add -> First, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return; // Terminate method execution after setting head to newNode
        }

        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("a");
        list.addFirst("b");
        list.printLast();
    }
}
