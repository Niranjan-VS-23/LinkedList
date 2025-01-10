class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddleOfLL {
    public static Node5 deleteMiddle(Node5 head){
        Node5 slow = head;
        Node5 fast = head;
        Node5 prev = null;
        //fast = fast.next.next;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
//        Node5 deletedNode = slow.next;
        System.out.println("deleted element is " + slow.data);
        prev.next = prev.next.next;

        //slow.next = slow.next.next;
        return head;
    }
    public static void printList(Node5 head) {
        Node5 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node5 head = new Node5(1);
        head.next = new Node5(2);
        head.next.next = new Node5(3);
        head.next.next.next = new Node5(4);
        head.next.next.next.next = new Node5(5);
        head.next.next.next.next.next = new Node5(6);
//        head.next.next.next.next.next.next = new Node5(7);

        Node5 newList = deleteMiddle(head);
        System.out.println("list after deleting middle Node ");
        printList(newList);
    }
}
