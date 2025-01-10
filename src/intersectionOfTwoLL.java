import java.util.*;
class Node8 {
    int data;
    Node8 next;

    Node8(int data) {
        this.data = data;
        this.next = null;
    }
    Node8(int data, Node8 next) {
        this.data = data;
        this.next = next;
    }
}
public class intersectionOfTwoLL {
    public static Node8 findIntersection(Node8 headA, Node8 headB) {
        if(headA == null || headB == null) return null;
        Node8 temp1 = headA;
        Node8 temp2 = headB;

        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == temp2) {
                return temp1;
            }
            if(temp1 == null) {
                temp1 = headB;
            }
            if(temp2 == null) {
                temp2 = headA;
            }
        }
        return temp1;
    }


    public static void main(String args[]) {

        Node8 headA = new Node8(4);
         headA.next = new Node8(1);
         headA.next.next = new Node8(8);
         headA.next.next.next = new Node8(4);
         headA.next.next.next.next = new Node8(5);

        Node8 headB = new Node8(5);
        headB.next = new Node8(6);
        headB.next.next = new Node8(1);
        headB.next.next.next = new Node8(8);
        headB.next.next.next.next = new Node8(4);
        headB.next.next.next.next.next = new Node8(5);


       Node8 intersection = findIntersection(headA, headB);
        if(intersection != null) {
            System.out.println(intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
