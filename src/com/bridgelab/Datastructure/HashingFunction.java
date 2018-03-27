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
     
		
	
	
	
	System.out.println("Enter a number to be search");
	int n1 =Utility.readInteger();
	int N = n1 % 11;
	map.get(N);
	MyLinkedList<Integer> ll1 = map.get(N);
	if (ll1 == null) 
	{
		ll1 = new MyLinkedList<Integer>();
		map.put(N, ll1);
	}
	System.out.println(ll1);
//	if (ll1.contains(n1))
//	{
//		System.out.println("The number is present in the list the remove it");
//		ll1.indexOf(ll1);
//		ll1.remove();
//	    
//	}
//	else
//		ll1.insert(n1);
//	System.out.println(map);

}
}
