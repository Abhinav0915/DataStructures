package LinkedList;

public class LinkedList2 {
    Node head;

    public LinkedList2(){
        this.head = null;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data +  " ");
        }
    }


}
