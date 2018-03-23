package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class BankingCashCounter {
	
	
	
	public static void main(String[] args) 
	{ 
		
	  System.out.println("Enter the number of people to deposit or withdraw money:");
	  int noOfPeople = Utility.readInteger();
	  char input;
	  int i=0;
	  MyQueue queue = new MyQueue();
	  for( i=1;i<=noOfPeople;i++)
	  {
	  queue.enque(i);
	  
	  do {
			
			
      System.out.println("Customer-" + " " +i);
      System.out.println("-------------------------MyBank------------------------------");
      System.out.println("1.Deposit Amount");
      System.out.println("2.Withdraw Amount");
      System.out.println("3.Check Balance");
      System.out.println("Enter your choice:");
      int option = Utility.readInteger();
      switch (option) {
	  case 1: Utility.depositAmount();
	          break;
      case 2: Utility.withdrawAmount();
              break;
      case 3: Utility.checkBalance();
	          break;
	 default: System.out.println("Invalid Choice,Please choose proper options");
		      break;
	} 
      System.out.println("Do you want to continue?[Y/N]");
      input=Utility.readChar();
      if((input=='n') || (input=='N'))
      {
    	  queue.deque(); 
      }
	  }
	    while((input!='n')&&(input!='N'));
	  }
	}
	
	
		
	

}
