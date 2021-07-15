public class PalindromeLinkedList {

    boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next; //double the speed
            slow=slow.next;
        }
        slow=reversed(slow);
        fast=head;
        while(slow!=null){
            if(slow.value != fast.value){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }

    ListNode reversed(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next= head.next;
            //reverse pointer
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
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