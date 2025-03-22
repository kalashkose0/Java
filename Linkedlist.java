//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    private Node head;
//
//    public LinkedList() {
//        this.head = null;
//    }
//
//    // ----- Method to add a new node at the beginning of the list
//    public void addFirst(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    // -----Method to display the list
//    public void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//public class Linkedlist {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//
//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);
//
//        list.display();  // Output should be: 30 20 10
//    }
//}
