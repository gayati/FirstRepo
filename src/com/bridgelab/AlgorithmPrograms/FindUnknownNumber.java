package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class FindUnknownNumber {

	public static void main(String[] args)
	{
        System.out.println("Enter the number:");
        int number = Utility.integerinput();
        int number1 = (int) Math.pow(2, number);
        System.out.println(number1);
        System.out.println("Think any number between" + " "+0 +"  "+ " " +"to" + "  " + (number1-1));
        int secretnumber = Utility.search(0, number1-1);
        System.out.println("The number assumed by user will be:");
        System.out.println(secretnumber);
   	}

}
