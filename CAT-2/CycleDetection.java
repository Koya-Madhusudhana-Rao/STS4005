class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleDetection {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next; // Tortoise moves one step
            hare = hare.next.next; // Hare moves two steps

            // If hare and tortoise meet, there's a cycle
            if (hare == tortoise) {
                return true;
            }
        }

        // If hare reaches the end of the list, no cycle exists
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        // Creating a cycle
        head.next.next.next.next = head.next;

        CycleDetection cycleDetection = new CycleDetection();
        System.out.println("Does the list have a cycle? " + cycleDetection.hasCycle(head));
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Detect Loop in linked list 2

// // Java program to detect loop in a linked list
// import java.util.*;

// public class LinkedList {

// 	Node head; // head of list

// 	/* Linked list Node*/
// 	static class Node {
// 		int data;
// 		Node next;
// 		Node(int d)
// 		{
// 			data = d;
// 			next = null;
// 		}
// 	}

// 	/* Inserts a new Node at front of the list. */
// 	public void push(int new_data)
// 	{
// 		/* 1 & 2: Allocate the Node &
// 				Put in the data*/
// 		Node new_node = new Node(new_data);

// 		/* 3. Make next of new Node as head */
// 		new_node.next = head;

// 		/* 4. Move the head to point to new Node */
// 		head = new_node;
// 	}

// 	// Returns true if there is a loop in linked
// 	// list else returns false.
//     static int data;
// 	static boolean detectLoop(Node h)
// 	{
// 		HashSet<Node> s = new HashSet<Node>();
// 		while (h != null) {
// 			if (s.contains(h)){
//                 data=h.data;
// 				return true;
//             }
// 			s.add(h);
// 			h = h.next;
// 		}
// 		return false;
// 	}

// 	/* Driver program to test above function */
// 	public static void main(String[] args)
// 	{
// 		LinkedList llist = new LinkedList();

// 		llist.push(20);
// 		llist.push(4);
// 		llist.push(15);
// 		llist.push(10);

// 		llist.head.next.next.next.next = llist.head;

// 		if (detectLoop(llist.head))
// 			System.out.println("Loop Found for the data : "+ data);
// 		else
// 			System.out.println("No Loop");
// 	}
// }
///////////////////////////////////////////////////////////////////////////////////////////
// import java.util.*;


// class dloop {


//     // Link list node
//     static class Node {
//         int data;
//         Node next;
//         int flag;
//     };


//     static Node push(Node head_ref, int new_data)
//     {


//         Node new_node = new Node();


//         new_node.data = new_data;


//         new_node.flag = 0;


//         new_node.next = head_ref;


//         head_ref = new_node;
//         return head_ref;
//     }


//     static boolean detectLoop(Node h)
//     {
//         while (h != null) {


//             if (h.flag == 1)
//                 return true;


//             h.flag = 1;


//             h = h.next;
//         }
//         return false;
//     }


//     public static void main(String[] args)
//     {


//         Node head = null;


//         head = push(head, 20);
//         head = push(head, 4);
//         head = push(head, 15);
//         head = push(head, 10);
 
//         head.next.next.next.next = head;
       
//         if (detectLoop(head))  
//             System.out.print("Loop Found");
//         else
//             System.out.print("No Loop");
//     }
// }

