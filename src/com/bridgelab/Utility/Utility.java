package com.bridgelab.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.Datastructure.MyLinkedList;
import com.bridgelab.Datastructure.MyQueue;
import com.bridgelab.Datastructure.MyStack;

public class Utility {
	static Scanner SCANNER = new Scanner(System.in);	
	static PrintWriter WRITER = new PrintWriter(System.out);
	static double EPSILON = 1E-15;
	public static  int readInteger()
	{
		return SCANNER.nextInt();
	}
	public static String readString()
	{
		return SCANNER.next();
	}
	public static double readDouble()
	{
		return SCANNER.nextDouble();
		
	}
	public static long readLong()
	{
		return SCANNER.nextLong();
		
	}
	public static boolean readBoolean()
	{
		return SCANNER.nextBoolean();
		
	}
	public static char readChar()
	{
		return SCANNER.next().charAt(0);
		
	}
	
	
	  /** 
	    *
	    * @param replace the string by user input string
	    */
		public static void replaceString(String inputString) 
		{
			  String string = "Hello <<username>>, How are you ?";
		      int strLength = inputString.length();
		      if(strLength>=3)
		      {
		      	System.out.println(string.replace("<<username>>", inputString));
		   
		      }
		      else
		      {
		      	System.out.println("Please enter username having atleast 3 characters");
		      }
			
		}
      
	  /** 
		*
		* @param replace the string by user input string
		*/

		public static void findPercentage(int noOfTimes)
		{
			int head=0;
			int tail=0;
			
			for(int i=0; i<=noOfTimes; i++)
			{
				if(Math.random()<0.5)
				{
					head++;
				}	
				else
				{
				    tail++;
				}
			}

			double headpercent = head*100/noOfTimes;
			double tailpercent = 100-headpercent;
			
			System.out.println("The percentage of head is----------" + headpercent);
			System.out.println("The percentage of tail is----------" + tailpercent);	
		}
		
		/** 
		*
		* @param determine whether user entered year is leap year or not.
		*/

	     public static void isLeapyear(int year)
	     {
	     String year1 = String.valueOf(year);
		 int length = year1.length();
	    
		 if(length==4)
	       {
	    	  
	    	   Boolean isLeap = (((year % 4 == 0) && (year % 100 != 0)) ||
	    	            (year % 400 == 0));
	    	   if(isLeap)
	    	   {
	    		   System.out.println("Its Leap Year");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("It is not leap year");
	    	   }
	       }
	       else
	       {
	    	   System.out.println("Please enter proper input");
	       }
	    }
	     
 	    /** 
		*
		* @param  print the table for power of two.
		*/
	    public static void powerOfTwo(int number)
	    {
	    	int i;
	    	int num = 0;
			if(number>=0 && number<=31)
			{
			for( i=1;i<=number;i++)
			{
				num = (int) Math.pow(2, i);
				System.out.println(num);			
			}
			
			}
			else
			{
				System.out.println("Please enter number between 0 to 31");
			}
	    }
	 
	   
	    /** 
		*
		* @param print the n^th harmonic number for user input harmonic value n.
		*/
	    public static void printHarmonicSeries(int number)
	    {
	    	double sum = 0.0;
	   		for(int i=1;i<=number; i++)
	   		{
	   			sum = sum +(double) 1/i;	
	   		}
	   		System.out.println("The nth harmonic value is:" + sum);     
	    }
       

	    /** 
		*
		* @param compute the prime factors of the user input number.
		*/  
       public static void computePrimefactor(int number)
       {
    	while(number%2==0)
   		{
   			System.out.println(2);
   			number/= 2;
   		}
   		   int number1=number/2;
           for(int i=3; i<number1; i+=2)
           {
           	while(number%i==0)
           	{
           		System.out.println(i);
           		number = number/i;
           	}
           }
           if(number>2)
           {
           	System.out.println(number);
           }
       }
       
       
       /** 
		*
		* @param 
		*/   
	    public static void couponumbers(int numbers)
	    {
	    Integer[] array = new Integer[numbers];	
		for(int i=0;i<numbers; i++ )
		{
		 array[i]=Utility.generateRandomNumber();
		 for(int j=i+1;j<numbers; j++)
			{
			if(array[i]==(array[j]))
			{
			i--;
			}
			}
		 System.out.print(array[i] + " ");
		}
		
	    }
       
	    /** 
		*
		* @param this method randomly generate random numbers
		*/ 
       public static int generateRandomNumber()
       {
    	   Random random = new Random();
    	   random.nextInt(10000000);
    	   return random.nextInt(10000000);
       }
       
       /** 
		*
		* @param this method is for taking integer input for two dimentional array
		*/
       
       public static void inputIntegerArray(Integer array[][], int rows, int columns) 
       {
   		for (int i = 0; i < rows; i++) {
   			for (int j = 0; j < columns; j++) {
   				array[i][j] = Utility.readInteger();
   			}
   		}
   		Utility.printTwoDArray(array, rows, columns);
   	}
       /** 
		*
		* @param this method is for taking double input for two dimentional array
		*/
      
       public static void inputDoubleArray(Double array[][], int rows, int columns) 
       {
   		for (int i = 0; i < rows; i++) {
   			for (int j = 0; j < columns; j++) {
   				array[i][j] = Utility.readDouble();
   			}
   		}
   		Utility.printTwoDArray(array, rows, columns);
       }
       
       /** 
		*
		* @param this method is for taking boolean input for two dimentional array
		*/  
       public static void inputBooleanArray(Boolean array[][], int rows, int columns) 
       {
   		for (int i = 0; i < rows; i++) {
   			for (int j = 0; j < columns; j++) {
   				array[i][j] = Utility.readBoolean();
   			}
   		}
   		Utility.printTwoDArray(array, rows, columns);
   	  }
       
            /** 
     		*
     		* @param this method is for printing two dimentional array
     		*/
   	   public static <E> void printTwoDArray(E[][] array, int rows, int columns) {

 		WRITER.println("Array elements are:");
 		for (int i = 0; i < rows; i++) {
 			for (int j = 0; j < columns; j++) {
 				WRITER.print(array[i][j] + "  ");
 				WRITER.flush();
 			}
 			WRITER.println(" ");
 		}
 	}
        
       
//       public static void integerarray()
//       {
//    	    System.out.println("Enter the NUmber of rows for array:");
//    		int rows = Utility.readInteger();
//    		System.out.println("Enter the NUmber of columns for array:");
//    		int columns = Utility.readInteger();
//    	    int array[][] = new int[10][10];
//    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
//    	    for(int i=0;i<rows; i++)
//    	    {
//    		   for(int j=0;j<rows; j++) 
//    		   {
//    			   array[i][j] = Utility.readInteger();
//    		   }
//    	   }
//    	 System.out.println("The array is");
//    	 PrintWriter pw = new PrintWriter(System.out);
//    	   for(int i=0;i<rows; i++)
//    	   {
//    		   for(int j=0;j<rows; j++) 
//    		   {
//    			  pw.print(array[i][j] + " ");
//    			  pw.flush();
//    		   }
//    		   System.out.println();
//    	   }
//    	   
//       }
       
