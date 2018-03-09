package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String inputstring = Utility.stringinput();
	
		int first = 0;
		int last = inputstring.length();
		Utility.permute(inputstring,first,last-1);
	}

}
