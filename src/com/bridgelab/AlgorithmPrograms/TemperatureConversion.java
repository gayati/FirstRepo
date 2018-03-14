package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
	 System.out.println("Temperature Conversion");
	 System.out.println("1.Temperture conversion from Celsius to Fahrenheit");
	 System.out.println("2.Temperture conversion from  Fahrenheit to Celcius");

     int choice = 0;
     choice = Utility.integerinput();
     switch (choice) {
	case 1: 
		   Utility.temperatureConversionCelsiusToFahrenheit();
		   break;
	case 2:Utility.temperatureConversionFahrenheitToCelciue();
	       break;

	default:System.out.println("Invalid Choice");
		break;
	}
	}

}
