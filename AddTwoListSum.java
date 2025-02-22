import java.util.List;
import java.util.*;


    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public class AddTwoListSum {
        public static ListNode AddTwoListSum(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0); // Dummy node to simplify logic
            ListNode current = result; // Pointer for traversal
            int carry = 0; // Carry for sum exceeding 9

            while (l1 != null || l2 != null) {
                int sum = 0 +  carry; // Start with carry

                if (l1 != null) {
                    sum += l1.val; // Add first list value
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val; // Add second list value
                    l2 = l2.next;
                }

                carry = sum / 10; // Compute carry
                current.next = new ListNode(sum % 10); // Store unit digit
                current = current.next;
            }

            if (carry == 1) {
                current.next = new ListNode(1); // Append last carry if exists
            }

            return result.next; // Return actual head
        }

        // Utility method to create a linked list from an array
        public static ListNode createList(int[] nums) {
            ListNode result = new ListNode(0);
            ListNode current = result;
            for (int num : nums) {
                current.next = new ListNode(num);
                current = current.next;
            }
            return result.next;
        }

        // Utility method to print a linked list
        public static void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val);
                if (head.next != null)
                    System.out.print(" -> ");
                head = head.next;
            }
            System.out.println();
        }

        // Main method for testing
        public static void main(String[] args) {
            AddTwoListSum solution = new AddTwoListSum();

            // Example 1
            ListNode l1 = createList(new int[]{2, 4, 3});
            ListNode l2 = createList(new int[]{5, 6, 4});
            ListNode result1 = solution.AddTwoListSum(l1, l2);
            System.out.print("Example 1 Output: ");
            printList(result1); // Expected: 7 -> 0 -> 8

            // Example 2
            l1 = createList(new int[]{0});
            l2 = createList(new int[]{0});
            ListNode result2 = solution.AddTwoListSum(l1, l2);
            System.out.print("Example 2 Output: ");
            printList(result2); // Expected: 0

            // Example 3
            l1 = createList(new int[]{9, 9, 9, 9, 9, 9, 9});
            l2 = createList(new int[]{9, 9, 9, 9});
            ListNode result3 = solution.AddTwoListSum(l1, l2);
            System.out.print("Example 3 Output: ");
            printList(result3); // Expected: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
        }
    }

