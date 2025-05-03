package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListRecursive {

    // Recursive method to reverse linked list
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}

//206. Reverse Linked List

// Given the head of a singly linked list, reverse the list, and return the reversed list.


//Example 1:
//Input: head = \[1,2,3,4,5]
//Output: \[5,4,3,2,1]

//Example 2:
//Input: head = \[1,2]
//Output: \[2,1]

//Example 3:
//Input: head = \[]
//Output: \[]


//Constraints:
//The number of nodes in the list is the range \[0, 5000].
//-5000 <= Node.val <= 5000