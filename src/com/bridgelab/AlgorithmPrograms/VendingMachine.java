package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {

		System.out.println("Enter the amount ");
        int amount = Utility.integerinput();
        Utility.vendingmachine(amount);
	} 

}
