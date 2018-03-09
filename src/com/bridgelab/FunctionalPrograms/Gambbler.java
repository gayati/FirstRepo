package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class Gambbler {

	public static void main(String[] args) {
		 int stack;
	   		int goals;
	   		int no_of_times;
	   		System.out.println("Enter your stack price:");
	   	    stack = Utility.integerinput();
	   	    System.out.println("Enter you goal price");
	   	    goals = Utility.integerinput();
	   	    System.out.println("Enter the number of times you want to play");
	   	    no_of_times = Utility.integerinput();
		    Utility.gambler(stack,goals,no_of_times);

	}

}
