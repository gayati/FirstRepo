package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class Distance {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the x coenfficient:");
		double x = Utility.integerinput();
		System.out.println("Enter the y coenfficient:");
		double y = Utility.integerinput();
		Utility.distance(x, y);

	}

}
