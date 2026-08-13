import java.util.Arrays;
class Stack
{
	int size = 100;
	int[] stack = new int[size];
	int top = -1;
	
	int push(int data)
	{
		if(top == size-1)
		{
			System.out.println("Overflow");
			return -1;
		}
		return stack[++top] = data;
	}
	
	int pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
			return -1;
		}
		return stack[top--];
	}
	
	int peek()
	{
		return stack[top];
	}
	
	boolean isEmpty()
	{
		return top == -1;
	}
	
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(5);
		s.push(8);
		s.push(2);
		
		System.out.println("Pop Element: "+s.pop());
		System.out.println("Peek Value: "+s.peek());
		System.out.println("Empty: "+s.isEmpty());
	}
}