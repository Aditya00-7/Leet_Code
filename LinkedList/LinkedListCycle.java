package LinkedList;



public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Creating a cycle

        System.out.println("Has cycle: " + hasCycle(head)); // Output: true
    }
}


//141. Linked List Cycle

//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.
