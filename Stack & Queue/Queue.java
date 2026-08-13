public class Queue
{
	static int size = 4;
	int queue[] = new int[size];
	int front = -1;
	int rear = -1;
	
	public void enqueue(int data)
	{
		if(rear == size-1)
		{
			throw new IndexOutOfBoundsException("Queue is Full");
		}
		if(front == -1 && rear == -1)
		{
			front++;
			queue[++rear] = data;
			
			return;
		}
		queue[++rear] = data;
	}
	
	public int dequeue()
	{
		if(front == -1 || rear == -1 || front > rear)
		{
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
		return queue[front++];
	}
	
	public static void main(String args[])
	{
		Queue Q = new Queue();
		
		Q.enqueue(5);
		Q.enqueue(9);
		Q.enqueue(56);
		System.out.println(Q.dequeue());
		System.out.println(Q.dequeue());
		System.out.println(Q.dequeue());		
	}
}