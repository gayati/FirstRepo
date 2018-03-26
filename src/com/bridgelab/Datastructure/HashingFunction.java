package com.bridgelab.Datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class HashingFunction 
{
	public static void main(String[] args)
	{
		int key=0;
		int i=0;
	try
	{
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
    
    
   
//    	 System.out.println();
//    	list.insert(inarray[i]);
    	 //map.put(key,inarray[i]);
   
    
      

        HashMap<Integer,MyLinkedList<Integer>> map = new  HashMap<>();
      
        for(Integer in : inarray)
          {
          	key= in%11;
          	
          	MyLinkedList<Integer> list = map.get(key);
        	if (list == null) 
			{
				list = new MyLinkedList<Integer>();
				map.put(key, list);//add respective key
			}
        	//map.put(key, list);//add respective key
          	list.insert(in);
          }
       
        
        System.out.println(map);
     
		
	}
	catch(Exception e)
	{
		
	}
	}

}

//		
//		HashMap<Integer, LinkedList<Integer>> hm = new HashMap<Integer, LinkedList<Integer>>();
//		for (Integer intg : list) 
//		{
//			int n = intg % 11;
//			LinkedList<Integer> ll = hm.get(n);
//			if (ll == null) 
//			{
//				ll = new LinkedList<Integer>();
//				hm.put(n, ll);//add respective key
//			}
//			ll.add(intg);//add
//		}
//		System.out.println(hm);
//		System.out.println("Enter a number to be search");
//		int n1 = sc.nextInt();
//		int N = n1 % 11;
//		hm.get(N);
//		LinkedList<Integer> ll1 = hm.get(N);
//		if (ll1 == null) 
//		{
//			ll1 = new LinkedList<Integer>();
//			hm.put(N, ll1);
//		}
//		System.out.println(ll1);
//		if (ll1.contains(n1))
//		{
//			System.out.println("The number is present in the list the remove it");
//			ll1.indexOf(ll1);
//			ll1.remove();
//		    
//		}
//		else
//			ll1.add(n1);
//		System.out.println(hm);
//	}
//
