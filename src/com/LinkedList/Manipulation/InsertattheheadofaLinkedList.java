package com.LinkedList.Manipulation;

import java.util.*;
class Node8 {
    int data;
    Node8 next;

    Node8(int data, Node8 next) {
        this.data = data;
        this.next = next;
    }
}
public class InsertattheheadofaLinkedList {
    public static Node8 insertAtHead(Node8 head, int val) {
        Node8 temp = new Node8(val, head);
        return temp;
    }
    public static void printElement(Node8 head) {
        while(head!= null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node8 head = null;
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertAtHead(head, value);
        }

        System.out.println("LL Before Inserting Element");
        printElement(head);

        int value1 = sc.nextInt();
        head = insertAtHead(head, value1);

        System.out.println("LL After inserting element");
        printElement(head);
    }
}
