package implemenation;

/**
 * With Simple array when the capacity of array reaches it throws Stack Overflow
 * exception, this isn't the ideal behavior. We need our stack to increase its
 * capacity when the stack is full. Thats where dynamic arrays comes into
 * picture.
 * When we encounter stack is full while pushing an element, we
 * double the capacity of the array, and also copy the old array to new one.
 *
 * @author Nisban Parveen
 *
 */
public class DynamicArrayStack {
	private int top;
	private int capacity;
	int[] array;

	public DynamicArrayStack() {
		top = -1;
		capacity = 2;
		array = new int[capacity];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == capacity - 1);
	}

	public void push(int data) {
		if (isStackFull())
			doubleStak();
		array[++top] = data;
		System.out.println(data + " Pushed into the stack");
	}

	private void doubleStak() {
		int[] newArray = new int[capacity * 2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity = capacity * 2;
		array = newArray;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Empty");
			return 0;
		} else {
			int data = array[top--];
			System.out.println(data + " popped out of the stack");
			return data;
		}

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack Empty");

			return 0;
		} else {
			int data = array[top];
			System.out.println(data + " at the top of the stack");
			return data;
		}

	}

	public void deleteStack() {
		top = -1;
	}

}
