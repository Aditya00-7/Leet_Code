package LinkedList;
import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandom {
    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println("Val: " + curr.val +
                    ", Random: " + (curr.random != null ? curr.random.val : "null"));
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        // Create test list: [7,null],[13,0],[11,4],[10,2],[1,0]
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node copied = copyRandomList(n1);
        printList(copied);
    }
}


//138. Copy List with Random Pointer

//A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
//Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

//For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

//Return the head of the copied linked list.
//The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
//val: an integer representing Node.val
//random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
//Your code will only be given the head of the original linked list.

//Example 1:
//Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

//Example 2:
//Input: head = [[1,1],[2,1]]
//Output: [[1,1],[2,1]]

//Example 3:
//Input: head = [[3,null],[3,0],[3,null]]
//Output: [[3,null],[3,0],[3,null]]

//Constraints:
//0 <= n <= 1000
//-104 <= Node.val <= 104
//Node.random is null or is pointing to some node in the linked list.