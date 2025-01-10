class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    public static Node1 reverseLinkedList(Node1 head) {
        Node1 temp = head;
        Node1 prev = null;

        while (temp != null) {
            Node1 front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;  // Return the new head of the reversed list
    }

    public static void printList(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);

        Node1 reversedHead = reverseLinkedList(head);
        System.out.print("Reversed list is: ");
        printList(reversedHead);
    }
}
