package com.bridgelab.AlgorithmPrograms;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		ArrayList<String> al = Utility.primenumbers();
		for(String s:al)
	        { 
			System.out.println(s);	
	        }

	}

}
