package singly_linked_list_problems;

//Iterative Java program to reverse a linked list

class Nod {
	int data;
	Nod next;

	Nod(int new_data) {
		data = new_data;
		next = null;
	}
}

//Given the head of a list, reverse the list and return the
//head of reversed list
class GfG {
	static Nod reverseList(Nod head) {

		// Initialize three pointers: curr, prev and next
		Nod curr = head, prev = null, next;

		// Traverse all the Nods of Linked List
		while (curr != null) {

			// Store next
			next = curr.next;

			// Reverse current Nod's next pointer
			curr.next = prev;

			// Move pointers one position ahead
			prev = curr;
			curr = next;
		}

		// Return the head of reversed linked list
		return prev;
	}

	// This function prints the contents
	// of the linked list starting from the head
	static void printList(Nod Nod) {
		while (Nod != null) {
			System.out.print(" " + Nod.data);
			Nod = Nod.next;
		}
	}

	public static void main(String[] args) {

		// Create a hard-coded linked list:
		// 1 -> 2 -> 3 -> 4 -> 5
		Nod head = new Nod(1);
		head.next = new Nod(2);
		head.next.next = new Nod(3);
		head.next.next.next = new Nod(4);
		head.next.next.next.next = new Nod(5);

		System.out.print("Given Linked list:");
		printList(head);

		head = reverseList(head);

		System.out.print("\nReversed Linked List:");
		printList(head);
	}
}
