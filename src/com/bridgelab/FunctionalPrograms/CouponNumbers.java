/******************************************************************************
 
  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class CouponNumbers 
{
	public static void main(String[] args) 
	{
    
    int numbers = 0;
    System.out.println("Enter the number of coupons you want to generate");
    numbers = Utility.readInteger();
    Utility.couponumbers(numbers);
    
}
}