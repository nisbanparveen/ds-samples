package Implemenation;

/**
 * To overcome the doubling of array in Dynamic Array implementation we use
 * Linked List. Linked List gracefully grows and shrink the list without having
 * to double the capacity.
 * 
 * @author Nisban Parveen
 *
 */
public class LinkedListStack {
	Node head;

	// Node Class
	public static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
			next = null;
		}

	}

	Node headNode;

	public LinkedListStack() {

		headNode = new Node(null);
	}

	/**
	 * Push the data
	 * 
	 * @param data
	 */
	public void push(Object data) {
		if (headNode == null) {
			headNode = new Node(data);
		} else {
			Node newNode = new Node(data);
			newNode.next = headNode;
			headNode = newNode;
			System.out.println(data + " pushed into stack");
		}
	}

	/**
	 * Display the top element without removing from the stack
	 * 
	 * @return Object
	 */
	public Object top() {
		if (isEmpty())
			return (Integer) null;
		else {
			System.out.println(headNode.data + (" is at the top of stack"));
			return headNode.data;
		}

	}

	/**
	 * Display and remove the top element from the stack
	 * @return Object
	 */
	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else {
			Object data = headNode.data;
			headNode = headNode.next;
			return data;

		}
	}
	/**
	 * Check if the stack is empty
	 * @return boolean
	 */
	private boolean isEmpty() {
		if (headNode == null)
			return true;
		else
			return false;
	}
}
