package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class BankingCashCounter {
	
	static int balanceamout = 50000;
	
	public static void main(String[] args) 
	{ 
		
	  System.out.println("Enter the number of people to deposit or withdraw money:");
	  int noOfPeople = Utility.integerinput();
	  char input=0;
	  MyQueue queue = new MyQueue();
	  for(int i=1;i<=noOfPeople;i++)
	  {
	  queue.enque(i);
	  
	    
	  
//	  for(int j=1;j<=noOfPeople;j++)
//	  {
//		 int people = queue.deque(); 
	  
	  do {
			int depositamount=0;
			int withrawamount=0;
			
      System.out.println("Customer-" + " " +i);
      System.out.println("-------------------------MyBank------------------------------");
      System.out.println("1.Deposit Amount");
      System.out.println("2.Withdraw Amount");
      System.out.println("3.Check Balance");
      System.out.println("4.Exit");
      System.out.println("Enter your choice:");
      int option = Utility.integerinput();
      switch (option) {
	  case 1: System.out.println("Enter the amount you want to deposit");
	          depositamount = Utility.integerinput();
	          balanceamout=balanceamout+depositamount;
	          break;
      case 2: System.out.println("Enter the amount you want to withdraw");
              withrawamount = Utility.integerinput();
              balanceamout=balanceamout-withrawamount;
              break;
      case 3: System.out.println("Your balance amount is:" + balanceamout );
	          break;
      case 4: System.exit(0);
              break;        
	 default: System.out.println("Invalid Choice");
		      break;
	} 
      System.out.println("Do you want to continue?[Y/N]");
      input=Utility.charinput();
      
	  }
	    while((input!='n')&&(input!='N'));
	  }
	}
	
	
		
	
	//}

}
