package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class MergeSort {

	public static void main(String[] args) 
	{
		System.out.println();
		 String[] array = Utility.inputStringArray();

         String[] sortedArray = Utility.mergeSort(array);
         System.out.println("Sorted string array by mergesort:");
         Utility.printArray(sortedArray);

 }
	

}
