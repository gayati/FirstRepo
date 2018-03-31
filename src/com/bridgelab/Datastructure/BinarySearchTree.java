/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of nodes:");
		int numberofnode = Utility.readInteger();
	 
	    
		int numberOfTree = Utility.catalan(numberofnode);
		System.out.println("The number of possible trees are " + numberOfTree);
		

	}

}
