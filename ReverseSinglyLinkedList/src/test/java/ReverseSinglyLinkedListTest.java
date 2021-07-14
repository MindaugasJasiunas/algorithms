import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSinglyLinkedListTest {
    private final ReverseSinglyLinkedList reverseSinglyLinkedList=new ReverseSinglyLinkedList();
    //1->2->3->4->5->NULL
    //to
    //5->4->3->2->1->NULL

    @DisplayName("reverseIteratively()")
    @Test
    void reverseIteratively() {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        listNode4.next=listNode5;
        listNode3.next=listNode4;
        listNode2.next=listNode3;
        listNode1.next=listNode2;

        ListNode reversed = reverseSinglyLinkedList.reverseIteratively(listNode1);

        System.out.println(reversed);
        assertEquals(5, reversed.value);
        assertEquals(4, reversed.next.value);
        assertEquals(3, reversed.next.next.value);
        assertEquals(2, reversed.next.next.next.value);
        assertEquals(1, reversed.next.next.next.next.value);
        assertNull(reversed.next.next.next.next.next);
    }

    @DisplayName("reverseIteratively() one element")
    @Test
    void reverseIteratively_oneElement() {
        ListNode listNode1 = new ListNode(1);
        ListNode reversed = reverseSinglyLinkedList.reverseIteratively(listNode1);
        assertEquals(1, reversed.value);
        assertNull(reversed.next);
    }

    @DisplayName("reverseRecursively()")
    @Test
    void reverseRecursively() {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        listNode4.next=listNode5;
        listNode3.next=listNode4;
        listNode2.next=listNode3;
        listNode1.next=listNode2;
        ListNode reversed= reverseSinglyLinkedList.reverseRecursively(listNode1);
        System.out.println(reversed);
        assertEquals(5, reversed.value);
        assertEquals(4, reversed.next.value);
        assertEquals(3, reversed.next.next.value);
        assertEquals(2, reversed.next.next.next.value);
        assertEquals(1, reversed.next.next.next.next.value);
    }

    @DisplayName("reverseRecursively() one element")
    @Test
    void reverseRecursively_OneElement() {
        ListNode listNode1=new ListNode(1);
        ListNode reversed= reverseSinglyLinkedList.reverseRecursively(listNode1);
        assertEquals(1, reversed.value);
        assertNull(reversed.next);
    }
}