package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class MergeSort {

	public static void main(String[] args) 
	{
		System.out.println();
		String stringarray[] = Utility.inputStringArray();
		System.out.println("Unsorted array:");
		for(String arr: stringarray)
		{
			System.out.println(arr);
		}
		int length = stringarray.length;
		System.out.println(length);
		Utility.mergeSort(stringarray,0,length-1);
		System.out.println();	
		//Utility.printArray(s);
	}

}
