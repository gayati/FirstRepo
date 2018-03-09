package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class WindChill {

	public static void main(String[] args) {
	    double temperature;
		double velocity;
		System.out.println("Enter the temperature value");
		temperature = Utility.doubleinput();
		System.out.println("Enter the velocity value");
		velocity = Utility.doubleinput();
        Utility.windchill(temperature, velocity);
	}

}
