package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class CalenderStack {

	public static void main(String[] args)
	{
		System.out.println("Enter the month");
		int month = Utility.integerinput();
		System.out.println("Enter the year");
		int year=Utility.integerinput();
		Utility.printstack(month, year);
	}

}