       /** 
		*
		* @param 
		*/
//       public static double[][] doubleArray()
//       {
//    	    System.out.println("Enter the NUmber of rows for array:");
//    		int rows = Utility.readInteger();
//    		System.out.println("Enter the NUmber of columns for array:");
//    		int columns = Utility.readInteger();
//    	    double array[][] = new double[10][10];
//    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
//    	    for(int i=0;i<rows; i++)
//    	    {
//    		   for(int j=0;j<rows; j++) 
//    		   {
//    			   array[i][j] = Utility.readDouble();
//    		   }
    		   
//    	   }
//    	 System.out.println("The array is");
//    	 PrintWriter pw = new PrintWriter(System.out);
//    	   for(int i=0;i<rows; i++)
//    	   {
//    		   for(int j=0;j<rows; j++) 
//    		   {
//    			  pw.print(array[i][j] + " ");
//    			  pw.flush();
//    		   }
//    		   System.out.println();
//    	   }
//    	    
//		return array;
//    	  
//       }
       
       /** 
		*
		* @param 
		*/
//       public static void booleanArray()
//       {
//    	    System.out.println("Enter the NUmber of rows for array:");
//    		int rows = Utility.readInteger();
//    		System.out.println("Enter the NUmber of columns for array:");
//    		int columns = Utility.readInteger();
//    	    boolean array[][] = new boolean[rows][columns];
//    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
//    	    for(int i=0;i<rows; i++)
//    	    {
//    		   for(int j=0;j<rows; j++) 
//    		   {
//    			   array[i][j] = Utility.readBoolean();
//    		   }
//    	   }
//    	 System.out.println("The array is");
//    	 PrintWriter pw = new PrintWriter(System.out);
//    	   for(int i=0;i<rows; i++)
//    	   {
//    		   for(int j=0;j<rows; j++) 
//    		   {
//    			  pw.print(array[i][j] + " ");
//    			  pw.flush();
//    		   }
//    		   System.out.println();
//    	   }
//    	   
//       }
       /** 
		*
		* @param
		*/
      /* public static <T> void printTwoDArray(T[][] array,int rows,int column)
       {
    	   PrintWriter pw = new PrintWriter(System.out);
    	   for(T[] element: array)
    	   {
    		   for(T value: element) 
    		   {
    			  pw.print(value + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
    	   
       }*/
       
       
      

       
   
       /** 
		*
		* @param determine the array triplet that sum to eaxctly zero.
		*/  
      public static void arraytriplet(int size)
      {
    	  int i,j,k;
    	  boolean found = false;
    	  int[] arr = new int[size];
    	  int length = arr.length;
    	  System.out.println("Enter the array element");
    	 
    	  for( i=0;i<size;i++)
    	  {
    		  arr[i] = Utility.readInteger();
    	  }
    	  for(i=0;i<(length-2);i++)
    	  {
    		  for(j=i+1;j<(length-1);j++)
    		  {
    			  for(k=j+1;k<length;k++)
    			  {
    				  if(arr[i]+arr[j] + arr[k] ==0)
    				  {
    					  System.out.println("Triplet is:");
    					  System.out.print(arr[i]);
    					  System.out.print(" ");
    					  System.out.print(arr[j]);
    					  System.out.print(" ");
    					  System.out.print(arr[k]);
    					  System.out.println();
    					  found = true;
    					  
    				  }
    				  
    			  }
    		  }
    	  }
    	 if(found==false)
    	 {
    		 System.out.println("Triplet not present");
    	 }
    	  
      }
      

        /** 
		*
		* @param 
		*/  
       public static void gambler(int stack,int goals,int no_of_times ) {
   		int wins = 0;
   		int loss =0;
   		double winpercent = 0.0;
   		double losspercent = 0.0;
   		
   	   	for(int i=0; i<no_of_times; i++)
   	    	{
   	   	    if(stack>0 && stack<=goals)
   	   	    {	
   	    	if(Math.random()>0.5)
   	    	{
   	    		wins++;
   	    		
   	    	}	
   	    	else 
   	    	{
   	    		loss++;
   	    	}
   	    	if(stack==goals)
   	    	{
   	    		wins++;
   	    	}
   	    	
   	    	}
   	    	}
   	    	System.out.println("The number of wins: " + wins);
   	    	System.out.println("The numebr of losses: " + loss);
   	    	winpercent = wins*100/no_of_times;
   	    	losspercent = 100-winpercent;
   	    	System.out.println("Wins Percentage:" + winpercent);
   	    	System.out.println("Loss Percentage:" + losspercent);
   	     
       }
       
       
       /** 
		*
		* @param calculate distance of point(x,y) from origin(0,0).
		*/ 
       
       public static void calculateDistance(Double x,Double y)
       {
    	   double result =  Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
    	   System.out.println("The result is:" + result);
    	   
       }
       
       
       /** 
		*
		* @param determine all possible permutation of user input string
		*/ 
       
       public static void stringpermutation(String string)
       {
    	   char arr[] = new char[0];
    	   
       }
       
       public static long startTime = 0;
       public static long stopTime = 0;
       
       /** 
		*
		* @param the method measure start time of StopWatch
		*/ 
      
       public static void startTime()
       {
    	   startTime = System.currentTimeMillis();
       }
       
       /** 
		*
		* @param the method to measure stop time of StopWatch
		*/ 
      
       public static void stop()
       {
    	   stopTime = System.currentTimeMillis();
       }
       
       /** 
		*
		* @param the method to calculate elapsed time
		*/ 
 
        public static void getElapsedtime()
        {
        	long elapsedTime = (stopTime - startTime)/1000;
        	System.out.println("The elapsed time is:" + elapsedTime +"sec");
        }
      
        /** 
 		*
 		* @param the method to implement tic-toc-toe game
 		*/ 
    	
		static  String[] board = new String[9];
		static String turn;
  
