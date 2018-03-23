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
    	 
    	
//    	 System.out.println();
//    	list.insert(inarray[i]);
    	 //map.put(key,inarray[i]);
    }
    
      
    for(Integer in : inarray)
    {
    	System.out.println(in);
    	
    }
       // MyLinkedList<Integer> list = new MyLinkedList<>();
        HashMap<Integer,MyLinkedList<Integer>> map = new  HashMap<>();
      
//        for(i=0;i<=list.size;i++)
//        {
//        	  key=(%11);
//        			  
//        }
//        for(Integer in : inarray)
//        {
        
//        	key= in%11;
//        	System.out.println(key);
//        	list.insert(map.get(key));
//        	
//        }
        for(Integer in : inarray)
          {
          	key= in%11;
          	System.out.println(key);
          	MyLinkedList<Integer> list = map.get(key);
          	list.insert(in);
          }
       
        
        System.out.println(map);
     
//   
//     
//    System.out.println(map);
    //  list.show();
      
      
//      for(int i=0; i<array.length;i++)
//      {
//    	 System.out.println();
//      }
    
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println(i + "--->" +  ));
//		}
//			
//			
	}
	catch(Exception e)
	{
		
	}
	}

}
