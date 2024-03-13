import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SegregateOddEvenNodes {
    public static ListNode segregate(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No need to segregate if the list is empty or has only one node
        }

        ListNode evenHead = null, evenTail = null;
        ListNode oddHead = null, oddTail = null;
        ListNode current = head;

        while (current != null) {
            if (current.val % 2 == 0) {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }

        if (oddHead == null) {
            return evenHead; // No odd nodes, return even list
        }

        oddTail.next = evenHead; // Connect odd list with even list
        evenTail.next = null; // Terminate the even list
        return oddHead; // Return the head of the segregated list
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();
        ListNode head = null;
        ListNode tail = null;
        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Original List:");
        printList(head);

        head = segregate(head);

        System.out.println("List after segregating odd and even nodes:");
        printList(head);
    }
}
