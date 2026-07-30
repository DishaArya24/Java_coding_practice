package Searching_sortiing;

public class InsertionSortList {
	
	/*
	 * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.

The steps of the insertion sort algorithm:

Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
It repeats until no input elements remain.
	 */
	

	    // Node class
	    static class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }

	    // Insertion Sort for Linked List
	    public ListNode insertionSortList(ListNode head) {

	        if (head == null || head.next == null) {
	            return head;
	        }

	        ListNode dummy = new ListNode(0);
	        ListNode current = head;

	        while (current != null) {

	            ListNode next = current.next;

	            ListNode prev = dummy;

	            while (prev.next != null && prev.next.val < current.val) {
	                prev = prev.next;
	            }

	            current.next = prev.next;
	            prev.next = current;

	            current = next;
	        }

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

	    // Main Method
	    public static void main(String[] args) {

	    	InsertionSortList obj = new InsertionSortList();

	        // Creating Linked List
	        // 4 -> 2 -> 1 -> 3

	        ListNode head = new ListNode(4);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(1);
	        head.next.next.next = new ListNode(3);

	        System.out.println("Original Linked List:");
	        obj.printList(head);

	        head = obj.insertionSortList(head);

	        System.out.println("Sorted Linked List:");
	        obj.printList(head);
	    }
	}

