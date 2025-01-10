class Node7 {
    int data;
    Node7 next;

    Node7(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LengthOfLoopInLL {
    public static int lengthOfLoop(Node7 head) {
        Node7 slow = head;
        Node7 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int cnt = 1;
                fast = fast.next;
                while (slow != fast) {
                    fast = fast.next;
                    cnt++;
                }
                return cnt;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Node7 head = new Node7(1);
        head.next = new Node7(2);
        head.next.next = new Node7(3);
        head.next.next.next = new Node7(4);
        head.next.next.next.next = new Node7(5);
        head.next.next.next.next.next = head.next.next;
        int result = lengthOfLoop(head);
        System.out.println(result);
    }
}
