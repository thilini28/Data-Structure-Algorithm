class DoublyLinkedList
{
	Node head = null;
	class Node
	{
		int data;
		Node next;
		Node prev; //*
		
		Node(int data)
		{
			this.data=data;
			next = null;
			prev = null; //*
		}
	}
	
	void insertBegining(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode; //*
		head = newNode;
	}
	
	void insertLast(int data)
	{
		if(head == null)
		{
			insertBegining(data);
		}
		else{
			Node newNode = new Node(data);
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next; 
			}
			temp.next = newNode;
			newNode.prev = temp; //*
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
			System.out.println("Invalid Data");
			return;
		}
		temp.next = temp.next.next;
		if(temp.next == null || temp == null)
		{
			return ;
		}
		temp.next.prev = temp;
	}
	
	void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data +"->");
			temp = temp.next;
		}
		System.out.print("NULL");
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList DL = new DoublyLinkedList();
		DL.insertBegining(5);
		DL.insertBegining(9);
		DL.insertBegining(12);
		DL.insertLast(88);
		DL.delete(9);
		DL.display();
	}
}