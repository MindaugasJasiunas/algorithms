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

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(3);
        ListNode listNode6=new ListNode(2);
        ListNode listNode7=new ListNode(1);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        listNode6.next=listNode7;

        System.out.println(new PalindromeLinkedList().isPalindrome(listNode1));
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