import java.util.*;
class Node2 {
    int data;
    Node2 next;

    Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }
}

public class DetectLoopInLL {
    public static boolean DetectLoop(Node2 head) {
        Node2 slow = head;
        Node2 fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static Node2 insertAtHead(Node2 head, int val) {
        Node2 temp = new Node2(val, head);
        return temp;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node2 head = null;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertAtHead(head, value);
        }
        if(head != null && head.next != null) {
            head.next.next = head;
        }
        boolean result = DetectLoop(head);
        System.out.println(result);

    }
}