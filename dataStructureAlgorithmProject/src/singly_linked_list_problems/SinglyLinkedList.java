package singly_linked_list_problems;

// program to append nodes, prepend nodes and delete nodes from linked list
class Node {
	int data; // data stored in the node
	Node nextNode;

	// Constructor to create a new node
	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
}

public class SinglyLinkedList {
	private Node headNode; // head of the linked list

	// Constructor to initialize an empty linked list
	public SinglyLinkedList() {
		this.headNode = null;
		// TODO Auto-generated constructor stub
	}

	// Method to add a node at the end of the list
	public void append(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode; // if the list is empty , make the new node as head

		} else {
			Node currentNode = headNode;
			while (currentNode.nextNode != null)// traverse to the end of the list
			{
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode; // add new node at the end

		}

	}

	// Method to add a node at the beginning of the list
	public void prepend(int data) {
		Node newNode = new Node(data);
		newNode.nextNode = headNode; // Point the new node to the current head
		headNode = newNode; // Make the newNode as head
	}

	// Method to delete a node with a specific value
	public void delete(int data) {
		if (headNode == null) {
			System.out.println("List is empty. Nothing to delete");
			return;
		}

		// if the node to be deleted is the head
		if (headNode.data == data) {
			headNode = headNode.nextNode;
			return;
		}
		Node currentNode = headNode;

		while (currentNode.nextNode != null && currentNode.nextNode.data != data) {
			currentNode = currentNode.nextNode; // Traverse the list to find the node to delete
		}

		if (currentNode.nextNode != null) {
			currentNode.nextNode = currentNode.nextNode.nextNode; // remove the node
		}

	}

	// Method to display the linked list
	public void dispplay() {
		Node curreNode = headNode;
		while (curreNode != null) {
			System.out.print(curreNode.data + " -> ");
			curreNode = curreNode.nextNode;
		}
		System.out.print("null");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		// add items link
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);

		System.out.println("Linked List after appending ");
		list.dispplay();

		list.prepend(5);
		System.out.println("\n");
		System.out.println("Linked List after prepending ");
		list.dispplay();

		list.delete(20);
		System.out.println("\n");
		System.out.println("Linked List after prepending ");
		list.dispplay();

	}

}
