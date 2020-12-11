package LinkedList;

import LinkedList.LinkedList.Node;

public class Insert {
	/**
	 * 
	 * Insertion at the Ending of the list
	 * 
	 * 1. Create New Node and point the next pointer to NULL 2. Point the last Nodes
	 * next pointer point to new node
	 * 
	 * @param list
	 * @param data
	 * @return list
	 */
	public static LinkedList insert(LinkedList list, Object data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last_node = list.head;

			while (last_node.next != null) {
				last_node = last_node.next;
			}

			last_node.next = new_node;
		}

		return list;

	}

	/**
	 * Insert Item at the beginning of the LinkedList
	 * 
	 * 1. Create New node and point the next pointer point to current Head 2. Update
	 * the Head pointer point to new node
	 * 
	 * @param list
	 * @param data
	 * @return
	 */
	public static LinkedList insertAtBeginning(LinkedList list, Object data) {
		Node new_node = new Node(data);
		new_node.next = list.head;

		list.head = new_node;
		return list;

	}

	/**
	 * Insert at a given position 1. Calculate the size of the list, if position<0
	 * and greater than size-1, cannot insert item
	 * 
	 * @param list
	 * @param insertNode
	 * @param position
	 * @return
	 */
	public static LinkedList insert(LinkedList list, Object insertAtposition, int position) {
		Node insertNode = new Node(insertAtposition);
		if (list.head == null) {
			list.head = insertNode;
		}
		int size = LinkedList.count(list);
		if ((position < 0) || (position > size - 1)) {
			System.out.println("Node cannot be inserted in this postion");
			return list;
		}

		if (position == 0) {
			insertNode.next = list.head;
			list.head = insertNode;
			return list;

		} else {
			Node previousNode = list.head;
			int count = 1;
			while (count < position) {
				previousNode = previousNode.next;
				count++;
			}

			Node currenNode = previousNode.next;
			insertNode.next = currenNode;
			previousNode.next = insertNode;

		}
		return list;

	}

}
