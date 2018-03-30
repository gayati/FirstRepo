package com.bridgelab.ObjectOrientedPrograms;

import com.bridgelab.Datastructure.MyLinkedList;
import com.bridgelab.Utility.Utility;

public class StockLinkedList {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
//		System.out.println("Enter the number of share you want to add: ");
//		int number = Utility.readInteger();
//		
//		for(int i=0; i<number; i++)
//		{
		System.out.println("Enter the share you want to add: ");
		String symbol = Utility.readString();
		System.out.println("Enter the share price:");
	    Long shareprice = Utility.readLong();
	    System.out.println("Enter the share number:");
	    Long sharenumber = Utility.readLong();
	    
	    
	    MyLinkedList <String> symbollist = new MyLinkedList<>();
	    symbollist.insert(symbol);
	    symbollist.show();
	    
	    MyLinkedList<Long> pricelist = new MyLinkedList<>();
	    pricelist.insert(shareprice);
	    pricelist.show();
	    
	    MyLinkedList<Long> numberlist = new MyLinkedList<>();
	    numberlist.insert(sharenumber);
	    numberlist.show();
//		}
	}

}
