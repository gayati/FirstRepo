package com.bridgelab.Datastructure;
import java.io.BufferedReader;
import java.io.FileReader;

import com.bridgelab.Utility.Utility;
public class OrderdList {

	public static void main(String[] args) 
	{
		MyLinkedList<Integer> list = new MyLinkedList<>();

		Integer[] intArray = null;
		String filePath = "/home/bridgeit/Documents/myfile1.txt";
		try
		{
		FileReader file = new FileReader(filePath);
		BufferedReader reader = new BufferedReader(file);
		String line = reader.readLine();
		String[] array = line.split(" ");
		intArray= new Integer[array.length];
		for(int i=0; i<intArray.length;i++)
		{
			String numString = array[i];
			intArray[i] = Integer.parseInt(numString);
		}
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
        Utility.bubbleSort(intArray);
      
        for(int i=0; i<intArray.length; i++)
        {
        	list.insert(intArray[i]);
        }
        System.out.println("Numbers are added in the list");
        list.show();
        
        
        
        
        System.out.println("Enter the number to search:");
        int number = Utility.integerinput();
      
        
        int index= list.indexOf(number);
        System.out.println("index is" +index);
                   
		boolean flag = list.search(list.head, number);
        
        if(flag==true)
        {
        	System.out.println("Found");
        	list.deleteAt(index);
        }
        else
        {
         System.out.println("Not found");
         list.insertAt(index, number);
        }
        list.show();
        Utility.writeFile(filePath, list);
        
		

	}

}