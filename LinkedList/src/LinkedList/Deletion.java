package LinkedList;

import LinkedList.LinkedList.Node;
/** 
 * @author Nisban Parveen
 *
 */
public class Deletion {
	/**
	 * Deleting first node
	 * 
	 * @param list
	 * @return
	 */
	public static LinkedList deleteFirstNode(LinkedList list) {
		Node tempNode = list.head;

		list.head = tempNode.next;

		return list;
	}
	
	/**
	 * Delete last Node
	 * @param list
	 * @return LinkedList
	 */
	public static LinkedList deleteLastNode(LinkedList list) {
		int size = LinkedList.count(list);
		int count = 1;
		Node previousNode = list.head;
		while (count < size - 1) {
			previousNode = previousNode.next;
			count++;
		}
		Node currentNode = previousNode.next;
		previousNode.next = currentNode.next;
		currentNode = null;
		return list;

	}
	/**
	 * Deleting Node with index
	 * 
	 * 1. Check for index out of bound
	 * 2. For Node at the beginning
	 * 3. Traverse till the specified location
	 * @param list
	 * @param position
	 * @return
	 */
	public static LinkedList deleteWithIndex(LinkedList list, int position) {

		int size = LinkedList.count(list);
		if ((position < 0) || (position > size - 1)) {
			System.out.println("This position is not valid.");
			return list;
		}
		if (position == 0) {
			Node currentNode = list.head;
			list.head = currentNode.next;
			return list;
		} else { // Delete any index or at the ending
			Node previousNode = list.head;
			int count = 1;
			while (count < position) {
				previousNode = previousNode.next;
				count++;
			}
			Node currentNode = previousNode.next;
			previousNode.next = currentNode.next;
			currentNode = null;
		}

		return list;
	}
	
}
