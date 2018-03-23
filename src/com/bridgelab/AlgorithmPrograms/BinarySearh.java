/******************************************************************************
 
  
 *  Purpose:
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import java.util.Arrays;

import com.bridgelab.Utility.Utility;

public class BinarySearh {

	public static void main(String[] args)
	{
		
		String filePath = "/home/bridgeit/Documents/myfile.txt";
		//Utility.readFile(filePath);
		String[] stringitems = Utility.readFile(filePath);
		Arrays.sort(stringitems);
		System.out.print("Sorted String array:");
		for(String s: stringitems)
		{
			System.out.print(s + " ");
		}
		System.out.println("\n");
	    System.out.println("Enter the string which is to be find from the above array:");
		String key = Utility.readString();
		int first = 0;
		int last = stringitems.length -1;
		int index = Utility.binarySearch(stringitems,key,first,last);
		if(index<0)
		{
			System.out.println("Not Found");
		}
		else
		{
		System.out.println("Element is found at index: " + index);
		}

	}

}
