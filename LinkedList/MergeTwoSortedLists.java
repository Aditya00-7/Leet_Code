package LinkedList;

class List1Node {
    int val;
    ListNode next;

    List1Node(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedLists {

    // Method to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // dummy head
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining part
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;
    }

    // Helper method to print a linked list
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
        // list1 = [1,2,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // list2 = [1,3,4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(merged);
    }
}
//21. Merge Two Sorted Lists
//Easy

//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.

//Example 1:

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Example 2:
//Input: list1 = [], list2 = []
//Output: []

//Example 3:
//Input: list1 = [], list2 = [0]
//Output: [0]

//Constraints:
//The number of nodes in both lists is in the range [0, 50].
//-100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.