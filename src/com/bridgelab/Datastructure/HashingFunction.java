package com.bridgelab.Datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.bridgelab.Utility.Utility;

public class HashingFunction 
{
	public static void main(String[] args) throws IOException
	{
		int key=0;
		int i=0;
	
	System.out.println();
	
	String filepath = "/home/bridgeit/Documents/newfile.txt";
	FileReader file = new FileReader(filepath);
	BufferedReader reader = new BufferedReader(file);
	String line = reader.readLine();
	String array[] =line.split(" ");
	
    Integer inarray[] = new Integer[array.length];
   
    for(i=0; i<array.length;i++)
    {
    	String numString= array[i];
    	
   	   inarray[i]= Integer.parseInt(numString);
   	   System.out.println(inarray[i]);
    	 
    }
    
	MyLinkedList<Integer> list = null;
    
        HashMap<Integer,MyLinkedList<Integer>> map = new  HashMap<>();
      
        for(Integer in : inarray)
          {
          	key= in%11;
          	
          list = map.get(key);
        	if (list == null) 
			{
				list = new MyLinkedList<Integer>();
				map.put(key, list);//add respective key
			}
        	//map.put(key, list);//add respective key
          	list.insert(in);
          }
       
        
        System.out.println(map);
     
		
	
	
	
//	System.out.println("Enter a number to be search");
//	int n1 =Utility.readInteger();
//	int N = n1 % 11;
//	map.get(N);
//	MyLinkedList<Integer> ll1 = map.get(N);
//	if (ll1 == null) 
//	{
//		ll1 = new MyLinkedList<Integer>();
//		map.put(N, ll1);
//	}
//	System.out.println(ll1);
//	
//	
	
	 Utility.bubbleSort(inarray);
     
     for( i=0; i<inarray.length; i++)
     {
     	list.insert(inarray[i]);
     }
    
     System.out.println();
     System.out.println("Enter the number to search:");
     int number = Utility.readInteger();
    
		int N = number % 11;
		System.out.println(map.get(N));
		MyLinkedList<Integer> ll1 = map.get(N);
	
     
     int index= ll1.indexOf(number);
    
                
		boolean flag = ll1.search(list.head, number);
     
     if(flag==true)
     {
     	System.out.println("Found");
     	ll1.deleteAt(index);
     }
     else
     {
      System.out.println("Not found");
      ll1.insertAt(index, number);
     }
   
    Utility.writeFile(filepath, list);
   
}
}
