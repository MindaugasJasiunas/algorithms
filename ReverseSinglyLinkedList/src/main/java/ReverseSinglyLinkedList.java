public class ReverseSinglyLinkedList {

    public ListNode reverseIteratively(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            //flip the pointer
            head.next = previous;
            //head.prev=next;  // additional line if we would use double linked
            previous = head;
            head = next;
        }
        return previous; //because head now is null
    }

    public ListNode reverseRecursively(ListNode head) {
        if (head == null || head.next == null) {
            //head.prev=null;  // additional line if we would use double linked
            return head;
        }
        ListNode reversedListNode = reverseRecursively(head.next);
        head.next.next = head; // next element's next element will be this head
        //head.next.next.prev=head.next;  // additional line if we would use double linked
        head.next = null; //next element will be null (otherwise infinite loop when returning at the start of a list)
        return reversedListNode;
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
