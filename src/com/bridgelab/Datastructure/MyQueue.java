package com.bridgelab.Datastructure;

import java.util.EmptyStackException;

public class MyQueue {
       
	 Node front;
     Node rear;
     int length;
     
	    public MyQueue() 
	    {
		this.front = front;
		this.rear = rear;
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
		
		public <T> void enque(T data)
		{
			Node<T> node = new Node<T>(data);
			if(isEmpty())
			{
				front =node;
			}
			else {
				rear.next = node;
				
			}
			rear=node;
			length++;

		}
        
		public void print()
		{
			if(isEmpty())
			{
				return;
			}
			Node node = front;
			while(node.next != null)
			{
				System.out.println(node.data);
				node = node.next;
				length++;
			}
			System.out.println(node.data);

		}
	   
		public <T> T deque()
		{
			if(isEmpty())
			{
				throw new EmptyStackException();
			}
			T result = (T) front.data;
			front= front.next;
			if(front==null)
			{
				rear = null;
			}
			length--;
			return result;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
