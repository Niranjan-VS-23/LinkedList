package com.LinkedList.Manipulation;
class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }

    Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }
}

public class InsertAtKthPos {
    public static Node2 insertElement(Node2 head, int k, int el) {
        if(k == 1) {
            Node2 temp = new Node2(el, head);
            return temp;
        }
        int cnt = 0;
        Node2 temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == k - 1) {
                Node2 newNode = new Node2(el, head);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void printLL(Node2 head) {
        Node2 temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node2 head = new Node2(1);
        head.next = new Node2(2);
        head.next.next = new Node2(3);
        head.next.next.next = new Node2(4);
        int k = 2;
        Node2 result = insertElement(head, k, 10);
        printLL(result);
    }
}
