package com.bridgelab.Datastructure;

public class MyDeque 
{   
	static final int max =50;
	 char array[];
	 int  front;
     int rear;
     int size;
     
	public MyDeque() 
	{
		array = new char[max];
		front = 0;
		rear = -1;
		this.size=size;
	}
	 public int size()
		{
			return size;
		}
		
		
		public boolean isFull()
		{
			return((front==0 && rear==size-1) || front==rear+1);	
		}

		public boolean isEmpty()
		{
			return(front==-1);	
		}
		
		
	public void addFront(char data)
	{
		if(isFull())
		{
			System.out.println("Queue is overflow");
			return;
		}
		if(isEmpty())
		{
			front=0;
			rear=0;
		}
		else if(front==0)
		{
			front = size-1;
		}
		else
		{
			front = front-1;
		}
 		array[front] = data;
 		
	}
		
	public void addRear(char data)
	{
		if(isFull())
		{
			System.out.println("Queue is overflow");
			return;
		}
		if(isEmpty())
		{
			front=0;
			rear=0;
		}
		else if(rear==size-1)
		{
			rear = 0;
		}
		else
		{
			rear=rear+1;
		}
 		array[rear] = data;
 		
	}
		
		
		public void deleteFront()
		{
			if(isEmpty())
			{
				System.out.println("Queue is underflow");
				return;
			}
			if(front==size-1)
			{
				front=-1;
				rear=-1;
			}
			else if(front==size-1)
			{
				front=0;
			}
			else
			{
				front=front+1;
			}
		}
		
			public void deleteLast()
			{
				if(isEmpty())
				{
					System.out.println("Queue is underflow");
					return;
				}
				if(front==size-1)
				{
					front=-1;
					rear=-1;
				}
				else if(rear==0)
				{
					rear=size-1;
				}
				else
				{
					rear=rear-1;
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
}
