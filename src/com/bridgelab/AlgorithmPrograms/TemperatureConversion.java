/******************************************************************************
 
  
 *  Purpose: This program is for temperature conversion from  Celsius to Fahrenheit
 *           and viceversa.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
	 System.out.println("Temperature Conversion");
	 System.out.println("1.Temperture conversion from Celsius to Fahrenheit");
	 System.out.println("2.Temperture conversion from  Fahrenheit to Celcius");

     int choice = 0;
     choice = Utility.readInteger();
     switch (choice) {
	case 1: 
		   Utility.temperatureConversionCelciusToFahrenheit();
		   break;
	case 2:Utility.temperatureConversionFahrenheitToCelcius();
	       break;

	default:System.out.println("Invalid Choice");
		break;
	}
	}

}
