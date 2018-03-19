package com.bridgelab.Datastructure;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimeAnagram2DArray {

	public static void main(String[] args) 
	{
		String[][] prime = Utility.create2DArray1();
		ArrayList<String> al1 = Utility.primenumbers();
		
	    Utility.printanagram2Darray(prime,al1);
	}

}
