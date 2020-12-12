package problems;

import java.util.Stack;

/**
 * This solution is for a classic direct stack implementation problem, the
 * balancing of symbols.
 * 
 * We use stacks to check if the given expression has balanced symbols or not.
 * 
 * Algorithm Steps:
 * 
 * 1. Create a Stack 
 * 2. while(end of input is not reached) 
 * 	a. If the character
 * read is not symbol to be balanced, ignore it. 
 * 	b. If the character is opening
 * symbol like (,[,{ then push it onto stack. 
 * 	c. If it is closing symbol like
 * ),],}, if the stack is empty report and error, else pop the stack
 * 	d. If the symbol popped is not the corresponding opening symbol, report error
 * 
 * @author Nisban Parveen
 *
 */
public class SymbolBalancing {
	public static boolean isBalanced(String expression){
		Stack<Character> stack = new Stack<Character>();
		
		for(char character : expression.toCharArray()) {
			
			if(character == '(' || character == '['||character == '{' ) {
				stack.push(character);
				continue;
			}
			
			if((character==')' || character==']' || character == '}') && (stack.isEmpty())) {
			return false;
			}
				char check;
			switch (character) {
			case ')':
				check= stack.pop();
				if(check=='[' || check == '{')
					return false;
				break;
			case ']':
				check= stack.pop();
				if(check=='(' || check == '{')
					return false;
				break;
			case '}':
				check= stack.pop();
				if(check=='[' || check == '(')
					return false;
				break;
			}
		}
		
		
		return (stack.isEmpty()); 
		
	}
	
	
	public static void main(String[] args) {
		SymbolBalancing balancing = new SymbolBalancing();
		if(balancing.isBalanced("{([A+B])+[A-B]}")) {
			System.out.println("The expression is balanced");
		}else System.out.println("The expression is not balanced");
	}

}