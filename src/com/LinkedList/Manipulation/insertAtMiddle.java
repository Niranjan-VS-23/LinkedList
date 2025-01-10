package com.LinkedList.Manipulation;
class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }

    Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }
}
public class insertAtMiddle {
    public static Node3 insertElement(Node3 head) {
        if(head == null || head.next == null) {
            Node3 newNode = new Node3(5);
            newNode.next = head;
            return newNode;
        }
        Node3 slow = head;
        Node3 fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node3 newNode = new Node3(5);
        newNode.next = slow.next;
        slow.next = newNode;
        return head;
    }
    public static void printLL(Node3 head) {
        Node3 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node3 head = new Node3(1);
        head.next = new Node3(2);
        head.next.next = new Node3(3);
        head.next.next.next = new Node3(4);
       // head.next.next.next.next = new Node3(6);

        Node3 result = insertElement(head);
        printLL(result);
    }
}
