package problems;

import java.util.Stack;

import com.sun.org.apache.bcel.internal.generic.StackConsumer;

/**
 * Problem : Design a stack to find minimum value
 * 
 * Steps: Create a Stack that maintains minimum of all the values. All the value
 * is less than the below element. For simplicity call it min stack.
 * When we pop the Main Stack we pop the Min stack too.
 * While pushing to Main stack, push either the new element or the current minimum whichever is lowest to the min
 * stack.
 * 
 * The Peek of the min stack will give the minimum value. Return the value to get minimum.
 * 
 * 
 * @author Nisban Parveen
 *
 */
public class FindMinimum {
	private Stack<Integer> mainStack;
	private Stack<Integer> minStack;

	public FindMinimum() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int data) {
		mainStack.push(data);
		if (minStack.isEmpty() || ((Integer) minStack.peek() >= (Integer) data)) {
			minStack.push(data);
		}
	}

	private int pop() {
		if (mainStack.isEmpty())
			return (Integer) null;
		Integer mainStackTop = mainStack.peek();
		Integer minStackTop = minStack.peek();

		if (minStackTop == mainStackTop)
			minStack.pop();
		return mainStack.pop();
	}

	public int getMinimum() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		FindMinimum findMinimum = new FindMinimum();

		findMinimum.push(42);
		findMinimum.push(23);
		findMinimum.push(24);
		findMinimum.push(55);
		System.out.println("The Minimum value :" + findMinimum.getMinimum());
	}
}
