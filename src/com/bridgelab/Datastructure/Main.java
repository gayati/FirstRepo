package com.bridgelab.Datastructure;

public class Main {

	public static <T> void main(String[] args)
	{
//		MyQueue queue = new MyQueue();
//		queue.enque("655");
//		queue.enque(25);
//		queue.print();
//		queue.deque();
//		queue.print();
//		
	    MyDequeue1<Integer> d = new MyDequeue1<>();
//	    d.insertFront(2569);
//	    d.insertFront(25);
//	    d.insertFront(85);
//		d.show();
//		
		System.out.println();
		d.insertLast(2);
		d.insertLast(256);
		d.insertLast(258);
		d.insertLast(45);
		d.show();
//		
		System.out.println();
         //int data = d.deleteLast();
		//System.out.println(data);
         d.show();
		
//		MyLinkedList<Integer> j = new MyLinkedList<>();
//		j.insert(256);
//		j.insert(58);
//		j.show();
//		
		
		
		
	}

}
