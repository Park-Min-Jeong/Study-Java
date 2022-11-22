package genericscollection;

// List -> Stack
import java.util.Stack;

public class Code129 {
	static void printStack(Stack<Integer> s) {
		for (Integer x: s)
			System.out.print(x + " ");
		System.out.println(" -> " + s.size());
	}
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		
		Integer data;
		int index;
		
		// push
		stk.push(10);
		stk.push(20);
		stk.push(30);
		printStack(stk);
		
		// pop
		data = stk.pop();
		System.out.println("You popped >>> " + data);
		printStack(stk);
		
		// peek
		data = stk.peek();
		System.out.println("You peeked >>> " + data);
		printStack(stk);
		
		// push after pop
		stk.push(40);
		printStack(stk);
		
		// search
		index = stk.search(40);
		System.out.println("data 40 is at: " + index);
		index = stk.search(30);
		System.out.println("data 30 is at: " + index);
		index = stk.search(20);
		System.out.println("data 20 is at: " + index);
		index = stk.search(10);
		System.out.println("data 10 is at: " + index);
		
		while(!stk.empty())
			System.out.println(stk.pop());
	}
}
