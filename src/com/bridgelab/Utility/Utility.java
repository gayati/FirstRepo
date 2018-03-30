package com.bridgelab.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
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
    		 MyStack<Character> stack = new MyStack();
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
			* 
			*/  
	
		 public static void printCalenderQueue(int month,int year) throws InterruptedException
		 {
				Queue q = new LinkedList();
				LinkedList<String> week;
				LinkedList<LinkedList>weekQueue=new LinkedList<LinkedList>(); 
				String[] dayOfWeek = { "S", "M", "T","W", "Th", "F", "S" };
				int[] noOfDays = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				int date = 1;
				if (month == 2 || isLeapYear(year))
					noOfDays[2] = 29;
				  int day = dayOfweek(1, month, year);
				week = new LinkedList<String>();
				for (int i = 0; i < dayOfWeek.length; i++) 
				{
					  week.add((dayOfWeek[i]));
				}
				weekQueue.add(week);
				for (int i = 1; i <7; i++)
				{
					week = new LinkedList();
					if (i == 1)
					{
						for (int k = 0; k < 7; k++)
						{
							if (k < day)
							{
								week.add(" ");
							} 
							else 
							{
								week.add(String.valueOf(date));
								date++;
							}
						}
					}
					else 
					{
						for (int k = 0; k < 7; k++) 
						{
							if(date<=noOfDays[month])
							week.add(String.valueOf(date));
							date++;
						}
					}
				weekQueue.add(week);
				}
				Utility.displayCalender(weekQueue,month,year);
			}
		 
		 
			public static  void displayCalender(LinkedList<LinkedList> weekQueue,int month,int year) throws InterruptedException {
				try
				{
				Object date = " ";
				String[] monthName = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September",
						"October", "November", "December" };
				System.out.println("              Calender of " + monthName[month] + "  " + year);
				System.out.println();
				for (int i = 0; i < 6; i++) {
					LinkedList week = weekQueue.remove();
					for (int j = 0; j < 7; j++) {
					    date =  week.remove();
					    if(date==null)
					    	break;
					    System.out.print(date+"\t");
					}
					System.out.println();
				}
			}catch(Exception e)
			{}

		 }
	 

		
			/** 
			*
			* @param 
			*/ 
		  
		  public static void printstack(int month, int year)
		    {
			
		     int totalNoOfDays = 0;
		     String[] months =  {
		                      "",                              
		                      "January", "February", "March",
		                      "April", "May", "June",
		                      "July", "August", "September",
		                      "October", "November", "December"
		                   };
		         
		     MyStack <Integer> stack1 = new MyStack();
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
		
		  
//		 public static void print2Darray(ArrayList<Integer> list)
//         {   
//			 int[][] prime = new int[10][50]; 
//			 Iterator< Integer> it = list.iterator();
//			 int block = 99;
//			 int i=0;
//			 int j =0;
//			      for(int k = 0; k<list.size();k++)
//			       {	 
//						 if(prime[i][ j++]<block)
//						 {
//							 prime[i][j]= it.next();
//
//							 System.out.print(prime[i][j] + " ");
//							 
//						 }	
//						 else
//						 {
//							 i++;
//							 j=0;
//							 block=block+100;
//							 System.out.println();
//						 }
//						
//					 }
//			     
//					 
//				 }
//					 
			 
			

		 
			/** 
			*
			* @param 
			*/ 
		
//		  
//		 public static void printAnagram2Darray(ArrayList<Integer> list)
//      {   
//			 int n =list.size() ;
//	         Integer[] liststring = new Integer[n];
//	         liststring = list.toArray(liststring);
//			 int[][] prime = new int[10][50]; 
//			 Iterator< Integer> it = list.iterator();
//			 int block = 100;
//			 int i=0;
//			 int j =1;
//			      while(it.hasNext())
//			       {	 
//			    	  for( i=0;i<n ; i++)
//			          {
//			       	   for(j=i+1;j<n; j++)
//			       	   {
//			       		   if(isAnagram(String.valueOf(liststring[i]),String.valueOf(liststring[j])))
//			       		   {
//
//			       		   }
//			       	   }
//			       	   
//			          
//			        }
//						
//					 }
//			
//				 }
					 
		    /** 
			*
			* @param 
			*/ 
		 
		 public static void printAnagram2Darray()
		 {
			 
				ArrayList <Integer>arrayList = new ArrayList<Integer>();
				int primeNumber[][]=new int[10][100];
				int i,j;
				String Prime="";
				for(i=0;i<10;i++)
				{
					for(j=0;j<=100;j++) 
					{
						int num=i*100+j;
						if(isprime(num))
						{
							primeNumber[i][j]=num;
							Prime=Prime+num+" ";
						}
					}
				}

				int[][] anagram=new int[10][100];
				String[] strArray=Prime.split(" ");//add all prime to strArray and check are they anagram

				
				for(i=0;i<strArray.length;i++) 
				{
		 			for(j=i+1;j<strArray.length;j++) 
		 			{
		 				if(isAnagram(strArray[i],strArray[j])) //if they anagram
						{
		 					arrayList.add(Integer.parseInt(strArray[i]));
		 					arrayList.add(Integer.parseInt(strArray[j]));
						}
		 			}
				}
				//arrayList.sort(null);
				 Collections.sort(arrayList);  //sort arraylist in ascending order
			
				j=0; i=0;	
				int k=0;
				while(j<=arrayList.size() && i<10)
				{
				k=0;
				
				int rem=arrayList.get(j)/100;
				while(j<arrayList.size() && arrayList.get(j)/100==rem)//add allanagram to anagram array
				 {
					anagram[i][k]=arrayList.get(j);
					k++;
					j++;
			
		        }
				i++;
			    }
		     		
				for(i=0;i<9;i++) 
				{
					for(j=0;j<anagram.length;j++) 
					{
				
						if(anagram[i][j]!=0)
						System.out.print(anagram[i][j]+" ");//anagram
					}
					System.out.println();
				}
				
				}	
		 
		 
		    /** 
			*
			* @param this method prints 0 to 1000 prime number in two dimentional array.
			*/ 
		 
		 public static void printTwoDArray()
		 {
			 int primeNumber[][]=new int[10][100];
				int i,j;
				String Prime="";
				for(i=0;i<10;i++)
				{
					for(j=0;j<=100;j++)
					{
						int num=i*100+j;  //check weather it is prime or not
						if(isprime(num))
						{
							primeNumber[i][j]=num;
							Prime=Prime+num+" ";
						}
					}
				}

				for(i=0;i<10;i++) 
				{
					for(j=0;j<100;j++) 
					{
				     if(primeNumber[i][j]!=0)
						System.out.print(primeNumber[i][j]+" ");//to print prime array
					}
					System.out.println();
				}
				 
		 }
			
		 
		 public static boolean isprime(int num) 
			{
				 
		        for(int i=2; i<=num/2; i++)
		        {
		            if(num % i == 0)
		            {
		                return false;
		            }
		        }
		        return true;
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
		 
		 
		 

		 static int BALANCEAMOUNT = 50000;
		 static int DEPOSITAMOUNT=0;
		 static int WITHDRAWAMOUNT=0;
		 
		 
		 
		 public static void withdrawAmount()
		 {
			 System.out.println("Enter the amount you want to withdraw");
             WITHDRAWAMOUNT = Utility.readInteger();
             if(BALANCEAMOUNT>=WITHDRAWAMOUNT)
             {
             BALANCEAMOUNT=BALANCEAMOUNT-WITHDRAWAMOUNT;
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
	          DEPOSITAMOUNT = Utility.readInteger();
	          BALANCEAMOUNT=BALANCEAMOUNT+DEPOSITAMOUNT;
	          System.out.println("Amount is successfully deposited.....!!!");
		 }
		
		public static void checkBalance()
		{
			System.out.println("Your balance amount is:" + BALANCEAMOUNT );
		}
		
		//datastructure
		
		static JSONArray JSARRAY = new JSONArray();
		static JSONObject JSOBJ = new JSONObject();
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
			JSARRAY.add(jsobj);
			FileWriter writer = new FileWriter("Account.json",true);
			JSONObject mainjsobj = new JSONObject();
      	    mainjsobj.put("Account", JSARRAY);
			writer.write(mainjsobj.toJSONString());
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
				 System.out.println("Succesfully created the Account.........!!!!!!!!");
				 writer.flush();
				
			}
			
		
			
	        
		}
		
		static String ACCOUNTHOLDERNAME; 
		static long SHARENUMBERS;
		static long SHARENUMBER=0;
		static long TOTALPRICE;
		static String SYMBOL;
		@SuppressWarnings("unchecked")
		
		public  static void buy() throws IOException, ParseException
		{
			System.out.println("Enter the name of Share holder who want to buy the share:");
			ACCOUNTHOLDERNAME= Utility.readString();
			System.out.println("Enter the symbol of share you want to buy: ");
			 SYMBOL = Utility.readString();
			System.out.println("Enter the number of shares you want to buy: ");
			 SHARENUMBERS= Utility.readLong();
			
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
					
					if(SYMBOL.equals(sharename))
					{
					System.out.println(sharename);
					shareprice = (long) obj.get("price");
					SHARENUMBER = (long)obj.get("sharenumber");
					if (SHARENUMBER==0)
					{
						System.out.println("Sorry,..........Shares are not avaialable");
						break;
					}
					else
					{
					System.out.println("The price for share is: "+ shareprice);
					TOTALPRICE = (SHARENUMBERS*shareprice);
					System.out.println("The total price for share is: " + TOTALPRICE);
					
					SHARENUMBER = SHARENUMBER-SHARENUMBERS;
					obj.put("sharenumber", SHARENUMBER);
					
					jsarray.set(i, obj);
					 jsobj1.put("Shares", jsarray);
					   Utility.updateShare(jsobj1);
					   Utility.updateAccount(ACCOUNTHOLDERNAME);
					break;
					}
					
					}
//					
//					 jsobj1.put("Shares", jsarray);
//					   Utility.updateShare(jsobj1);
//					   Utility.updateAccount(accountHolderName);
				}
			
			   
			}
		
		
		
		public static void updateShare(JSONObject jsobj1) throws IOException
		{
			
			//System.out.println(jsobj1.toJSONString());
			FileWriter writer = new FileWriter("ShareLibrary.json");
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write(jsobj1.toJSONString());
			System.out.println("Share Updated Successfully.......");
			bw.flush();
			bw.close();
		}
		
		
		
		@SuppressWarnings("unchecked")
		public static void updateAccount(String accountHolderName) throws IOException, ParseException
		{
			JSONObject  tempObj =null;
			FileReader file = new FileReader("Account.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			JSONObject jsobj = (JSONObject) parser.parse(reader);
			JSONArray jsarray1 = (JSONArray) jsobj.get("Account");
			 for(int i=0; i<jsarray1.size();i++)
				{  
				// System.out.println(accountHolderName);
		            tempObj = (JSONObject) jsarray1.get(i);
		           // System.out.println(tempObj);
		            String name1 = (String)tempObj.get("name");
		            long newshareNumber = (long) tempObj.get("number");
		            long newSharePrice = (long) tempObj.get("amount");
		            newshareNumber = newshareNumber + SHARENUMBERS;
		            newSharePrice = newSharePrice  - TOTALPRICE;
//		          boolean isTrue = accountHolderName.equals(name1);
//		          System.out.println(isTrue);
		          
		            if(accountHolderName.equals(name1))
					{ 
//						System.out.println(accountHolderName);
//						System.out.println(name1);
//				         System.out.println(tempObj);
						tempObj.put("number",newshareNumber );
						tempObj.put("amount", newSharePrice);
						jsarray1.set(i, tempObj);
						break;
						
					}
					
				}
				
		        JSONObject mainjsobj = new JSONObject();
				mainjsobj.put("Account", jsarray1);
			//System.out.println(mainjsobj.toJSONString());
			FileWriter writer = new FileWriter("Account.json");
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write(mainjsobj.toJSONString());
			
			long millis=System.currentTimeMillis();  
			java.util.Date date=new java.util.Date(millis);
			MyQueue <String>queue = new MyQueue();
		    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
             String strDate = dateFormat.format(date);  
			queue.enque(strDate);
			
			String date1 = queue.deque();
			//System.out.println(date1);  
			
			MyStack <String>stack = new MyStack();
			stack.push(SYMBOL);
//			System.out.println();
//			stack.show();
		   String symbol1 = stack.peek();
		   // System.out.println(symbol1);
			
			
			
			System.out.println("Share "+" " +symbol1+" "+" update Succesfully ... at"+ date1+".......");
			bw.flush();
			bw.close();
		}
		
		
		
		@SuppressWarnings("unchecked")
		public static void sell() throws IOException, ParseException
		{
			
	      Utility.createCustomerAccount();
	      
	      Utility.updateAccount1(shareholdername);
	      
	   
			
		}
		
		@SuppressWarnings({ "unchecked", "resource" })
		static String customername;
		static long numberOfShares; 
		static String shareholdername; 
		public static void createCustomerAccount() throws IOException, ParseException
		{
           JSONObject jsobj=new JSONObject();
			

			System.out.println("Enter the name of Share holder: ");
		    shareholdername = Utility.readString();
			jsobj.put("ShareHolderName", shareholdername);
			
			System.out.println("Enter the name of Customer who want to buy Share from Share Holder");
		    customername = Utility.readString();
			jsobj.put("CustomerName", customername);

			System.out.println("Enter the number of shares want to buy:" );
			  numberOfShares = Utility.readLong();
			jsobj.put("ShareNumber", numberOfShares);
			
			
			FileReader file = new FileReader("Customer.json");
			BufferedReader reader = new BufferedReader(file);
			if(reader.readLine() == null)
			{
			JSARRAY.add(jsobj);
			
			FileWriter writer = new FileWriter("Customer.json",true);
			
      	    System.out.println(JSOBJ.put("Customers", JSARRAY));
			writer.write(jsobj.toJSONString());
			writer.flush();
			}
			else
			{

				FileReader file1 = new FileReader("Customer.json");
				BufferedReader reader1 = new BufferedReader(file1);
				JSONParser parser = new JSONParser();
				JSONObject jsobj1 = (JSONObject) parser.parse(reader1);
				JSONArray jsarray1 = (JSONArray) jsobj1.get("Customer");
				System.out.println(jsobj);

				jsarray1.add(jsobj);
		        //JSONObject mainjsobj = new JSONObject();
				 JSOBJ.put("Customer", jsarray1);
				 FileWriter writer = new FileWriter("Customer.json");
				 writer.write(JSOBJ.toJSONString());
				 System.out.println("Succesfully created the Customers Account.........!!!!!!!!");
				 writer.flush();
			}
		}
		
//		public static void updateCustomerAccount(String customername) throws IOException, ParseException
//		{
//
//			JSONObject  tempObj =null;
//			FileReader file = new FileReader("Customer.json");
//			BufferedReader reader = new BufferedReader(file);
//			JSONParser parser = new JSONParser();
//			JSONObject jsobj = (JSONObject) parser.parse(reader);
//			JSONArray jsarray1 = (JSONArray) jsobj.get("Customer");
//			 for(int i=0; i<jsarray1.size();i++)
//				{  
//				// System.out.println(accountHolderName);
//		            tempObj = (JSONObject) jsarray1.get(i);
//		           // System.out.println(tempObj);
//		            String name1 = (String)tempObj.get("CustomerName");
//		            long newshareNumber = (long) tempObj.get("ShareNumber");
//		              newshareNumber = newshareNumber + numberOfShares;
//
////		          boolean isTrue = acco// TODO Auto-generated method stubuntHolderName.equals(name1);
////		          System.out.println(isTrue);
//		          
//		            if(customername.equals(name1))
//					{ 
//		            	
//		            	
////						System.out.println(accountHolderName);
////						System.out.println(name1);
////				         System.out.println(tempObj);
//						tempObj.put("ShareNumber",newshareNumber );
//						jsarray1.set(i, tempObj);
//						break;
//		            	
//					}
//					
//				}
//				
//		        JSONObject mainjsobj = new JSONObject();
//				mainjsobj.put("Customer", jsarray1);
//			//System.out.println(mainjsobj.toJSONString());
//			FileWriter writer = new FileWriter("Customer.json");
//			BufferedWriter bw=new BufferedWriter(writer);
//			bw.write(mainjsobj.toJSONString());
//			System.out.println("Customer's Share are update Succesfully..........");
//			bw.flush();
//			bw.close();
//		}
//		
		
		public static void updateAccount1(String shareholdername) throws IOException, ParseException
		{
			JSONObject  tempObj =null;
			FileReader file = new FileReader("Account.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			JSONObject jsobj = (JSONObject) parser.parse(reader);
			JSONArray jsarray1 = (JSONArray) jsobj.get("Account");
			 for(int i=0; i<jsarray1.size();i++)
				{  
				// System.out.println(accountHolderName);
		            tempObj = (JSONObject) jsarray1.get(i);
		           // System.out.println(tempObj);
		            String name1 = (String)tempObj.get("name");
		            long newshareNumber = (long) tempObj.get("number");
		            long newsharePrice = (long) tempObj.get("amount");
		            newshareNumber = newshareNumber -numberOfShares;
		            //newsharePrice = newsharePrice - (newshareNumber*)
//		          boolean isTrue = accountHolderName.equals(name1);
//		          System.out.println(isTrue);
		          
		            if(shareholdername.equals(name1))
					{ 
//						System.out.println(accountHolderName);
//						System.out.println(name1);
//				         System.out.println(tempObj);
						tempObj.put("number",newshareNumber );
						jsarray1.set(i, tempObj);
						break;
						
					}
					
				}
				
		        JSONObject mainjsobj = new JSONObject();
				mainjsobj.put("Account", jsarray1);
			//System.out.println(mainjsobj.toJSONString());
			FileWriter writer = new FileWriter("Account.json");
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write(mainjsobj.toJSONString());
			long millis=System.currentTimeMillis();  
			java.util.Date date=new java.util.Date(millis);  
			
			
			
			System.out.println("Share Holders Share are update Succesfully.....At" + " " + date);
			bw.flush();
			bw.close();
		}
		
		
		//Stock Report
		
		
		static String DOCTORNAME;
		static long DOCTORID;
		static String SPECIALIZATION;
		static long AVAILABILITY;
		static JSONObject MAINJSOBJ = new JSONObject();
		public static void addDoctorsDetails() throws IOException, ParseException
		{
			System.out.println("Enter the doctor name:");
			DOCTORNAME = Utility.readString();
			JSOBJ.put("DoctorName", DOCTORNAME);
			System.out.println("Enter the doctor Id:");
			DOCTORID = Utility.readLong();
					
			FileReader file = new FileReader("Doctor.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(reader);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Doctors");
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSONObject tempObj = new JSONObject();
				 tempObj = (JSONObject) JSARRAY.get(i);
				
				 long id = (long) tempObj.get("DoctorId");
				 if(DOCTORID==id)
				 {
					 System.out.println("The id is already equipped with another doctor,Enter another Id");
					
					 DOCTORID = Utility.readLong();
				  
				 }
				 
				 
			 }
			JSOBJ.put("DoctorId", DOCTORID);
			System.out.println("Enter the Doctors Specialization:");
			SPECIALIZATION = Utility.readString();
			JSOBJ.put("Specialistion", SPECIALIZATION);
//			System.out.println("Doctor is available or not?.:");
//			AVALABILITY = Utility.readString();
//			JSOBJ.put("Avialability",AVALABILITY);
			System.out.println("Enter the Availability:(1.AM 2.PM 3.Both)");
			AVAILABILITY = Utility.readLong();
			JSOBJ.put("Availability", AVAILABILITY);
			
			FileReader file2 = new FileReader("Doctor.json");
			BufferedReader reader2 = new BufferedReader(file2);

			
			if(reader2.readLine() == null)
			{
				
			JSARRAY.add(JSOBJ);
			
			FileWriter writer = new FileWriter("Doctor.json",true);
			
			MAINJSOBJ.put("Doctors", JSARRAY);
			writer.write(MAINJSOBJ.toJSONString());
			writer.flush();
			writer.close();
			}
			else
			{
				
				FileReader file1 = new FileReader("Doctor.json");
				BufferedReader reader1 = new BufferedReader(file1);
				 JSONParser parser1 = new JSONParser();
				//JSONObject jsobj = new JSONObject();
				 MAINJSOBJ= (JSONObject) parser1.parse(reader1);
				 JSARRAY = (JSONArray) MAINJSOBJ.get("Doctors");
				 JSARRAY.add(JSOBJ);
				
				 MAINJSOBJ.put("Doctors", JSARRAY);
					 FileWriter writer = new FileWriter("Doctor.json");
					 writer.write( MAINJSOBJ.toJSONString());
					 System.out.println("Succesfully added doctor.........!!!!!!!!");
					 writer.flush();

			}
		}
		
		
		static String PATIENTNAME;
		static long PATIENTID;
		static long  MOBILENO;
		static long AGE;
		public static void addPatientDetails() throws IOException, ParseException
		{
			
			System.out.println("Enter the name of patient");
			PATIENTNAME = Utility.readString();
			JSOBJ.put("PatientName", PATIENTNAME);
			System.out.println("Enter the patient Id");
			PATIENTID = Utility.readLong();
			
			FileReader file = new FileReader("Patient.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(reader);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Patients");
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSONObject tempObj = new JSONObject();
				 tempObj = (JSONObject) JSARRAY.get(i);
				
				 long id = (long) tempObj.get("PatientId");
				 if(PATIENTID==id)
				 {
					 System.out.println("The id is already equipped with another patient,Enter another Id");
					
					 PATIENTID = Utility.readLong();
				  
				 }
			 }
			
			
			JSOBJ.put("PatientId", PATIENTID);
			System.out.println("Enter the mobile number:");
			MOBILENO = Utility.readLong();
			JSOBJ.put("MobileNumber", MOBILENO);
			System.out.println("Enter the age of patient");
			AGE = Utility.readLong();
			JSOBJ.put("Age", AGE);
			

			
			FileReader file3 = new FileReader("Patient.json");
			BufferedReader reader3 = new BufferedReader(file);

			
			if(reader.readLine() == null)
			{
			JSARRAY.add(JSOBJ);
			
			FileWriter writer = new FileWriter("Patient.json",true);
		    
			MAINJSOBJ.put("Patients", JSARRAY);
			writer.write(MAINJSOBJ.toJSONString());
			writer.flush();
			writer.close();
			}
			else
			{
				FileReader file1 = new FileReader("Patient.json");
				BufferedReader reader1 = new BufferedReader(file1);
				JSONParser parser1 = new JSONParser();
				//JSONObject jsobj = new JSONObject();
				 MAINJSOBJ= (JSONObject) parser.parse(reader1);
				 JSARRAY = (JSONArray) MAINJSOBJ.get("Patients");
				 JSARRAY.add(JSOBJ);
			       
					 MAINJSOBJ.put("Patients", JSARRAY);
					 FileWriter writer = new FileWriter("Patient.json");
					 writer.write( MAINJSOBJ.toJSONString());
					 System.out.println("Succesfully added patient.........!!!!!!!!");
					 writer.flush();

			}
			
		}
		
		
		public static void displayDoctorsDetails() throws IOException, ParseException
		{
			FileReader file1 = new FileReader("Doctor.json");
			
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(file1);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Doctors");
			 
			 System.out.println("\tThe Doctor Details are as follows: ");
			  String line;  
			  int k=1;
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSOBJ = (JSONObject) JSARRAY.get(i);
				 DOCTORNAME = (String) JSOBJ.get("DoctorName");
				 DOCTORID =  (long) JSOBJ.get("DoctorId");
				 AVAILABILITY =  (long) JSOBJ.get("Availability");
				 SPECIALIZATION = (String) JSOBJ.get("Specialistion");
				
				 System.out.println("\t************* Doctor-"+k+" ***************");
				 System.out.println("\tDoctor Name:  " + DOCTORNAME);
				 System.out.println("\tDoctor Id:  "  + DOCTORID);
				 System.out.println("\tDoctor Specialisation:" + SPECIALIZATION);
				 if(AVAILABILITY == 1)
				 {
				 System.out.println("\tAvailability: " +AVAILABILITY+ " (AM)");
				 }
				 else if (AVAILABILITY==2)
				 {
					 System.out.println("\tAvailability: " +AVAILABILITY+ " (PM)");
				 }
				 else
				 {
					 System.out.println("\tAvailability: " +AVAILABILITY+ " (BOTH)");
				 }
				 System.out.println("\t*****************************************");
				 System.out.println();
//				 line = JSOBJ.toJSONString();
//			
//				 System.out.println(line);
				 System.out.println();
				 k = k+1;
			 }
			 
		}
		
		
		public static void displayPatientDetails() throws IOException, ParseException
		{
			FileReader file1 = new FileReader("Patient.json");
			
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(file1);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Patients");
			 
			 System.out.println("The Patient Details are as follows: ");
			  String line;  
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSOBJ = (JSONObject) JSARRAY.get(i);
				 
				 line = JSOBJ.toJSONString();
			     
				 System.out.println(line);
				 System.out.println();
				
			 }
			 
		}
		
		
		
		public static void searchDoctorDetails() throws IOException, ParseException
		{
			System.out.println("Search Doctor by:        ");
			System.out.println("1.Doctor Name:");
			System.out.println("2.Doctor Id: ");
			System.out.println("3.Doctor Specialization: ");
			int choice = Utility.readInteger();
			switch (choice) {
			case 1:Utility.searchDoctorByName();
				
				break;
		   
           case 2:Utility.searchDoctorById();
				
				break;
		  
           case 3:Utility.searchDoctorBySpecialisation();
				
				break;

			default:
				break;
			}
			
		}
		
		static boolean found;
		public static void searchDoctorByName() throws IOException, ParseException
		{
			System.out.println("Enter the doctor name: ");
			String name = Utility.readString();
			
            FileReader file1 = new FileReader("Doctor.json");
			
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(file1);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Doctors");
			 
			
			 
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSOBJ = (JSONObject) JSARRAY.get(i);
				 DOCTORNAME= (String) JSOBJ.get("DoctorName");
			     if(DOCTORNAME.equals(name))
			     {
			     System.out.println("The Doctor Details are as follows: ");
			     DOCTORID =  (long) JSOBJ.get("DoctorId");
				 AVAILABILITY =  (long) JSOBJ.get("Availability");
				 SPECIALIZATION = (String) JSOBJ.get("Specialistion");
				 System.out.println("************* Doctor ***************");
				 System.out.println("Doctor Name:  " + DOCTORNAME);
				 System.out.println("Doctor Id:  "  + DOCTORID);
				 System.out.println("Doctor Specialisation:" + SPECIALIZATION);

				
				 if(AVAILABILITY == 1)
				 {
				 System.out.println("Availability: " +AVAILABILITY+ " (AM)");
				 }
				 else if (AVAILABILITY==2)
				 {
					 System.out.println("Availability: " +AVAILABILITY+ " (PM)");
				 }
				 else
				 {
					 System.out.println("Availability: " +AVAILABILITY+ " (BOTH)");
				 }
				 System.out.println("*****************************************");
				 System.out.println();			
				 System.out.println();
				// System.out.println(JSOBJ.toJSONString());
				 found = true;
				
				 
			     }
			     
			 }
			 if(found==false)
			 {
				 System.out.println("Doctor is not available.");
			 }	
		}
		
         
		public static void searchDoctorById() throws IOException, ParseException
		{
			System.out.println("Enter the doctor's Id to search:");
			long id = Utility.readLong();
			 FileReader file1 = new FileReader("Doctor.json");
				
				JSONParser parser = new JSONParser();
				
				 MAINJSOBJ= (JSONObject) parser.parse(file1);
				 JSARRAY = (JSONArray) MAINJSOBJ.get("Doctors");
				 
				
				 
				 for(int i = 0; i<JSARRAY.size();i++)
				 {
					 JSOBJ = (JSONObject) JSARRAY.get(i);
					  DOCTORID =  (long) JSOBJ.get("DoctorId");
				     if( DOCTORID==(id))
				     {
				     System.out.println("The Doctor Details are as follows: ");
				     DOCTORNAME= (String) JSOBJ.get("DoctorName");
					 AVAILABILITY =  (long) JSOBJ.get("Availability");
					 SPECIALIZATION = (String) JSOBJ.get("Specialistion");
					 System.out.println("************* Doctor ***************");
					 System.out.println("Doctor Name:  " + DOCTORNAME);
					 System.out.println("Doctor Id:  "  + DOCTORID);
					 System.out.println("Doctor Specialisation:" + SPECIALIZATION);

					 if(AVAILABILITY == 1)
					 {
					 System.out.println("Availability: " +AVAILABILITY+ " (AM)");
					 }
					 else if (AVAILABILITY==2)
					 {
						 System.out.println("Availability: " +AVAILABILITY+ " (PM)");
					 }
					 else
					 {
						 System.out.println("Availability: " +AVAILABILITY+ " (BOTH)");
					 }
					 System.out.println("*****************************************");
					 System.out.println();			
					 System.out.println();
					// System.out.println(JSOBJ.toJSONString());
					 found = true;
					
					 
				     }
				     
				 }
				 if(found==false)
				 {
					 System.out.println("Doctor is not available.");
				 }	
		}
		
		
		public static void searchDoctorBySpecialisation() throws IOException, ParseException
		{
			System.out.println("Enter the doctors specialization");
			String specialization =Utility.readString();
			
			FileReader file1 = new FileReader("Doctor.json");
			
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(file1);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Doctors");
			 
			
			 
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSOBJ = (JSONObject) JSARRAY.get(i);
				 SPECIALIZATION = (String) JSOBJ.get("Specialistion");
			
			     if( SPECIALIZATION.equals(specialization))
			     {
			     System.out.println("The Doctor Details are as follows: ");
			     DOCTORNAME= (String) JSOBJ.get("DoctorName");
				 AVAILABILITY =  (long) JSOBJ.get("Availability");
				  DOCTORID =  (long) JSOBJ.get("DoctorId");
				 System.out.println("************* Doctor ***************");
				 System.out.println("Doctor Name:  " + DOCTORNAME);
				 System.out.println("Doctor Id:  "  + DOCTORID);
				 System.out.println("Doctor Specialisation:" + SPECIALIZATION);

				 if(AVAILABILITY == 1)
				 {
				 System.out.println("Availability: " +AVAILABILITY+ " (AM)");
				 }
				 else if (AVAILABILITY==2)
				 {
					 System.out.println("Availability: " +AVAILABILITY+ " (PM)");
				 }
				 else
				 {
					 System.out.println("Availability: " +AVAILABILITY+ " (AM and PM Both)");
				 }
				 System.out.println("*****************************************");
				 System.out.println();			
				 System.out.println();
				// System.out.println(JSOBJ.toJSONString());
				 found = true;
				
				 
			     }
			     
			 }
			 if(found==false)
			 {
				 System.out.println("Doctor is not available.");
			 }	
	
			
			
		}
		
		public static void searchPatientDetails() throws IOException, ParseException
		{
			System.out.println("Search Patient by:        ");
			System.out.println("1.Patient Name:");
			System.out.println("2.Patient Id: ");
		
			int choice = Utility.readInteger();
			switch (choice) {
			case 1:Utility.searchPatientByName();
				
				break;
		   
           case 2:Utility.searchPatientById();
				
				break;
		  

			default:System.out.println("Invalid Choice");
				break;
			}
			
			
			
		}
		
		
		public static void searchPatientByName() throws IOException, ParseException
		{
			System.out.println("Enter the patientname: ");
			String name = Utility.readString();
		     FileReader file1 = new FileReader("Patient.json");
				
				JSONParser parser = new JSONParser();
				
				 MAINJSOBJ= (JSONObject) parser.parse(file1);
				 JSARRAY = (JSONArray) MAINJSOBJ.get("Patients");
				 
				
				 
				 for(int i = 0; i<JSARRAY.size();i++)
				 {
					 JSOBJ = (JSONObject) JSARRAY.get(i);
					 PATIENTNAME = (String) JSOBJ.get("PatientName");
					
				     if( PATIENTNAME.equals(name))
				     {
				     System.out.println("The Patient Details are as follows: ");
				       PATIENTID =  (long) JSOBJ.get("PatientId");
					   MOBILENO =  (long) JSOBJ.get("MobileNumber");
					  AGE= (long) JSOBJ.get("Age");
					 System.out.println("************* Patient ***************");
					 System.out.println("Patient Name:  " + PATIENTNAME);
					 System.out.println("Patient Id:  "  + PATIENTID );
					 System.out.println("Mobile Number:" + MOBILENO);
					 System.out.println("Patient's Age: " + AGE);
					 System.out.println("*****************************************");
					 System.out.println();			
					 System.out.println();
					 found = true;
					}  
				 }
				 if(found==false)
				 {
					 System.out.println("Patient Not Found");
				 }			
		}
		   
		
		public static void searchPatientById() throws IOException, ParseException
		{
			System.out.println("Enter the patients Id: ");
		    long id = Utility.readLong();
		    FileReader file1 = new FileReader("Patient.json");
			
			JSONParser parser = new JSONParser();
			
			 MAINJSOBJ= (JSONObject) parser.parse(file1);
			 JSARRAY = (JSONArray) MAINJSOBJ.get("Patients");
			 
			
			 
			 for(int i = 0; i<JSARRAY.size();i++)
			 {
				 JSOBJ = (JSONObject) JSARRAY.get(i);
				 PATIENTID =  (long) JSOBJ.get("PatientId");
				
				
			     if(PATIENTID==id)
			     {
			     System.out.println("The Patient Details are as follows: ");
			      PATIENTNAME = (String) JSOBJ.get("PatientName");
				   MOBILENO =  (long) JSOBJ.get("MobileNumber");
				  AGE= (long) JSOBJ.get("Age");
				 System.out.println("************* Patient ***************");
				 System.out.println("Patient Name:  " + PATIENTNAME);
				 System.out.println("Patient Id:  "  + PATIENTID );
				 System.out.println("Mobile Number:" + MOBILENO);
				 System.out.println("Patient's Age: " + AGE);
				 System.out.println("*****************************************");
				 System.out.println();			
				 System.out.println();
				 found = true;
				}  
			 }
			 if(found==false)
			 {
				 System.out.println("Patient Not Found");
			 }		
		}
  
		static Long NUMBEROFPATIENT;
		static String DATE;
		static long COUNT;
		
		public static void takeAppointment() throws IOException, ParseException, java.text.ParseException
		{  
			
			System.out.println("Enter the patient's name: ");
			PATIENTNAME = Utility.readString();
			//JSOBJ.put("PatientName",PATIENTNAME);
			System.out.println("Enter the Doctor's name: ");
			DOCTORNAME = Utility.readString();
			JSOBJ.put("DoctorName", DOCTORNAME );
		    System.out.println("Enter the date(DD/MM/YYYY): ");
		    String sDate1 = Utility.readString();
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    JSOBJ.put("Date", date1.toString());
		    COUNT=0;
		   
		    boolean isTrue = false;
		    boolean isAvailable=false;
				 FileReader file3 = new FileReader("Appointments.json");
				 BufferedReader reader3 = new BufferedReader(file3);

					
					if(reader3.readLine() == null)
					{
					COUNT++;
					JSOBJ.put("Count", COUNT);
					JSARRAY.add(JSOBJ);
					
					FileWriter writer = new FileWriter("Appointments.json",true);
				    
					MAINJSOBJ.put("Appointement", JSARRAY);
					writer.write(MAINJSOBJ.toJSONString());
					writer.flush();
					writer.close();
					}
					else
					{
						
						FileReader file1 = new FileReader("Appointments.json");
						BufferedReader reader1 = new BufferedReader(file1);
						JSONParser parser1 = new JSONParser();
						//JSONObject jsobj = new JSONObject();
						 MAINJSOBJ= (JSONObject) parser1.parse(reader1);
						 JSARRAY = (JSONArray) MAINJSOBJ.get("Appointement");
						 for(int i = 0; i<JSARRAY.size();i++)
						 {   
							// boolean isAvailable=false;
							 JSONObject jsobj = new JSONObject();
							 jsobj = (JSONObject) JSARRAY.get(i);
							 String doctorname =  (String) jsobj.get("DoctorName");
							 DATE = (String) jsobj.get("Date");
							 long count1= (long) jsobj.get("Count");
					         isTrue = ((date1.toString()).equals(DATE) && DOCTORNAME.equals(doctorname));
							 if(isTrue)
							 {
								 if(count1 < 5)
								 {
//								long newcount = (long) jsobj.get("Count");
//									long newcount1 = newcount +1;
//									System.out.println(newcount1);
								 count1 = count1+1;
									 JSOBJ.put("Count",count1);
									 JSARRAY.set(i, JSOBJ);
									 MAINJSOBJ.put("Appointement", JSARRAY);
									 FileWriter writer = new FileWriter("Appointments.json");
									 writer.write( MAINJSOBJ.toJSONString());
									 System.out.println("Succesfully take appointment.........!!!!!!!!");
									 writer.flush();
									 isAvailable = true;
									 isTrue = true;
									 break;
								       
									
								 }//if ends
								   
			                        break;
								 }//if ends
							 
							 }
                         if(isTrue==false)
                         {
                        		FileReader file2 = new FileReader("Appointments.json");
        						BufferedReader reader2 = new BufferedReader(file2);
        						JSONParser parser2 = new JSONParser();
        						//JSONObject jsobj = new JSONObject();
        						COUNT++;
        						 MAINJSOBJ= (JSONObject) parser2.parse(reader2);
        						 JSARRAY = (JSONArray) MAINJSOBJ.get("Appointement");
        						 JSOBJ.put("Count",COUNT);
								 System.out.println(JSOBJ);
								 JSARRAY.add(JSOBJ);
								 MAINJSOBJ.put("Appointement", JSARRAY);
								 FileWriter writer = new FileWriter("Appointments.json");
								 writer.write( MAINJSOBJ.toJSONString());
								 System.out.println("Succesfully take appointment.........!!!!!!!!");
								 writer.flush();
								 isAvailable = true;
								 
                         }
						 if(isAvailable==false)
						 {
							 System.out.println("Doctor is not Available");
						 }
						
					}
						 //for ends
						 
					
						 
//						 FileReader file = new FileReader("Appointments.json");
//							BufferedReader reader = new BufferedReader(file);
//							JSONParser parser = new JSONParser();
//							//JSONObject jsobj = new JSONObject();
//							 MAINJSOBJ= (JSONObject) parser1.parse(reader);
//							 JSARRAY = (JSONArray) MAINJSOBJ.get("Appointement");
//							 count = count +1;
//							 JSOBJ.put("Count", count);
//							 JSARRAY.add(JSOBJ);
//						       
//							 MAINJSOBJ.put("Appointement", JSARRAY);
//							 FileWriter writer = new FileWriter("Appointments.json");
//							 writer.write( MAINJSOBJ.toJSONString());
//							 System.out.println("Succesfully take appointment.........!!!!!!!!");
//							 writer.flush();
//						
					
					
		}
		    
	

		public static void printAppointment()
		{
			
		}
		
		
		
		public static String[] deckOfCards(String[] SUITS, String[] RANKS)
		{ 
			
			String[] deck = new String[52];
			int index = 0;
			
				for (int j = 0; j < SUITS.length; j++)
				{
					for (int i = 0; i < RANKS.length; i++)
					{
					deck[index++] = SUITS[j] + " " + RANKS[i];
				}
			}
			return deck;
			
			
		}
		
		public static String[] shuffleCards(String[] deckCards)
		{
			
			for (int i = 0; i < 52; i++) 
			{
				int n = (int) (Math.random() * 52);
				String temp = deckCards[i];
				deckCards[i] = deckCards[n];
				deckCards[n] = temp;
			}
			return deckCards; 
		}
		
		public static void printCards(String[] deckCards,int player,int cards)
		{   int index = 0;
			for (int i = 0; i < player; i++) 
			{
				System.out.println("Player "+(i+1));//player count
			
				for (int j = 0; j < cards; j++) 
				{
					System.out.println(deckCards[index++]);
				}
				System.out.println();
			}
			
		}
		
		
		
		
		Queue cardQueue = new LinkedList();
		public String[] assignDeckOfCards() 
		{
			String[] suit = { "Club", "Diamond", "Heart", "Spade" };
				String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
				String[] deckOfCards = new String[52];
				int index = 0;
				for (int i = 0; i < suit.length; i++) {
					for (int j = 0; j < rank.length; j++) {
						deckOfCards[index++] = suit[i] + " " + rank[j];
					}
				}
				return deckOfCards;
		
		}
		public  String[] shuffle(String[] deckCards) {
			for (int i = 0; i < deckCards.length; i++) {
				int random = (int) (Math.random() * (52));
				String temp = deckCards[i];
				deckCards[i] = deckCards[random];
				deckCards[random] = temp;
			}
			return deckCards;
		}
		
		public static  String[][] distribute(String[] deckOfShuffleCards, int noOfPlayers, int noOfCards) {
			int index = 0;
			String[][] distributedCards = new String[noOfPlayers][noOfCards];
			for (int i = 0; i < noOfPlayers; i++) {
				for (int j = 0; j < noOfCards; j++) {
					distributedCards[i][j] = deckOfShuffleCards[index++];
				}
			}
			return distributedCards;
		}
		
		
		public static  void printDistibutedCards(String[][] cardsOfPlayers, int noOfPlayers, int noOfCards) {
			for (int i = 0; i < noOfPlayers; i++) {
				System.out.println("Cards of player " + (i + 1) + " are as follows :");
				for (int j = 0; j < noOfCards; j++) {
					System.out.println(cardsOfPlayers[i][j]);
				}
				System.out.println();
			}
		
		 
		 
		}
		public  void printSortedCards(String[][] playerCards, int noOfPlayers, int noOfCards) {
			String[] cards = new String[noOfCards];
			for (int i = 0; i < noOfPlayers; i++) {
				for (int j = 0; j < noOfCards; j++) {
					cards[j] = playerCards[i][j];
				}
				cardQueue.add("Cards Of Player " + (i + 1) + " are as follows..");
				sort(cards);
			}
			printSortedCardQueue();
		}
		
		private  void printSortedCardQueue() {
			for (int i = 0; i < 40; i++) {
				if (i % 10 == 0)
					System.out.println();
				System.out.println(cardQueue.remove());

			}
		}
		private  void sort(String[] cards) {
			char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
			for (int i = 0; i < rank.length; i++) {
				for (int j = 0; j < cards.length; j++) {
					String card = cards[j];
					char cardRank = card.charAt(card.length() - 1);
					if (cardRank == rank[i])
						cardQueue.add(card);
				}
			}
		}
		}	 



		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

