package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of nodes:");
		int numberofnode = Utility.integerinput();
		int possibleways = (2*numberofnode)/((numberofnode+1)*numberofnode);
		System.out.println("Number of possible binary tree are:" + possibleways);

	}

}