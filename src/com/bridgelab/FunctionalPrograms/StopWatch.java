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
              int number = Utility.readInteger();
              Utility.startTime();
              
              System.out.println(">> Press 2 to stop the StopWatch:");
              int number1 = Utility.readInteger();
              Utility.stop();
              
              Utility.getElapsedtime();
	}
    
	
	
}
