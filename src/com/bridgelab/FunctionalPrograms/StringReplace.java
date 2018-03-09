package com.bridgelab.FunctionalPrograms;
import com.bridgelab.Utility.Utility;

public class StringReplace {

	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		String inputstring = null;
		System.out.println("Enter the username to be replaced");
		inputstring = utility.stringinput();
		utility.stringreplace(inputstring);
}

}
