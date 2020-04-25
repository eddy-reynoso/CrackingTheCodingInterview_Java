package Utilities;

public class LinkedListNode {
    public LinkedListNode next;
    public int data;

    public LinkedListNode(int d) {
        data = d;
    }

    public void setNext(LinkedListNode n) {
        next = n;
    }

    public void printList() {
        System.out.println();

        LinkedListNode node = this;
        while (node.next != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print(node.data);
        System.out.println();
    }

}