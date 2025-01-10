class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StartingPointInLoop {
    public static Node3 StartingPoint(Node3 head) {
        Node3 fast = head;
        Node3 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node3 head = new Node3(1);
        head.next = new Node3(2);
        head.next.next = new Node3(3);
        head.next.next.next = new Node3(4);
        head.next.next.next.next = new Node3(5);
        // to check if there is loop then use this
        head.next.next.next.next.next=head.next.next.next;
        Node3 findStartingPoint = StartingPoint(head);
        if(findStartingPoint != null) {
            System.out.println("Starting point is " + findStartingPoint.data);
        } else {
            System.out.println("No loop detected");
        }
    }
}
