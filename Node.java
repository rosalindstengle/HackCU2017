package recyclean;

public class Node<E> 
{
	//Variables
	E data;
	Node next;
	//Variables
	
	//Constructor
	public Node(E data)
	{
		this.data = data;
	}
	//Constructor

	//Methods
	public E getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(E data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}	
}
