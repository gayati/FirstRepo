package com.bridgelab.Datastructure;

import java.util.EmptyStackException;

public class MyStack<T> {

	Node<T> top;
	int length;
	
	public MyStack()
	{
		top= null;
		length=0;
	}
	
	public int length()
	{
		return length;
	}
	
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	
	public <T> void push(T data)
	{
		Node node = new Node<T>(data);
		node.next = top;
		top = node;
		length++;
	}
	
	public <T> T pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		T result = (T) top.data;
		top = top.next;
		length--;
		return result;
		
	}
	
	public <T> T peek()
	{
		
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return (T) top.data;
	}
	
	
	public  void show()
	{
		Node<T> node = top;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	
	
	
	
	
	
	
}
