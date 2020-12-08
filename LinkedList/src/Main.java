import LinkedList.LinkedList;
import LinkedList.LinkedList.Node;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Insert items at the end of list
		list.insert(list, 1);
		list.insert(list, 3);
		list.insert(list, 6);
		list.insert(list, 10);
		// Print the List
		list.printList(list);

		// Insert items at the beginingss
		list.insertAtBeginning(list, 5);

		list.printList(list);
		// Insert at the position
		list.insert(list, 20, 6);
		list.printList(list);
		// Length of the List
		System.out.println("COUNT : " + list.count(list));
	}

}