        public static void tictactoe()
		{
			String winner = null;
			turn = "X";
		  Utility.populateBoard();
		  
		  
		  System.out.println("Lets play tic toc toe game");
		  System.out.println("-----------------------------------");
		  Utility.printBoard();
		  System.out.println("X's will play first,Enter the slot number to play");
		
		  
		  while(winner==null)
		  {
			  int numberinput;
			  try
			  {
				  numberinput =Utility.readInteger();
			  if(!(numberinput > 0 && numberinput <= 9))
			  {
				  System.out.println("Invalid input; please enter correct slot number");
				  continue;
			  }
			  }
			  catch (InputMismatchException e)
			  {
				  System.out.println("Invalid input; please enter correct slot number");
				  continue;
			  }
			  if (board[numberinput-1].equals(String.valueOf(numberinput))) {
					board[numberinput-1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
					}
					printBoard();
					winner = checkWinner();
				} else {
					System.out.println("Slot already taken; re-enter slot number:");
					continue;
				}
		  }
			  if (winner.equalsIgnoreCase("draw")) 
			  {
					System.out.println("It's a draw! Thanks for playing.");
			  }
			  else 
				{
					System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
				}
		  		  
		}
        
        /** 
		*
		* @param this method checks the winning condition for Tic-Toc-Toe game.
		*/ 
		public static String checkWinner()
		{
		   
		   for(int i=0;i<8;i++)
		   { 
			   String line = null;
			   
			switch (i) 
			{
			case 0:
				   line = board[0] +board[1] +board[2];
			       break;
			case 1:
				   line = board[3] +board[4] +board[5];
			       break;
			case 2:
				   line = board[6] +board[7] +board[8];
			       break;
			case 3:
				   line = board[0] +board[3] +board[6];
			       break;
			case 4:
				   line = board[1] +board[4] +board[7];
			       break;
			case 5:
				   line = board[2] +board[5] +board[8];
			       break;
			case 6:
				   line = board[0] +board[4] +board[8];
			       break;
			case 7:
				   line = board[2] +board[4] +board[6];
			       break;
			} 
			
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}

		   }
		   for (int a = 0; a < 9; a++) {
				if (Arrays.asList(board).contains(String.valueOf(a+1))) {
					break;
				}
				else if (a == 8) return "draw";
			}

			System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
			return null;
		}   	   
		   
		/** 
		*
		* @param this method populates the board for Tic-Toc-Toe game.
		*/  
		public static void populateBoard()
		{
		   for( int i=0; i<9; i++)
		   {
			board[i] = String.valueOf(i+1);  
		   }
		}
		
		/** 
		*
		* @param this method prints the board for Tic-Toc-Toe game.
		*/ 
		
		public static void printBoard()
		{
		   System.out.println("/---|---|---\\");
		   System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		   System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
		   System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
		   System.out.println("/---|---|---\\");    	   
		}  
    	   
		
		/** 
 		*
 		* @param this method gives wind-chill factor.
 		*/ 
       public static void windchill(double temperature,double velocity)
       {
    	   double windchill = 0.0;
    	   if(temperature<=50 && velocity<=120 && velocity>=3)
    	   {
    		   windchill = 35.75 + (0.6215*temperature)+(((0.427*temperature)-35.75)*Math.pow(velocity, 0.16));
        	   System.out.println("The windchill is as follows:" + windchill);

    	   }
    	   else
    	   {
    		   System.out.println("Please enter valid input");
    	   }
       }
       
       /** 
		*
		* @param this method calculates the roots of equation for user input value a,b,c.
		*/ 
       
       public static void findRootsOfEquation(double a, double b, double c)
       {
    	   double root1=0.0;
    	   double root2=0.0; 
    	   double delta = ((b*b) - (4*a*c));
    	   if(delta>0)
    	   {
    	   root1 = ((-b) +(Math.sqrt(delta)))/(2*a);
    	   root2 = ((-b) -(Math.sqrt(delta)))/(2*a);
    	   }
    	   System.out.println("Root values are:" + root1 +"and" + root2);
    	   
       }
       
       /** 
		*
		* @param determine the possible of permutation
		*/ 
       
       public static void permutationsOfString(String inputstring,int first, int last)
       {
    	   if(first == last)
    	   {
    		   System.out.println(inputstring);
    	   }
    	   else
    	   {
    		   for(int i = first; i<=last; i++)
    		   {
    		   inputstring = Utility.swap(inputstring,first,i);
    		   Utility.permutationsOfString(inputstring, first +1, last);//control check
    		   inputstring = Utility.swap(inputstring,first,i);	   
    		   }
    	   }
    	   
       }
       
       /** 
		*
		* @param this method swap each character of string and returns string
		*/ 
       
       public static String swap(String inputstring,int first,int i)
       {
    	   char temp;
    	   char arr[] = inputstring.toCharArray();
    	   temp = arr[first];
    	   arr[first] = arr[i];
    	   arr[i] = temp;
		   return String.valueOf(arr);
    	   
       }
       
       
       
      //Functional
       
       /** 
		*
		* @param determines whether the user input strings are anagram or not.
		*/ 
       
       public static boolean isAnagram(String inputstring1, String inputstring2)
       {
    	   int length1 = inputstring1.length();
    	   int length2 = inputstring2.length();
    	   if(length1 != length2)
    	   {
    		  return false;
    	   }
    	   else
    	   {
    	   String s1 = inputstring1.replaceAll("//s","");
    	   String s2 = inputstring2.replaceAll("//s","");
    	   
    	   char Array1[] = s1.toLowerCase().toCharArray();
    	   char Array2[] = s2.toLowerCase().toCharArray();
    	   
    	   Arrays.sort(Array1);
    	   Arrays.sort(Array2);
    	   
    	    boolean flag=Arrays.equals(Array1, Array2);
    	   return flag;
    	   
    	   }	   
       }
       
       
       /** 
		*
		* @param finds all prime numbers in the range of 0-1000.
		*/ 
      
       
        public static ArrayList<String> findPrimeNumbers()
        { 
        	int i;
            int j;
         
            ArrayList<String> list = new ArrayList<String>();
                    for(i=1;i<=1000; i++)
           {
        	 for(j=2;j<=i;j++)
        	 {
        		 if(i%j==0)
        		 {
        			 break;
        			 
        		 }
        	 }
        	 if(i==j)
        	 {
               list.add(Integer.toString(i));
        	 }
        	 
         }
       	return list;
        }
        
        /** 
      		*
      		* @param finds all prime numbers that are anagram in the range of 0-1000.
      		*/ 
       
        public static void findPrimeAnagram(ArrayList<Integer> list)
        {
          int size =list.size() ;
          Integer[] liststring = new Integer[size];
          liststring = list.toArray(liststring);
        
          System.out.println();
          System.out.println();
          System.out.println("The prime anagram are as follows:");
          for(int i=0;i<size ; i++)
          {
       	   for(int j=i+1;j<size; j++)
       	   {
       		   if(isAnagram(String.valueOf(liststring[i]),String.valueOf(liststring[j])))
       			   System.out.println(String.valueOf(liststring[i])+"-->"+String.valueOf(liststring[j]));
       	   }
          
        }
        }
        
        
        /** 
		*
		* @param finds all prime numbers that are palindrome in the range of 0-1000.
		*/ 
      
        public static void findPrimePalindrome(ArrayList<Integer> list)
        {
        	 int size =list.size() ;
             Integer[] liststring = new Integer[size];
             liststring = list.toArray(liststring);
           
           System.out.println("The prime numbers which are palindrome are as follows:");
           for(int i=0;i<size ; i++)
           {
        	   if(isPalindrome(String.valueOf(liststring[i])))
        	   {
        		   System.out.println(String.valueOf(liststring[i]));
        	   }
           }
	
        }
