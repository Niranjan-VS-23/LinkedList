package com.LinkedList.Manipulation;
import java.util.*;
class Node9 {
    int data;
    Node9 next;

    Node9(int data, Node9 next) {
        this.data = data;
        this.next = next;
    }
}
public class DeleteTail {
    public static Node9 deleteTail(Node9 head) {
        Node9 temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    public static void print(Node9 head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node9 insertAtHead(Node9 head, int val) {

        Node9 temp = new Node9(val, head);
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node9 head = null;
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++) {
            int val = sc.nextInt();
            head = insertAtHead(head, val);
        }

        deleteTail(head);
        print(head);
    }
}
