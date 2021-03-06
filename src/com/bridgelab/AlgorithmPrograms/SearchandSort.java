/******************************************************************************
 
  
 *  Purpose: Take input from user and print two dimensinal array.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import com.bridgelab.Utility.Utility;

public class SearchandSort {

	public static <E> void main(String[] args)
	{
		ArrayList<Object> list = new ArrayList<>();
		char input = 0;
		 do
	       {
       System.out.println("1.IntegerBinary Search");
       System.out.println("2.StringBinary Search");
       System.out.println("3.Integer BubbleSort");
       System.out.println("4.String BubbleSort ");
       System.out.println("5.Integer InsertionSort");
       System.out.println("6.String InsertionSort");
       int choice = Utility.readInteger();
       long startTime;
       long stopTime;
       long  elapsedtime;
       int key;
       int first;
       int last;
       int index;
       
		switch(choice)
		{
		  case 1:   Integer[] intitems= Utility.integerarrayInput();
	                Arrays.sort(intitems);
                    System.out.print("Sorted Integer Array: ");
	                for (Integer item : intitems) 
	                {
	                System.out.print(item+" ");
	                }
	                System.out.println();
	                System.out.println("Enter the key which is to be find from the above array:");
		            key = Utility.readInteger();
					first = 0;
					last = intitems.length -1;
			        startTime = System.currentTimeMillis();
					index = Utility.binarySearch(intitems,key,first,last);
			    	stopTime = System.currentTimeMillis();
				    elapsedtime = stopTime - startTime;
					System.out.println("Element is found at index: " + index);
					System.out.println("Total time required for searching is:"+ elapsedtime +"milliseconds");
					System.out.println();
					list.add( elapsedtime);
					
				    break;
		
		    case 2:	System.out.println("StringBinary Search");
					String[] stringitems = Utility.inputStringArray();
					Arrays.sort(stringitems);
                    System.out.print("Sorted String Array: ");
					for(String s: stringitems)
					{
						System.out.print(s + " ");
					}
					System.out.println();
				    startTime = System.currentTimeMillis();
				    System.out.println("Enter the string which is to be find from the above array:");
					String key1 = Utility.readString();
				    first = 0;
					last = stringitems.length -1;
					index = Utility.binarySearch(stringitems,key1,first,last);
					stopTime = System.currentTimeMillis();
				    elapsedtime = stopTime - startTime;
					System.out.println("Element is found at index: " + index);
					System.out.println("Total time required for searching is:"+ elapsedtime +"milliseconds");
					System.out.println();
					list.add(elapsedtime);

			       break;
		 
		   case 3:  Integer[] intArray = Utility.integerarrayInput(); 
					System.out.print("Sorted integer array by bubblesort:");
					startTime = System.currentTimeMillis();
					Utility.bubbleSort(intArray);
					stopTime = System.currentTimeMillis();
				    elapsedtime = stopTime - startTime;
					System.out.println("Total time required for sorting is:"+ elapsedtime +" " + "milliseconds");
					list.add(elapsedtime);

					break;
		
			case 4: String[] stringArray = Utility.inputStringArray();
			        System.out.print("Sorted string array by bubblesort:");
				    startTime = System.currentTimeMillis();
	                Utility.bubbleSort(stringArray);
	                stopTime = System.currentTimeMillis();
				    elapsedtime = stopTime - startTime;
					System.out.println("Total time required for sorting is:"+ elapsedtime +" " + "milliseconds");
					break;
		  
		case 5:   intArray = Utility.integerarrayInput();
		          int length = intArray.length;
		          System.out.print("Sorted integer array by Insertionsort:");
				  startTime = System.currentTimeMillis();
		          Utility.insertionSort(intArray, length); 	
		          stopTime = System.currentTimeMillis();
				  elapsedtime = stopTime - startTime;
				  System.out.println("Total time required for sorting is:"+ elapsedtime +" " + "milliseconds");
				  list.add(elapsedtime);
				  break;
                  
		case 6:  stringArray = Utility.inputStringArray();
		         length = stringArray.length;
		         System.out.print("Sorted string array by Insertionsort:");
				 startTime = System.currentTimeMillis();
		         Utility.insertionSort(stringArray, length);
		         stopTime = System.currentTimeMillis();
			     elapsedtime = stopTime - startTime;
				 System.out.println("Total time required for sorting is:"+ elapsedtime +" " + "milliseconds");
				 list.add(elapsedtime);

				 break;
                 
		default: System.out.println("Invalid Choice");
                break;
                 
		         
		}
		    
		System.out.print("Do You Want To Continue (Y/N)?: ");
        input=Utility.readChar();
       }
       while((input!='n')&&(input!='N'));
       
      
       Collections.sort(list, Collections.reverseOrder());
       System.out.println("Elapsed time performance for searching and sorting in decending order is as follows");
       System.out.println(list);
	}

}
