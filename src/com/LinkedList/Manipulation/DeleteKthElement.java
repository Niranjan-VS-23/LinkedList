package com.LinkedList.Manipulation;
import java.util.*;
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
    Node1(int data, Node1 next) {
        this.data = data;
        this.next = next;
    }
}
public class DeleteKthElement {
    public static Node1 insertTail(int value, Node1 head) {
        if(head == null) {
            return new Node1(value, head);
        }
        Node1 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node1 newNode = new Node1(value);
        temp.next = newNode;
        return head;
    }
    public static Node1 DeleteElement(Node1 head, int k) {
        if(head == null) return head;
        if(k == 1) {
            head = head.next;
            return head;
        }
        Node1 prev = null;
        Node1 temp = head;
        int cnt = 0;
        while(temp != null) {
            cnt++;
            if(cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void printLL(Node1 head){
        Node1 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node1 head = null;
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertTail(value, head);
        }
        System.out.println("Enter kth element to delete");
        int k = sc.nextInt();
        Node1 result = DeleteElement(head, k);
        printLL(result);
    }
}
