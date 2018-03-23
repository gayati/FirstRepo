/******************************************************************************
 
  
 *  Purpose: 
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class BubbleSort {

	public static  void main(String[] args)
	{
		 Integer[] intArray = Utility.integerarrayInput(); 
		 System.out.print("Unsorted Integer array: ");
		 for(Integer i: intArray)
		 {
			 System.out.print(i + " ");
		 }
		 System.out.println();
		 System.out.println();
		 System.out.print("Sorted integer array by bubblesort: ");
		 Utility.bubbleSort(intArray);

	}

}
