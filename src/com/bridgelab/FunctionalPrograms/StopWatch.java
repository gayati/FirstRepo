/******************************************************************************
 
  
 *  Purpose: Program to implement stopwatch.
 *
 *  @author  BridgeLabz
 *  
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class StopWatch {

	public static void main(String[] args)
	{
              System.out.println(">> Press 1 to start the StopWatch:");
              int number = Utility.integerinput();
              Utility.start();
              
              System.out.println(">> Press 2 to stop the StopWatch:");
              int number1 = Utility.integerinput();
              Utility.stop();
              
              Utility.getElapsedtime();
	}
    
	
	
}
