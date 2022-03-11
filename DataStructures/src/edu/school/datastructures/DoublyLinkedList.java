package edu.school.datastructures;

class DoublyLinkedNode<T>
{
	private T data;
	private DoublyLinkedNode<T> next;
    private DoublyLinkedNode<T> prev;
	
	public DoublyLinkedNode(T data, DoublyLinkedNode<T> next, DoublyLinkedNode<T> prev)
	{
		this.data = data;
		this.next = next;
        this.prev = prev;
	}
	
	public DoublyLinkedNode(T data)
	{
		this(data, null, null);
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setNext(DoublyLinkedNode<T> next)
	{
		this.next = next;
	}

    public void setPrev(DoublyLinkedNode<T> prev)
	{
		this.prev = prev;
	}
	
	public T getData()
	{
		return data;
	}
	
	public DoublyLinkedNode<T> getNext()
	{
		return next;
	}

    public DoublyLinkedNode<T> getPrev()
	{
		return prev;
	}
}

public class DoublyLinkedList<T> implements List<T> 
{
	private DoublyLinkedNode<T> start;
	private DoublyLinkedNode<T> end;

	private int size;
	
	public DoublyLinkedList()
	{
		clear();
	}
		
	public void add(T element) 
	{
		DoublyLinkedNode<T> currNode = new DoublyLinkedNode<T>(element);

		if(isEmpty())
		{
			start = currNode;
			end = start;
		}
		else
		{
			end.setNext(currNode);
			end = end.getNext();
			end.setPrev(currNode.getNext());
		}

		size ++;
	}

	public void insertAt(int index, T element)
	 {
		if(index > size() || index < 0)
			throw new IndexOutOfBoundsException();

		DoublyLinkedNode<T> currNode = new DoublyLinkedNode<T>(element);

		for(int i = 0; i < index; i ++)
		{
			
		}
	}

	public void removeAt(int index) 
	{
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();
		
	}

	public T get(int index) 
	{
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();

		DoublyLinkedNode<T> oldStart = start;

		while(index > 0)
		{
			oldStart = oldStart.getNext();
			index --;
		}

		return oldStart.getData();
	}

	public void remove(T element) 
	{

	}

	public void clear() 
	{
		start = end = null;
		size = 0;
	}

	public boolean isEmpty() 
	{
		return start == null;
	}

	public int size() 
	{
		return size;
	}
}