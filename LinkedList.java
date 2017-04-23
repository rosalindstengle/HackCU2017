package recyclean;

import java.util.Iterator;

public class LinkedList<E>
{
	//Variables
	Node<E> head, tail;
	int numItems;
	//Variables
	
	//Constructor
	//Constructor
	
	public Node<E> getHead()
	{
		return head;
	}
	//Methods
	public void add(E data)
	{
		Node node = new Node(data);
		//Set the next of tail to be the new node. 
		tail.setNext(node);
		
		//Update tail
		tail = tail.getNext();
		numItems++;
	}
	public int size()
	{
		return numItems;
	}
	
	public E removeTop()
	{
		//Variables
		Node<E> node;
		//Variables
		
		//Keep a temp var of the head. 
		node = head;
		//Iterate to the next. 
		head = head.getNext();
		numItems--;
		//Return the next data. 
		return node.getData();
	}
	//Methods
}
