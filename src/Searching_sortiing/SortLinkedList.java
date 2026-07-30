package Searching_sortiing;

public class SortLinkedList {
	/*
	 * Given the head of a linked list, return the list after sorting it in ascending order.
	 */
	
	

	    // Node class
	    static class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	        }
	    }

	    // Main sorting function
	    public ListNode sortList(ListNode head) {

	        if (head == null || head.next == null)
	            return head;

	        // Find middle
	        ListNode slow = head;
	        ListNode fast = head.next;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        ListNode mid = slow.next;
	        slow.next = null;

	        // Divide
	        ListNode left = sortList(head);
	        ListNode right = sortList(mid);

	        // Merge
	        return merge(left, right);
	    }

	    // Merge two sorted linked lists
	    public ListNode merge(ListNode l1, ListNode l2) {

	        ListNode dummy = new ListNode(0);
	        ListNode tail = dummy;

	        while (l1 != null && l2 != null) {

	            if (l1.val < l2.val) {
	                tail.next = l1;
	                l1 = l1.next;
	            } else {
	                tail.next = l2;
	                l2 = l2.next;
	            }

	            tail = tail.next;
	        }

	        if (l1 != null)
	            tail.next = l1;

	        if (l2 != null)
	            tail.next = l2;

	        return dummy.next;
	    }

	    // Print Linked List
	    public void printList(ListNode head) {

	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {

	        SortLinkedList obj = new SortLinkedList();

	        // 4 -> 2 -> 1 -> 3
	        
	       

	        ListNode head = new ListNode(5);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(1);
	        head.next.next.next = new ListNode(3);

	        System.out.println("Original List:");
	        obj.printList(head);

	        head = obj.sortList(head);

	        System.out.println("Sorted List:");
	        obj.printList(head);
	    }
	}


