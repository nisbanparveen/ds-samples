package Implemenation;
/**
 * Implementation of Stack with simple array
 * @author Nisban Parveen
 *
 */
public class SimpleArrayStack {

	private int top;
	private int capacity;
	private int[] array;

	public SimpleArrayStack() {
		top = -1;
		capacity =2;
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
			System.out.println("Stack Overflow");
		else {
			System.out.println(data+" pushed into to stack");
			array[++top] = data;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Empty");
			return 0;
		} else {
			int  data= array[top--];
			System.out.println(data+" popped out of the stack");
			return data;
		}

	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack Empty");
			return 0;
		} else {
			int  data= array[top];
			System.out.println(data+" at the top of the stack");
			return data;
		}

	}

	public void deleteStack() {
		top = -1;
	}

}