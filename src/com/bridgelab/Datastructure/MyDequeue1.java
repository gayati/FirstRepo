package com.bridgelab.Datastructure;

public class MyDequeue1<T>
   {

		 public Node<T> front =null;
		 public Node<T> rare;
         int size=0;
         
         
         public int size()
  		 {
  			int count = 0;
  			Node<T> current = front;
  			while(current !=null)
  			{
  				current = current.next;
  				count++;
  			}
  			return count;
  		}

        public boolean isEmpty()
        {
     	   return size() ==0;
        }
        
        public void insertFront(T data)
        {
        	Node<T> node = new Node<T>(data);
			if(front==null)
			{
			 front = node;
			 rare = node;
			}
			else 
			{
				node.next = front;
				front = node;
			}
        }
        
        
        public void insertLast(T data)
		{
			Node<T> node = new Node<T>(data);
			if(front==null)
			{
			  front = node;
			}
			else 
			{
				Node<T> temp = front;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = node;
			}
		}
//        
//        Public T deleteFirst()
//          {
//        	if(isEmpty())
//        	{
//        	  	
//        	}
//        	
//        	}
//        
//        public T deleteLast()
//        {
//        	if(front==rare)
//        	{
//        		front=null;
//        		rare=null;
//                return null;
//        	}  	
//        	Node<T> temp =  front;
//        	while(temp.next !=rare)
//        	{
//        		temp=temp.next;
//        		
//        	}
//        	rare=null;
//        	rare=temp;
//			return temp.data;
//        }
//        
        
        
        
        public void show()
		{
			Node<T> node = front;
			while(node.next!=null)
			{
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
        
         
	}


