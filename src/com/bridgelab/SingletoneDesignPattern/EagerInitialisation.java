package com.bridgelab.SingletoneDesignPattern;


class Abc{
	
	public static Abc obj = new Abc();
	static int  x= 5;
	private Abc() {
		
		System.out.println("Instance Created");
	}
	
	public static Abc getInstance()
	{  
		obj = new Abc();
		
		return obj;
	}
	
}


public class EagerInitialisation {

	public static void main(String[] args) {
     Abc obj1 = Abc.getInstance();
     Abc obj2 = Abc.getInstance();
     Abc obj3 = Abc.getInstance();
	}
   
	
	
	
}
  

