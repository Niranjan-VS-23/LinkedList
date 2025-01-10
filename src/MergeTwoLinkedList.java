class Node6 {
    int data;
    Node6 next;

    Node6(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MergeTwoLinkedList {
    public static Node6 MergeTwoLists(Node6 head1, Node6 head2) {
        Node6 dummyNode = new Node6(0);
        Node6 temp = dummyNode;
        Node6 temp1 = head1;
        Node6 temp2 = head2;

        while(temp1 != null && temp2 != null) {
            if(temp1.data < temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 != null) {
            temp.next = temp1;
        }
        if (temp2 != null){
            temp.next = temp2;
        }
        return dummyNode.next;
    }
    public static void print(Node6 head) {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node6 head1 = new Node6(1);
        head1.next = new Node6(2);
        head1.next.next = new Node6(5);
        head1.next.next.next = new Node6(6);

        Node6 head2 = new Node6(3);
        head2.next = new Node6(4);
        head2.next.next = new Node6(7);

        Node6 MergedLists = MergeTwoLists(head1, head2);
        print(MergedLists);
        }
}
