package edu.school.datastructures.tests;

import edu.school.datastructures.List;
import edu.school.datastructures.Stack;
import edu.school.datastructures.ArrayList;
import edu.school.datastructures.LinkedList;
import edu.school.datastructures.DoublyLinkedList;

public class Test 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();

		stack.push(31);
		stack.push(91);
		stack.push(1);
		
		for(int i = 0; i < stack.getSize(); i ++)
		{
			System.out.println(stack.getTop());
			stack.pop();
		}
	}
}
