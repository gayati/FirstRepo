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

public class WindChill {

	public static void main(String[] args) {
	    double temperature;
		double velocity;
		System.out.println("Enter the temperature value");
		temperature = Utility.readDouble();
		System.out.println("Enter the velocity value");
		velocity = Utility.readDouble();
        Utility.windchill(temperature, velocity);
	}

}
