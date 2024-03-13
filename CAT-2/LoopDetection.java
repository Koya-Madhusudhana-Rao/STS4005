class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LoopDetection {
    public static ListNode detectLoop(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No loop if the list is empty or has only one node
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
            
            // If there's a loop, the fast pointer will eventually catch up with the slow pointer
            if (slow == fast) {
                // Reset one pointer to the head and move both pointers at the same pace
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Return the node where the loop starts
            }
        }
        
        return null; // No loop found
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Creating a loop for demonstration purposes
        head.next.next.next.next.next = head.next;
        
        ListNode loopStartNode = detectLoop(head);
        
        if (loopStartNode != null) {
            System.out.println("Loop staarts at node with value: " + loopStartNode.val);
        } else {
            System.out.println("No loop found in the list.");
        }
    }
}
