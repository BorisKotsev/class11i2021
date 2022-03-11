package edu.school.datastructures;

class LinkedNode<T>
{
	private T data;
	private LinkedNode<T> next;
	
	public LinkedNode(T data, LinkedNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public LinkedNode(T data)
	{
		this(data, null);
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setNext(LinkedNode<T> next)
	{
		this.next = next;
	}
	
	public T getData()
	{
		return data;
	}
	
	public LinkedNode<T> getNext()
	{
		return next;
	}
}

public class LinkedList<T> implements List<T> 
{
	private LinkedNode<T> start;
	private LinkedNode<T> end;
	private int size;	
	
	public LinkedList()
	{
		clear();
	}
		
	public void add(T element) 
	{
		if(isEmpty())
		{
			start = new LinkedNode<T>(element);
			end = start;
		}
		else
		{
			end.setNext(new LinkedNode<T>(element));
			end = end.getNext();
		}

		size ++;
	}

	public void insertAt(int index, T element) 
	{
		if(index > size() || index < 0)
			throw new IndexOutOfBoundsException();
		
		LinkedNode<T> currentNode = start;
		LinkedNode<T> previousNode = null;

		while(index > 0)
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			index --;
		}

		if(previousNode != null)
		{
			previousNode.setNext(new LinkedNode<T>(element, currentNode));
		}
		else
		{
			start = new LinkedNode<T>(element, start);
		}

		size ++;
	}

	public void removeAt(int index) 
	{
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();
		
		LinkedNode<T> currentNode = start;
		LinkedNode<T> previousNode = null;

		while(index > 0)
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			index --;
		}

		if(previousNode == null)
		{
			start = start.getNext();
			
			if(start == null)
				end = null;
		}
		else
		{
			previousNode.setNext(currentNode.getNext());
			
			if(previousNode.getNext() == null)
				end = previousNode;
		}

		size--;
	}

	public T get(int index) 
	{
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();

		LinkedNode<T> oldStart = start;

		while(index > 0)
		{
			oldStart = oldStart.getNext();
			index --;
		}

		return oldStart.getData();
	}

	public void remove(T element) 
	{
		LinkedNode<T> currentNode = start;
		LinkedNode<T> previousNode = null;

		while(currentNode != null && !currentNode.getData().equals(element))
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}

		if(currentNode != null)
		{
			if(previousNode == null)
			{
				start = start.getNext();

				if(start == null)
					end = null;
			}
			else
			{
				previousNode.setNext(currentNode.getNext());
				
				if(previousNode.getNext() == null)
					end = previousNode;
			}

			size --;
		}
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
