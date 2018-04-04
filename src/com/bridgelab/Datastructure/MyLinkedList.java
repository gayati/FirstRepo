package com.bridgelab.Datastructure;


public class MyLinkedList<T> 
{
         public Node<T> head;
         int size=0;
         
         
       public int size()
 		{
 			int count = 0;
 			Node<T> current = head;
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
	
		public void insert(T data)
		{
			Node<T> node = new Node<T>(data);
			if(head==null)
			{
			 head = node;
			}
			else 
			{
				Node<T> temp = head;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = node;
			}
		}
		
		public void insertAt(int index,T data)
		{
			Node<T> node = new Node<T>(data);
            Node<T> temp = head;
            for(int i=0; i<=index-1; i++)
            {
            	temp= temp.next;
            }
            node.next = temp.next;
            temp.next = node;
		}
		
		public void deleteAt(int index)
		{
			if(index==0)
			{
				head = head.next;
			}
			else
			{
				Node<T> temp = head;
				Node<T> temp1 = null;
				for(int i=0; i<index-1; i++)
	            {
	            	temp= temp.next;
	            }
				temp1 = temp.next;
				temp.next = temp1.next;
			}
		}
		
		
		
		public boolean search(Node head,T key)
		{
			if(head==null)
			{
				return false;
			}
			Node<T> current = head;
			while(current !=null)
			{
				if(current.data.equals(key))
				{
					return true;
				}
				current = current.next;
			}
			return false;
		}
		
		 public int indexOf(T key) {

	        int index = 0;
	        Node<T> current = head;
	        while (current != null) {
	            if (current.data.equals(key)) {
	                return index;
	            }

	            index++;
	            current = current.next;
	        }
	        if(index == size  && key == null){
	            return -1;
	        }
	        else{
	            return index;
	        }
	    }
		
		public void show()
		{
			Node<T> node = head;
			while(node.next!=null)
			{
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}

		 public String toString() {
				String string = "";
				//Node<T> temp = head;
				for(Node<T> temp = head; temp != null; temp = temp.next) {
					string = string + temp.data + " ";
				}
				
				return string;
			}
		 
		


}
