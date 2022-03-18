package edu.school.datastructures;

class StackNode<T>
{
	private T data;
	private StackNode<T> next;
	
	public StackNode(T data, StackNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public StackNode(T data)
	{
		this(data, null);
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setNext(StackNode<T> next)
	{
		this.next = next;
	}
	
	public T getData()
	{
		return data;
	}
	
	public StackNode<T> getNext()
	{
		return next;
	}
}

public class Stack<T> 
{
    StackNode<T> top;

    private int size;	

    public Stack()
    {
        clear();
    }

    public void clear()
    {
        top = null;
    }

    public T getTop()
    {
        return top.getData();
    }

    public void pop()
    {
        if(!isEmpty())
        {
            top = top.getNext();
        }
    }

    public void push(T data)
    {
        if(isEmpty())
        {
            top = new StackNode<T>(data);
        }
        else
        {
            top = new StackNode<T>(data, top);
        }

        size ++;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int getSize()
    {
        return size;
    }
}
