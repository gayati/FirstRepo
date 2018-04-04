package com.bridgelab.SingletoneDesignPattern;

public class myenumsingletone {

	public static void main(String[] args) {
		Abcd obj1 = Abcd.INSTANCE;
		System.out.println(obj1);
		//obj1.i = 5;
		obj1.show();
//		
//		
//		
		Abcd obj2 = Abcd.INSTANCE;
		//obj2.i = 6;
		obj1.show();//I m calling obj1 here 
//		Abcd obj2 = Abcd.INSTANCE;
//		obj2.show();
//		
		System.out.println(obj2);
	}

}
  
enum Abcd
{   
	
	INSTANCE;
	int i ;
	private Abcd() {
		
	}
	void show()
	{
		System.out.println("The value of i is: " + i);
	}
	
}