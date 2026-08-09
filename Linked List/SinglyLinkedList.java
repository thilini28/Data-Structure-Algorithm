class SinglyLinkedList
{
	Node head = null;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null; 
		}
	}
	
	void insertBegininng(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	void insertLast(int data)
	{
		if(head == null)
		{
			insertBegininng(data);
		}
		else
		{
			Node newNode= new Node(data);
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
		    temp.next = newNode;
		}
	}
	
	void delete(int data)
	{
		Node temp = head;
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		while(temp.next != null && temp.next.data != data)
		{
			temp = temp.next;
		}
		if(temp.next == null)
		{
			System.out.print("Invalid data");
            return ;			
		}
		temp.next = temp.next.next;
	}
	
	void display()
	{
		Node temp = head;
        while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}			
		System.out.print("NULL");
	}
	
	public static void main(String args[])
	{
		SinglyLinkedList SL = new SinglyLinkedList();
		SL.insertBegininng(5);
		SL.insertBegininng(9);
		SL.insertBegininng(7);
		SL.insertLast(45);
		//SL.delete(45);
		SL.display();
	}
}