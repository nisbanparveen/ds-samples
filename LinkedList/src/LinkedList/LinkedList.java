package LinkedList;

import java.awt.HeadlessException;

/**
 * 
 * @author Nisban Parveen
 *
 */
public class LinkedList {
	Node head;

	/**
	 * 
	 * 
	 * Linked List is used for storing collection of Data. Elements are connected by
	 * pointer. Every Node will have a data of the particular node and a
	 * pointer/reference to next node
	 *
	 *
	 */
	public static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
			next = null;
		}

	}

	public  LinkedList insert(LinkedList list, Object data) {
		return Insert.insert(list, data);
	}

	public  LinkedList insert(LinkedList list, Object insertAtposition, int position) {
		return Insert.insert(list, insertAtposition, position);
	}

	public  LinkedList insertAtBeginning(LinkedList list, Object data) {
		return Insert.insertAtBeginning(list, data);
	}
	public LinkedList deleteFirstNode(LinkedList list) {
		return Deletion.deleteFirstNode(list);
	}
	
	public LinkedList deleteLastNode(LinkedList list) {
		return Deletion.deleteLastNode(list);
	}
	
	
	public LinkedList deleteWithIndex(LinkedList list,int position) {
		return Deletion.deleteWithIndex(list, position);
	}
	
	
	
	/**
	 * Printing the LinkedList elements Traverse through the node until the Node
	 * points to null
	 * 
	 * @param list
	 */
	public static void printList(LinkedList list) {
		Node currentNode = list.head;

		System.out.print("LinkedList : ");
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println("");
	}

	/**
	 * Traverse through the node list and return the node count
	 * 
	 * @param list
	 * @return int
	 */
	public static int count(LinkedList list) {
		int length = 0;
		Node currentNode = list.head;

		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}
