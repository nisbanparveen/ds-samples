import LinkedList.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//Insertion
		list.insert(list, 1);
		list.insert(list, 5);
		list.insert(list, 15);
		list.insert(list, 22);
		list.insert(list, 4);
		System.out.println("Inserting elements into List");
		list.printList(list);
		list.insert(list, 24,2);
		System.out.println("Inserting element with Index");
		list.printList(list);
		
		//Deletion
		list.deleteFirstNode(list);
		System.out.println("Deleting First Element");
		list.printList(list);
		
		list.deleteLastNode(list);
		System.out.println("Deleting last Element");
		list.printList(list);
		
		list.deleteWithIndex(list, 0);
		System.out.println("Deleting element with Index");
		list.printList(list);
		System.out.println("Deleting element with invalid Index");
		list.deleteWithIndex(list, -1);
		list.printList(list);
		
		
	}

}
