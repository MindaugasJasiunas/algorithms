import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    private final PalindromeLinkedList palindromeLinkedList= new PalindromeLinkedList();

    @DisplayName("isPalindrome 1->2->3->4->3->2->1 - true")
    @Test
    void isPalindrome_odd() {
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

        assertTrue(palindromeLinkedList.isPalindrome(listNode1));
    }

    @DisplayName("isPalindrome 1->2->3->3->2->1 - true")
    @Test
    void isPalindrome_even() {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(3);
        ListNode listNode5=new ListNode(2);
        ListNode listNode6=new ListNode(1);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;

        assertTrue(palindromeLinkedList.isPalindrome(listNode1));
    }

    @DisplayName("isPalindrome 1->2->3->4->5->6->7 - false")
    @Test
    void isPalindrome_invalid() {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(6);
        ListNode listNode7=new ListNode(7);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        listNode6.next=listNode7;

        assertFalse(palindromeLinkedList.isPalindrome(listNode1));
    }

    @DisplayName("isPalindrome 1->2->3->4->5->3->2->1 - false")
    @Test
    void isPalindrome_invalidInput() {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(3);
        ListNode listNode7=new ListNode(2);
        ListNode listNode8=new ListNode(1);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        listNode6.next=listNode7;
        listNode7.next=listNode8;

        assertFalse(palindromeLinkedList.isPalindrome(listNode1));
    }
}