import java.util.Stack;
class InfixtoPostfix
{
	public static int precedence(char c)
	{
		switch(c)
		{
			case '-':
			case '+':
			   return 1;
			   
			case '*':
			case '/':
			   return 2;
			   
			case '^':
			   return 3;
		}
		return -1;
	}
	
	
	public static String InfixtoPostfix(String infix)
	{
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(char c: infix.toCharArray())
		{
			if(Character.isLetterOrDigit(c))
			{
				postfix.append(c);
			}
			else if(c == '(')
			{
				stack.push(c);
			}
			else if(c == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
				{
					postfix.append(stack.pop());
				}
				stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
				{
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty())
		{
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}
	
	public static void main(String args[])
	{
		String infix = "(A+B/C*(d+E)-F)";
		System.out.println("Postfix: "+InfixtoPostfix(infix));
	}
}
