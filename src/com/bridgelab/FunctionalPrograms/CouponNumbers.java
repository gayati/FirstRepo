package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class CouponNumbers 
{
	public static void main(String[] args) 
	{
    
    int numbers = 0;
    System.out.println("Enter the number of distintict numbers");
    numbers = Utility.integerinput();
    Utility.couponumbers(numbers);
    
}
}