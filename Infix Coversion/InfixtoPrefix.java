import java.util.Stack;
class InfixtoPrefix
{
	public static int precedence(char c)
	{
		switch(c)
		{
			case '+':
			case '-':
			   return 1;
			   
			case '*':
			case '/':
			   return 2;
			   
			case '^':
			   return 3;
		}
		return -1;
	}
	
	public static String infixtoprefix(String infix)
	{
		StringBuilder input = new StringBuilder(infix);
		input.reverse();
		
		StringBuilder prefix = new StringBuilder();
		Stack <Character> stack = new Stack<>();
		
		for(char c:input.toString().toCharArray())
		{
			if(Character.isLetterOrDigit(c))
			{
				prefix.append(c);
			}
			else if(c == ')')
			{
				stack.push(c);
			}
			else if(c == '(')
			{
				while(!stack.isEmpty() && stack.peek() != ')')
				{
					prefix.append(stack.pop());
				}
				stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && precedence(c) < precedence(stack.peek()))
				{
					prefix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			prefix.append(stack.pop());
		}
		return prefix.reverse().toString();
	}
	
	public static void main(String args[])
	{
		String infix = "(A+B/C*(D+E)-F)";
        System.out.println("Prefix: "+infixtoprefix(infix));		
	}
}