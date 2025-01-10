import javax.xml.transform.sax.SAXSource;

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLL {
    public static Node4 reverseLL(Node4 head) {
        Node4 temp = head;
        Node4 prev = null;
        while(temp != null) {
            Node4 front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static boolean LLPalindrome(Node4 head) {
        Node4 fast = head;
        Node4 slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node4 newHead = reverseLL(slow.next);
        Node4 first = head;
        Node4 second = newHead;

        while(second != null) {
            if(first.data != second.data) {
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }
    public static void printList(Node4 head){
        Node4 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node4 head = new Node4(1);
        head.next = new Node4(2);
        head.next.next = new Node4(3);
        head.next.next.next = new Node4(3);
        head.next.next.next.next = new Node4(2);
        head.next.next.next.next.next = new Node4(1);

        boolean reverse = LLPalindrome(head);
        System.out.println(reverse);
        System.out.println("linked list after printing elements: ");
        printList(head);
    }
}