//        for(String s:al)
//        {
//        System.out.println(s);	
//        }
//        
//           int n =al.size() ;
//           String[] liststring = new String[n];
//           liststring = al.toArray(liststring);
//         
//           System.out.println();
//           System.out.println();
//           System.out.println("The primeanagram are as follows:");
//           for(i=0;i<n ; i++)
//           {
//        	   for(j=i+1;j<n; j++)
//        	   {
//        		   if(isAnagram(liststring[i],liststring[j]))
//        			   System.out.println(liststring[i]+"-->"+liststring[j]);
//        	   }
//           }
//           
//           System.out.println();
//           System.out.println();
//           System.out.println("The prime numbers which are palindrome are as follows:");
//           for(i=0;i<n ; i++)
//           {
//        	   if(isPalindrome(liststring[i]))
//        	   {
//        		   System.out.println(liststring[i]);
//        	   }
//           }
//	
//           
//           
//        }
//        
       
        /** 
		*
		* @param this method determine whether string is palindrome or not.
		*/ 
        public static boolean isPalindrome(String string)
        {
        	String reverse = "";
        	
        	int length = string.length();
        
            for ( int i = length - 1; i >= 0; i--)
            {
               reverse = reverse + string.charAt(i);
              
            }
            boolean flag = string.equals(reverse);
            if(flag==true)
            {
            return flag;
            }
			return false;
            
        }
        
        /** 
		*
		* @param this method take integer input for one dimentional array.
		*/ 
        
     
        public static Integer[] integerarrayInput()
        {   
        	
        	System.out.println("Enter the length of array :");
        	int length = Utility.readInteger();
        	Integer[] array = new Integer[length];
        	System.out.println("Enter the elemnts in the array:");
        	
        	for(int i=0;i<=length-1;i++)
        	{
        		array[i] = Utility.readInteger();
        	}
        	System.out.println();
			return array;
        }
        
        /** 
		*
		* @param this method take string input for one dimentional array.
		*/ 
        
        
        public static String[] inputStringArray()
        {   
        	System.out.println("Enter the length of array :");
        	int length = Utility.readInteger();
        	String[] array = new String[length];
        	System.out.println("Enter the elements in the array:");
        	
        	for(int i=0;i<=length-1;i++)
        	{
        		array[i] = Utility.readString();
        	}
			return array;
        }
        
        /** 
		*
		* @param 
		*/ 
        
		public static <T extends Comparable<T>>  int binarySearch(T[] items, T key, int first, int last) {
			
			while(first<=last)
			{
			int mid = (first+last)/2;
			if(key.compareTo(items[mid]) > 0)
			{
				return binarySearch(items,key,mid+1,last);
			}
			if(key.compareTo(items[mid]) < 0)
			{
				return binarySearch(items,key,first,mid-1);
			}
			
			else
			
			return mid;
			}
		
			return -1;	
		}
		
		
		
        /** 
		*
		* @param this method sort the element by using bubble sort algorithm
		*/ 
        
		
		public static <T extends Comparable<T>> void bubbleSort(T[] array)
		{
			int i,j;
			T temp = null;
			int arraylength = array.length;
			for(i=0;i<arraylength;i++)
			{
				for(j=1;j<(arraylength-i);j++)
				{
					if(array[j-1].compareTo(array[j]) > 0)	
					{
						temp	 = array[j-1];
						array[j-1] = array[j];
						array[j] =  temp ;
					}
				}
			}
			
			 Utility.printArray(array);
			 System.out.println();
			
		}
		
		 /** 
		*
		* @param this method sort the element by using insertion sort algorithm
		*/ 
		
		public static <T extends Comparable<T>> void insertionSort (T[] array, int length) 
		  {
		    int i, j;
		    T temp;
		    for (i= 1; i< length; i++)
		    {
		      temp = array[i];
		      j = i-1;
		      while(j>=0 && array[j].compareTo(temp)>0)
		      {
		    	  array[j+1] = array[j];
		    	  j=j-1;
		      }
		      array[j+1] = temp;
		    }
		    Utility.printArray(array);
		    System.out.println();
		   
		  }
		
		  
        /** 
		*
		* @param this is generic method for printing one dimentional array
		*/ 
        
		public static <T> void printArray(T[] array)
		{
			for(T t: array)
			{
				System.out.print(t + " ");
			}	
		}
		
		/** 
		*
		* @param this method returns secrete number in users mind
		*/ 
		public static int findSecreteNumber(int low, int high)
		{
			if((high-low) == 0)
			
				return high;
			
			int mid = (high + low)/2;
			System.out.println("Is your number between" + " "+low + " "+"to" +" "+ mid +"?(true/false)");
		    boolean	yes = Utility.readBoolean();
			if(yes)
			{
				return findSecreteNumber(low, mid);

			}
			
	        else
			{
				return findSecreteNumber(mid+1 , high);
			}	
		}
		
		/** 
		*
		* @param 
		*/ 
		public static String[] readFile(String filePath)
		{
			String words[] = {};
			ArrayList<String> lines = new ArrayList<String>();
			String line, temp[] = {};
			BufferedReader bufferedReader;
			FileReader file;
			try 
			{
				file = new FileReader(filePath);
				bufferedReader = new BufferedReader(file);
				while ((line = bufferedReader.readLine()) != null) 
				{
					temp = line.split(" ");
					for (int i = 0; i < temp.length; i++)
					{
						lines.add(temp[i]);

					}
				}
				words = lines.toArray(new String[lines.size()]);
				bufferedReader.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return words;
		}
		
		
		/** 
		*
		* @param this method is to find the fewest number of notes to be returned by Vending Machine
		*/ 
		static int notecount=0 ;
		public static void vendingmachine(int amount)
		{
		int note = 0;
		int notecount = 0;	
			if(amount >= 1000)
			{
				note = amount/1000;
				notecount=notecount+note;
				amount = amount%1000; 
		     	System.out.println("The notes of Rs.1000 are:"+note);
			}
			if(amount >= 500)
			{
				note= amount/500;
				notecount=notecount+note;
				amount = amount%500;
				System.out.println("The notes of Rs.500 are:"+note);
			}
			if(amount >= 100)
			{  
				note = amount/100;
				notecount=notecount+note;
				amount = amount%100;
				System.out.println("The notes of Rs.100 are:"+note);
			}
			if(amount >= 50)
			{
				note = amount/50;
				notecount=notecount+note;
				amount = amount%50;
				System.out.println("The notes of Rs.50 are:"+note);
			}
			if(amount >= 10)
			{
				note = amount/10;
				notecount=notecount+note;
				amount = amount%10;
				System.out.println("The notes of Rs.10 are:"+note);
			}
			if(amount >= 5)
			{
				note = amount/5;
				notecount=notecount+note;
				amount = amount%5;
				System.out.println("The notes of Rs.5 are:"+note);
			}
			if(amount >= 2)
			{
				note = amount/2;
				notecount=notecount+note;
				amount = amount%2;
				System.out.println("The notes of Rs.2 are:"+note);		
			}
			if(amount >= 1)
			{
				note = amount/1;
				notecount=notecount+note;
				amount = amount%1;
				System.out.println("The notes of Rs.1 are:"+note);
			}
			System.out.println("Minimum number of notes required:" + notecount);	
		}
		
		
		/** 
		*
		* @param 
		*/ 
		public static int dayOfweek(int day,int month,int year)
		{
	
			int y = year - (14 - month) / 12;
			int x = y + y/4 - y/100 + y /400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d= (day + x + 31*m/ 12) %7;
			return d;
			
		}
		
		/** 
		*
		* @param this method convert temperature from celcius to fahrenheit
		*/ 
	
		public static void temperatureConversionCelciusToFahrenheit() 
		{
			System.out.print("Enter the temperature in Celsius:");
		    double celciusTemp = Utility.readDouble();
			double fahrenheitTemp = (celciusTemp * 9/5) + 32;
			System.out.print("The temperaure value in Fahrenheit will be:" + fahrenheitTemp + "F");
		}
		

		/** 
		*
		* @param this method convert temperature from fahrenheit to celcius
		*/ 
		public static void temperatureConversionFahrenheitToCelcius()
		{
			System.out.print("Enter the temperature in Fahrenheit:");
		    double fahrenheitT = Utility.readDouble();
			double celciusTemp = (fahrenheitT - 32) * 5/9;
			System.out.print("The temperaure value in Celsius will be:" +celciusTemp + "C");
		}
		
		

		/** 
		*
		* @param this method calculate monthly payment by taking principal,rate of interest,
		*         and year from user.
		*/ 
		public static void monthlypayment(double principal,double rateofinterset,double year )
		{
			 double n = 12*year;
			 double r = rateofinterset/(12*100);
			 double payment = (principal*r)/(1-(Math.pow((1+r), -n)));
			 System.out.println("The monthly payment will be:" + payment);
			 
		}
		

		/** 
		*
		* @param this method converts decimal number into binary.
		*/ 
		
		public static void toBinary(int decimal)
		{ 
			
			System.out.println("Enter the number of bits:");
			int numberofbits = Utility.readInteger();
			
			
			int[] binary = new int[numberofbits];
			int index = 0;
			while(numberofbits>0)
			{
				binary[index++] = decimal%2;
				decimal= decimal/2;
				numberofbits--;
				
			}
			for(int i=index-1;i>=0;i--)
			{
			    System.out.print(binary[i]);
			}
		}
		

		/** 
		*
		* @param 
		*/ 
		
		public static void findSquareroot(double number)
		{
		    double number1 = number;
			
			while(Math.abs(number1-number/number1) > EPSILON*number1)
			{
				number1 = (number/number1+ number1)/2.0;

			}
			System.out.println(number1);

		}
		

		/** 
		*
		* @param This method swap the two nibbles and convert the obtained octet afterswapping 
 *                into decimal number.
		*/ 
        public static void swapnibbles(int decimal)
        {
        	System.out.println("Enter the number of bits:");
        	int numberofbeats = Utility.readInteger();
        	int binary[]  = new int[numberofbeats];
        	int index = 0;
        	while(numberofbeats>0)
        	{
        		binary[index++] = decimal%2;
        		decimal = decimal/2;
        		numberofbeats--;
        	}
        	System.out.println();

        	String string ="";
        	for(int i=index-1;i>=0;i--)
        	{
               string += binary[i];
        	}
        	System.out.println(string);
        	int length = string.length();
        	String string1 = string.substring(0, length/2);
        	String string2 = string.substring(length/2, length);
        	String string3 = string2 + string1;
        	System.out.println(string3);
        	int decimalnumber = Integer.parseInt(string3,2);
        	System.out.println(decimalnumber);
        }
		
	
        
//        public static void merge(String stringarray[],int first,int mid,int last)
//        {   
//        	
//        	int i=0,j = 0,k=last;
//        	int length1= mid-first+1;
//        	int length2 = last-mid;
//        	int comp;
//        	String leftarray[] = new String[length1];//left array
//        	//System.out.println(leftarray.length);
//        	
//        	for( i=0;i<length1;i++)
//        	{
//        		leftarray[i]= stringarray[first+i];
//        	}
//        	String rightarray[] = new String[length2];//right array
//        	for( j=0;j<length2;j++)
//        	{
//        		rightarray[j]= stringarray[mid+1+j];
//        	}
//        	
//        	while(i<length1 && j<length2)
//        	{ 
//        		comp=leftarray[i].compareToIgnoreCase(rightarray[j]);
//        		if(comp>0)
//        		{
//        			stringarray[k] = leftarray[i];
//        					i++;
//        		}
//        		else
//        		{
//        			stringarray[k] = rightarray[j];
//					j++;
//        		}
//        		
//        		k++;
//        	}
//        	 
//        	while(i<length1)//this check if element are remaining in the left array
//        	{
//        		comp=leftarray[i].compareToIgnoreCase(leftarray[i+1]);
//        		if(comp>0)
//        		{
//    			stringarray[k] = leftarray[i];
//    					i++;
//    					k++;
//        		}
//        		
//    		
//        	}
//        	
//        	while(j<length2)
//        	{
//        		comp=rightarray[j].compareToIgnoreCase(rightarray[j+1]);
//        		if(comp>0)
//        		{
//   
//    			stringarray[k] = rightarray[j];
//    					j++;
//    					k++;
//        		}
//        	}	
//        }
//        
//       public static void mergeSort(String arr[], int first, int last)
//        {
//    	    int mid = (first+last)/2;
//            if (first < last)
//            {       
//                mergeSort(arr, first, mid);
//                mergeSort(arr, mid+1, last);
//         
//                Utility.merge(arr,first,mid,last);
//            }
//			for(String s: arr)
//			{
//				System.out.println(s);
//			}
//        }
//       
        public static String[] mergeArray(String[] left, String[] right) {
	        String[] merged = new String[left.length+right.length];
	        int lIndex = 0;
	        int rIndex = 0;
	        int mIndex = 0;
	        int comp = 0;
	        while (lIndex < left.length || rIndex < right.length) {
	            if (lIndex == left.length) {
	                merged[mIndex++] = right[rIndex++];
	            } else if (rIndex == right.length) {
	                merged[mIndex++] = left[lIndex++];
	            } else {  
	                comp = left[lIndex].compareTo(right[rIndex]);
	                if (comp > 0) {
	                    merged[mIndex++] = right[rIndex++];
	                } else if (comp < 0) {
	                    merged[mIndex++] = left[lIndex++];
	                } else { 
	                    merged[mIndex++] = left[lIndex++];
	                }
	            }   
	        }
	        return merged;
	    }

	 
	 
	  public static String[] mergeSort(String[] list) {
	        String [] sorted = new String[list.length];
	        if (list.length == 1) {
	            sorted = list;
	        } else {
	            int mid = list.length/2;
	            String[] left = null; 
	            String[] right = null;
	            if ((list.length % 2) == 0) {
	                left = new String[list.length/2];
	                right = new String[list.length/2];
	            } else { 
	                left = new String[list.length/2];
	                right = new String[(list.length/2)+1];
	            }
	            int x=0;
	            int y=0;
	            for ( ; x < mid; x++) {
	                left[x] = list[x];
	            }
	            for ( ; x < list.length; x++) {
	                right[y++] = list[x];
	            }
	            left = mergeSort(left);
	            right = mergeSort(right);
	            sorted = mergeArray(left,right);
	        }

	        return sorted;
	    }
	 
		
      
		//Algorithm

		/** 
		*
		* @param 
		 * @throws FileNotFoundException 
		*/ 
	

		 public static <T> void writeFile(String filepath,MyLinkedList<T> list) 
		 {
			 try
			 {  
//			 System.out.println(list);
//			    File file = new File(filepath);
//				 PrintWriter pw = new PrintWriter(file);
//				 for(T i: list)
//				 {
//				 pw.print(i);
//				 }
//				 pw.flush();
//				 
			 FileWriter file = new FileWriter(filepath);
			 BufferedWriter writer = new BufferedWriter(file);
			 String data = list.toString();
			 System.out.println(data);
			
		       writer.write(data);
		       writer.flush();
		     
			 writer.close();
			 System.out.println("Data Saved");
			 }
			 catch (Exception e) {
				// TODO: handle exception
			}
			 
		 }
		 

			/** 
			*
			* @param 
			*/ 
		 
		 
		public static boolean isMatchingPair(char character1, char character2)
		    {
		       if (character1 == '(' && character2 == ')')
		         return true;
		      
		       else
		         return false;
		    }
    	   

		/** 
		*
		* @param 
		*/ 
    	 public static boolean isParanthesesBalance(String expression)
    	 {
    		 MyStack stack = new MyStack();
    		 char ch;
    		 for(int i=0;i<expression.length();i++)
    		 {
    			 ch= expression.charAt(i);
    			 
    			 if(ch=='(' )
    			 {
    				 stack.push(ch);
    			 }
    			 if ( ch == ')')
    	          {
    	              /* If we see an ending parenthesis without 
    	                 a pair then return false*/
    	             if (stack.isEmpty())
    	               {
    	                   return false;
    	               } 
    	      
    	            
    	             else if ( !isMatchingPair(stack.pop(), ch) )
    	               {
    	                   return false;
    	               }    		 
    	 }
   } 
    		 if (stack.isEmpty())
       return true; 
       else
       {   
           return false;
       } 
		 
		 
    	 }
    	 

 		/** 
 		*
 		* @param 
 		*/ 
		public static void insertCharacter(String inputstring, ArrayDeque<Character> array) 
		{
			for(int i=0; i<inputstring.length(); i++)
			{
				array.addLast(inputstring.charAt(i));
			}
			
			
		}
		

		/** 
		*
		* @param 
		*/ 
    	 
		public static String popCharacter(ArrayDeque<Character> array,String reverse)
		{
			while(!array.isEmpty())
			{
				reverse = reverse +  array.removeLast();
			}
			return reverse;
			
			
		}
		

		/** 
		*
		* @param 
		*/ 
		 public static boolean isLeapYear(int year) {
		        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		        if  (year % 400 == 0) return true;
		        return false;
		    }
		 

			/** 
			*
			* @param 
			*/ 
		 public static void printCalender(int month,int year)
		 {
			 String[] months =  {
                        ""   ,                    
                     "January", "February", "March",
                     "April", "May", "June",
                     "July", "August", "September",
                     "October", "November", "December"
                  };

            int[] days = {0,  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
               // MyQueue quue = new MyQueue();
            if (month == 2 && isLeapYear(year)) days[month] = 29;
           
           System.out.println("   " + months[month] + " " + year);
           System.out.println("S M T W Th F S");
           int d = dayOfweek(1, month, year);
            for(int i=0; i<d; i++)
			{
				System.out.print("   ");
				//quue.enque("   ");
			}
			for (int i = 1; i <=days[month]; i++) 
			{
			    System.out.printf("%2d ",i);
			   // quue.enque(i);
			    
			    if (((i + d) % 7 == 0) || (i == days[month])) 
			    {
			    	System.out.println();
			    	
			    }
			    	
			}
			//quue.print();
			}
		 

			/** 
			*
			* @param 
			*/ 
		 
		  public static void print(int month, int year)
		    {
		     int totalNoOfDays = 0;
		     String[] months =  {
		                      "",                              
		                      "January", "February", "March",
		                      "April", "May", "June",
		                      "July", "August", "September",
		                      "October", "November", "December"
		                   };
		     int[] days = {0,  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};     
		     String dayOfWeek[] = {"S",  "M" , "T",  "W" , "Th" , "F",  "S"  };
//		    MyQueue date = new MyQueue();
//		    date.enque(31); 
//		    date.enque(28); 
//		    date.enque(31); 
//		    date.enque(30); 
//		    date.enque(31); 
//		    date.enque(30); 
//		    date.enque(31); 
//		    date.enque(31); 
//		    date.enque(30); 
//		    date.enque(31); 
//		    date.enque(30); 
//		    date.enque(31); 
//	    
//             for(int j=0; j<month;j++)
//             {
//              totalNoOfDays =date.deque();
//             }
//    
//          
             if (month == 2 && isLeapYear(year)) 
             {
            	 days[month] = 29;
                 
             }
             
     
            
             MyQueue queue = new MyQueue();
             
              System.out.println("   " + months[month] + " " + year);
              System.out.println("S  M  T  W  Th  F  S  ");
              int d = dayOfweek(1, month, year);
             for(int i=0; i<d; i++)
		    {
		     //System.out.print("   ");
		     queue.enque("  ");
		    }
             
		    for (int i = 1; i <=days[month]; i++) 
		    {
		       // System.out.printf("%2d ",i);
		        queue.enque(i);
		       
		        if (((i + d) % 7 == 0) || (i == days[month])) 
		        {
		         queue.print();
		         System.out.println();
		         queue = new MyQueue();
		         
		        }
		         
		    }
//		    for(int i=0;i<5;i++)
//			  {
//				 queue.print(); 
//			  }

		    
		    } 
		  
		
			/** 
			*
			* @param 
			*/ 
		  
		  public static void printstack(int month, int year)
		    {
			 MyStack stack1,stack2;
		     int totalNoOfDays = 0;
		     String[] months =  {
		                      "",                              
		                      "January", "February", "March",
		                      "April", "May", "June",
		                      "July", "August", "September",
		                      "October", "November", "December"
		                   };
		         
		     stack1 = new MyStack();
		     stack1.push(31);
		     stack1.push(28);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		   
	    
           for(int j=0; j<month;j++)
           {
            totalNoOfDays =stack1.pop();
           }
  
        
           if (month == 2 && isLeapYear(year)) 
           {
           totalNoOfDays = 29;
           }
           
            System.out.println("   " + months[month] + " " + year);
            System.out.println("S  M  T  W  Th  F  S  ");
            int d = dayOfweek(1, month, year);
           for(int i=0; i<d; i++)
		    {
		     System.out.print("   ");
		    }
		    for (int i = 1; i <= totalNoOfDays; i++) 
		    {
		        System.out.printf("%2d ",i);
		        if (((i + d) % 7 == 0) || (i == totalNoOfDays)) 
		        {
		         System.out.println();
		        }
		         
		    }	 
		    } 
		  

		  
		  
			/** 
			*
			* @param this method returns the list of prime numbers.
			*/ 
		  
		  public static ArrayList<Integer> findPrimes()
		  {
			    int i;
	            int j;
	            
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            
	           for(i=1;i<1000; i++)
	           {
	        	 for(j=2;j<i;j++)
	        	 {
	        		 if(i%j==0)
	        		 {
	        			 
	        			 break;
	        			 
	        		 }	 
	        	 }
	        	 if(i==j)
	        	 {
	               list.add(i);
	        	 }
	           }
			return list;
		  }
		  
		  


			/** 
			*
			* @param 
			*/ 
		
		  
		 public static void print2Darray(ArrayList<Integer> list)
         {   
			 int[][] prime = new int[10][50]; 
			 Iterator< Integer> it = list.iterator();
			 int block = 100;
			 int i=0;
			 int j =0;
			      while(it.hasNext())
			       {	 
						 if(prime[i][j++]<block)
						 {
							 prime[i][j]= it.next();

							 System.out.print(prime[i][j] + " ");
						 }	
						 else
						 {
							 i++;
							 j=0;
							 block=block+100;
							 System.out.println();
						 }
						
					 }
			     
					 
				 }
					 
			 
			

		 
			/** 
			*
			* @param 
			*/ 
		
		  
		 public static void printAnagram2Darray(ArrayList<Integer> list)
      {   
			 int n =list.size() ;
	         Integer[] liststring = new Integer[n];
	         liststring = list.toArray(liststring);
			 int[][] prime = new int[10][50]; 
			 Iterator< Integer> it = list.iterator();
			 int block = 100;
			 int i=0;
			 int j =1;
			      while(it.hasNext())
			       {	 
			    	  for( i=0;i<n ; i++)
			          {
			       	   for(j=i+1;j<n; j++)
			       	   {
			       		   if(isAnagram(String.valueOf(liststring[i]),String.valueOf(liststring[j])))
			       		   {

			       		   }
			       	   }
			       	   
			          
			        }
						
					 }
			
				 }
					 
			 
			

			/** 
			*
			* @param 
			*/  
	
		  
		 public static void anagramqueue(ArrayList<Integer> list)
	        {
	          int n =list.size() ;
	          Integer[] liststring = new Integer[n];
	          liststring = list.toArray(liststring);
	          MyQueue queue = new MyQueue();
	          System.out.println();
	          System.out.println();
	          System.out.println("The primeanagram are as follows:");
	          
	          for(int i=0;i<n ; i++)
	          {
	       	   for(int j=i+1;j<n; j++)
	       	   {
	       		   if(isAnagram(String.valueOf(liststring[i]),String.valueOf(liststring[j])))
	       		   {
	       			   queue.enque(String.valueOf(liststring[i]));
	       			    queue.enque(String.valueOf(liststring[j]));
	       		   }
	       	   }
	       	   
	          
	        }
	          queue.print();
	          
	        }
	 
	 

			/** 
			*
			* @param 
			*/  
	
		 
		 public static void anagramstack(ArrayList<Integer> list)
	        {
	          int size =list.size() ;
	          Integer[] liststring = new Integer[size];
	          liststring = list.toArray(liststring);
	          MyStack stack = new MyStack();
	          System.out.println();
	          System.out.println();
	          System.out.println("The primeanagram are as follows:");
	          for(int i=0;i<size ; i++)
	          {
	       	   for(int j=i+1;j<size; j++)
	       	   {
	       		   if(isAnagram(String.valueOf(liststring[i]),String.valueOf(liststring[j])))
	       		   {
	       			   stack.push(String.valueOf(liststring[i]));
	       			   stack.push(String.valueOf(liststring[j]));
	       		   }
	       	   }
	       	   
	          
	        }
	          stack.show();
	          
	        }
		 
		 
		 

		 static int balanceAmount = 50000;
		 static int depositAmount=0;
		 static int withdrawAmount=0;
		 
		 
		 
		 public static void withdrawAmount()
		 {
			 System.out.println("Enter the amount you want to withdraw");
             withdrawAmount = Utility.readInteger();
             if(balanceAmount>=withdrawAmount)
             {
             balanceAmount=balanceAmount-withdrawAmount;
             System.out.println("Amount is successfully withdraw.....!!!");
             }
             else
             {
            	 System.out.println("Insufficient Balance");
//           	  MyQueue waitingqueue = new MyQueue();
//           	  waitingqueue.enque(i);
//           	  waitingqueue.print();
             }
		 }
		 
		 
		 public static void depositAmount()
		 {
			  System.out.println("Enter the amount you want to deposit");
	          depositAmount = Utility.readInteger();
	          balanceAmount=balanceAmount+depositAmount;
	          System.out.println("Amount is successfully deposited.....!!!");
		 }
		
		public static void checkBalance()
		{
			System.out.println("Your balance amount is:" + balanceAmount );
		}
		
		//datastructure
		
		static JSONArray jsarray = new JSONArray();
		@SuppressWarnings("unchecked")
		public static void Stockaccount() throws IOException, ParseException
		{     
			JSONObject jsobj=new JSONObject();
			
	        System.out.println("Enter the name of account holder: ");
	        String nameOfcustomer = Utility.readString();
	        jsobj.put("name", nameOfcustomer);
	        System.out.println("Enter the amount to be deposited: ");
	        Long depositamount = Utility.readLong();
	        jsobj.put("amount", depositamount);
	        System.out.println("Enter the number of shares: ");
	        Long numberOfShares = Utility.readLong();
	        jsobj.put("number", numberOfShares);
			System.out.println();
			
		
			FileReader file = new FileReader("Account.json");
			BufferedReader reader = new BufferedReader(file);
			if(reader.readLine() == null)
			{
			jsarray.add(jsobj);
			FileWriter writer = new FileWriter("Account.json",true);
			
      	    jsobj.put("Account", jsarray);
			writer.write(jsobj.toJSONString());
			writer.flush();
			}
			else
			{

				FileReader file1 = new FileReader("Account.json");
				BufferedReader reader1 = new BufferedReader(file1);
				JSONParser parser = new JSONParser();
				JSONObject jsobj1 = (JSONObject) parser.parse(reader1);
				JSONArray jsarray1 = (JSONArray) jsobj1.get("Account");
				jsarray1.add(jsobj);
		        JSONObject mainjsobj = new JSONObject();
				 mainjsobj.put("Account", jsarray1);
				 FileWriter writer = new FileWriter("Account.json");
				 writer.write(mainjsobj.toJSONString());
				 writer.flush();
				
			}
			
		
			
	        
		}
		
		static String accountHolderName; 
		static Long sharenumbers;
		static long sharenumber=0;
		@SuppressWarnings("unchecked")
		
		public  static void buy() throws IOException, ParseException
		{
			System.out.println("Enter the name of account holder who want to buy the share:");
			accountHolderName= Utility.readString();
			System.out.println("Enter the symbol of share you want to buy: ");
			String symbol = Utility.readString();
			System.out.println("Enter the number of shares you want to buy: ");
			 sharenumbers= Utility.readLong();
			
			FileReader file = new FileReader("ShareLibrary.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			JSONObject jsobj1 = (JSONObject) parser.parse(reader);
			JSONArray jsarray = (JSONArray) jsobj1.get("Shares");
			String sharename = null;
			JSONObject obj =null;
			long shareprice = 0;
			
		
			 for(int i=0; i<jsarray.size();i++)
				{  
		            obj = (JSONObject) jsarray.get(i);
					sharename = (String) obj.get("sharename");
					
					if(symbol.equals(sharename))
					{
					System.out.println(sharename);
					shareprice = (long) obj.get("price");
					sharenumber = (long)obj.get("sharenumber");
					System.out.println("The price for share is: "+ shareprice);
					System.out.println("The total price for share is: " + sharenumbers*shareprice);
					
					sharenumber = sharenumber-sharenumbers;
					obj.put("sharenumber", sharenumber);
					
					  /*obj.remove(sharename);
					  obj.remove(sharenumber);
					  obj.remove(shareprice);
					  */
					    //sharename = (String) obj.get("sharename");
						//shareprice = (long) obj.get("price");
					/*	JSONObject newjsobj = new JSONObject();
						newjsobj.put("sharename", sharename);
						newjsobj.put("price", shareprice);
						
					*/	
					jsarray.set(i, obj);
					break;
					}
					
				}
			
			   // jsarray.add(obj);
			    jsobj1.put("Shares", jsarray);
			    Utility.update(jsobj1);
			   Utility.updateAccount(accountHolderName);
			}
		
		
		
		public static void update(JSONObject jsobj1) throws IOException
		{
			
			System.out.println(jsobj1.toJSONString());
			FileWriter writer = new FileWriter("ShareLibrary.json");
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write(jsobj1.toJSONString());
			bw.flush();
			bw.close();
		}
		
		
		
		public static void updateAccount(String accountHolderName) throws IOException, ParseException
		{
			JSONObject obj =null;
			FileReader file = new FileReader("Account.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			JSONObject jsobj = (JSONObject) parser.parse(reader);
			JSONArray jsarray1 = (JSONArray) jsobj.get("Account");
			 for(int i=0; i<jsarray1.size();i++)
				{  
		          JSONObject  tempObj = (JSONObject) jsarray1.get(i);
		          //  System.out.println(obj);
		            String name = (String)tempObj.get("name");
		           System.out.println(name);
		           
		            if(accountHolderName==name);
					{
						//obj = tempObj;
						tempObj.put("number",sharenumbers );
//						
						//System.out.println(obj);
						//jsarray1.set(i, obj);
						break;
					}
					
				}
				//jsarray1.add(obj);
		        JSONObject mainjsobj = new JSONObject();
				mainjsobj.put("Account", jsarray1);
			System.out.println(mainjsobj.toJSONString());
			FileWriter writer = new FileWriter("Account.json");
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write(mainjsobj.toJSONString());
			bw.flush();
			bw.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void sell()
		{
			
		}
         
}		 
		 


		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

