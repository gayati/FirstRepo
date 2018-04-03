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
import java.util.Comparator;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
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
				 
			 FileWriter file = new FileWriter(filepath);
			 BufferedWriter writer = new BufferedWriter(file);
			 String data = list.toString();
			
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
		 
		 

	        /** 
			*
			* @param This method returns the total number of binary search tree.
			*/ 
	        //this returns total number of possible binary search tree also called as catlan number(Cn)
	        
	        public static int catalan( int n)
	        {
	            // Calculate value of 2nCn
	             int c = Utility.binomialCoeff(2*n, n);
	          
	            // return 2nCn/(n+1)
	            return c/(n+1);
	        }
	        
	        
	     //this method is to calculate catlan number based on the Binomial Coefficient
	     public static int binomialCoeff( int n,  int k)
	     {
	          int res = 1;
	       
	        
	         if (k > n - k)
	             k = n - k;
	       
	        
	         for (int i = 0; i < k; ++i)
	         {
	             res *= (n - i);
	             res /= (i + 1);
	         }
	       
	         return res;
	     }
		 
		 
	     

		 static int balanceamount = 50000;
		 static int depositamount=0;
		 static int withdrawamount=0;
		 
		 
		 
		 public static void withdrawAmount()
		 {
			 System.out.println("Enter the amount you want to withdraw");
             withdrawamount = Utility.readInteger();
             if(balanceamount>=withdrawamount)
             {
             balanceamount=balanceamount-withdrawamount;
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
	          depositamount = Utility.readInteger();
	          balanceamount=balanceamount+depositamount;
	          System.out.println("Amount is successfully deposited.....!!!");
		 }
		
		public static void checkBalance()
		{
			System.out.println("Your balance amount is:" + balanceamount );
		}
		
		
		//datastructure
		
		
		
		/** 
		*
		* @param 
		*/  
		static JSONArray jsarrays = new JSONArray();
		static JSONObject jsobject = new JSONObject();
		@SuppressWarnings("unchecked")
		public static void createAccount() throws IOException, ParseException
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
			jsarrays.add(jsobj);
			FileWriter writer = new FileWriter("Account.json",true);
			JSONObject mainjsobj = new JSONObject();
      	    mainjsobj.put("Account", jsarrays);
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
		
		static String accountholdername; 
		static long sharenumbers;
		static long sharenumber=0;
		static long totalprice;
		static String symbol;
		@SuppressWarnings("unchecked")
		
		public  static void buy() throws IOException, ParseException
		{
			System.out.println("Enter the name of Share holder who want to buy the share:");
			accountholdername= Utility.readString();
			System.out.println("Enter the symbol of share you want to buy: ");
			 symbol = Utility.readString();
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
					if (sharenumber==0)
					{
						System.out.println("Sorry,..........Shares are not avaialable");
						break;
					}
					else
					{
					System.out.println("The price for share is: "+ shareprice);
					totalprice = (sharenumbers*shareprice);
					System.out.println("The total price for share is: " + totalprice);
					
					sharenumber = sharenumber-sharenumbers;
					obj.put("sharenumber", sharenumber);
					
					jsarray.set(i, obj);
					 jsobj1.put("Shares", jsarray);
					   Utility.updateShare(jsobj1);
					   Utility.updateAccount(accountholdername);
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
		            tempObj = (JSONObject) jsarray1.get(i);
		            String name1 = (String)tempObj.get("name");
		            long newshareNumber = (long) tempObj.get("number");
		            long newSharePrice = (long) tempObj.get("amount");
		            newshareNumber = newshareNumber + sharenumbers;
		            newSharePrice = newSharePrice  - totalprice;

		            if(accountHolderName.equals(name1))
					{ 
						tempObj.put("number",newshareNumber );
						tempObj.put("amount", newSharePrice);
						jsarray1.set(i, tempObj);
						break;
						
					}
					
				}
				
		        JSONObject mainjsobj = new JSONObject();
				mainjsobj.put("Account", jsarray1);
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
			
			MyStack <String>stack = new MyStack();
			stack.push(symbol);
//			System.out.println();
//			stack.show();
		   String symbol1 = stack.peek();
		   // System.out.println(symbol1);
			
			
			
			System.out.println("Share "+" " +symbol1+" "+" update Succesfully ... at "+ date1+".......");
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
			jsarrays.add(jsobj);
			
			FileWriter writer = new FileWriter("Customer.json",true);
			
      	    System.out.println(jsobject.put("Customers", jsarrays));
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
		        
				 jsobject.put("Customer", jsarray1);
				 FileWriter writer = new FileWriter("Customer.json");
				 writer.write(jsobject.toJSONString());
				 System.out.println("Succesfully created the Customers Account.........!!!!!!!!");
				 writer.flush();
			}
		}
		

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
		            tempObj = (JSONObject) jsarray1.get(i);
		            String name1 = (String)tempObj.get("name");
		            long newshareNumber = (long) tempObj.get("number");
		            long newsharePrice = (long) tempObj.get("amount");
		            newshareNumber = newshareNumber -numberOfShares;

	         
		          
		            if(shareholdername.equals(name1))
					{ 						
						tempObj.put("number",newshareNumber );
						jsarray1.set(i, tempObj);
						break;
						
					}
					
				}
				
		        JSONObject mainjsobj = new JSONObject();
				mainjsobj.put("Account", jsarray1);
			FileWriter writer = new FileWriter("Account.json");
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write(mainjsobj.toJSONString());
			long millis=System.currentTimeMillis();  
			java.util.Date date=new java.util.Date(millis);  
			
			
			
			System.out.println("Share Holders Share are update Succesfully.....At" + " " + date);
			bw.flush();
			bw.close();
		}
		
		
		
		
		static String doctorname;
		static long doctorid;
		static String specialisation;
		static long availability;
		static JSONObject mainjsobj = new JSONObject();
		public static void addDoctorsDetails() throws IOException, ParseException
		{
			System.out.println("Enter the doctor name:");
			doctorname = Utility.readString();
			jsobject.put("DoctorName", doctorname);
			System.out.println("Enter the doctor Id:");
			doctorid = Utility.readLong();
					
			FileReader file = new FileReader("Doctor.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			
			 mainjsobj= (JSONObject) parser.parse(reader);
			 jsarrays = (JSONArray) mainjsobj.get("Doctors");
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 JSONObject tempObj = new JSONObject();
				 tempObj = (JSONObject) jsarrays.get(i);
				
				 long id = (long) tempObj.get("DoctorId");
				 if(doctorid==id)
				 {
					 System.out.println("The id is already equipped with another doctor,Enter another Id");
					
					 doctorid = Utility.readLong();
				  
				 }
				 
				 
			 }
			jsobject.put("DoctorId", doctorid);
			System.out.println("Enter the Doctors Specialization:");
			specialisation = Utility.readString();
			jsobject.put("Specialistion", specialisation);
			System.out.println("Enter the Availability:(1.AM 2.PM 3.Both)");
			availability = Utility.readLong();
			jsobject.put("Availability", availability);
			
			FileReader file2 = new FileReader("Doctor.json");
			BufferedReader reader2 = new BufferedReader(file2);

			
			if(reader2.readLine() == null)
			{
				
			jsarrays.add(jsobject);
			
			FileWriter writer = new FileWriter("Doctor.json",true);
			
			mainjsobj.put("Doctors", jsarrays);
			writer.write(mainjsobj.toJSONString());
			writer.flush();
			writer.close();
			}
			else
			{
				
				FileReader file1 = new FileReader("Doctor.json");
				BufferedReader reader1 = new BufferedReader(file1);
				 JSONParser parser1 = new JSONParser();
				 mainjsobj= (JSONObject) parser1.parse(reader1);
				 jsarrays = (JSONArray) mainjsobj.get("Doctors");
				 jsarrays.add(jsobject);
				
				 mainjsobj.put("Doctors", jsarrays);
					 FileWriter writer = new FileWriter("Doctor.json");
					 writer.write( mainjsobj.toJSONString());
					 System.out.println("Succesfully added doctor.........!!!!!!!!");
					 writer.flush();

			}
		}
		
		
		static String patientname;
		static long patientid;
		static long  MOBILENO;
		static long age;
		public static void addPatientDetails() throws IOException, ParseException
		{
			
			System.out.println("Enter the name of patient");
			patientname = Utility.readString();
			jsobject.put("PatientName", patientname);
			System.out.println("Enter the patient Id");
			patientid = Utility.readLong();
			
			FileReader file = new FileReader("Patient.json");
			BufferedReader reader = new BufferedReader(file);
			JSONParser parser = new JSONParser();
			
			 mainjsobj= (JSONObject) parser.parse(reader);
			 jsarrays = (JSONArray) mainjsobj.get("Patients");
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 JSONObject tempObj = new JSONObject();
				 tempObj = (JSONObject) jsarrays.get(i);
				
				 long id = (long) tempObj.get("PatientId");
				 if(patientid==id)
				 {
					 System.out.println("The id is already equipped with another patient,Enter another Id");
					
					 patientid = Utility.readLong();
				  
				 }
			 }
			
			
			jsobject.put("PatientId", patientid);
			System.out.println("Enter the mobile number:");
			MOBILENO = Utility.readLong();
			jsobject.put("MobileNumber", MOBILENO);
			System.out.println("Enter the age of patient");
			age = Utility.readLong();
			jsobject.put("Age", age);
			

			
			FileReader file3 = new FileReader("Patient.json");
			BufferedReader reader3 = new BufferedReader(file);

			
			if(reader.readLine() == null)
			{
			jsarrays.add(jsobject);
			
			FileWriter writer = new FileWriter("Patient.json",true);
		    
			mainjsobj.put("Patients", jsarrays);
			writer.write(mainjsobj.toJSONString());
			writer.flush();
			writer.close();
			}
			else
			{
				FileReader file1 = new FileReader("Patient.json");
				BufferedReader reader1 = new BufferedReader(file1);
				JSONParser parser1 = new JSONParser();
				//JSONObject jsobj = new JSONObject();
				 mainjsobj= (JSONObject) parser.parse(reader1);
				 jsarrays = (JSONArray) mainjsobj.get("Patients");
				 jsarrays.add(jsobject);
			       
					 mainjsobj.put("Patients", jsarrays);
					 FileWriter writer = new FileWriter("Patient.json");
					 writer.write( mainjsobj.toJSONString());
					 System.out.println("Succesfully added patient.........!!!!!!!!");
					 writer.flush();

			}
			
		}
		
		
		public static void displayDoctorsDetails() throws IOException, ParseException
		{
			FileReader file1 = new FileReader("Doctor.json");
			
			JSONParser parser = new JSONParser();
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("Doctors");
			 
			 System.out.println("\tThe Doctor Details are as follows: ");
			  String line;  
			  int k=1;
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 doctorname = (String) jsobject.get("DoctorName");
				 doctorid =  (long) jsobject.get("DoctorId");
				 availability =  (long) jsobject.get("Availability");
				 specialisation = (String) jsobject.get("Specialistion");
				
				 System.out.println("\t************* Doctor-"+k+" ***************");
				 System.out.println("\tDoctor Name:  " + doctorname);
				 System.out.println("\tDoctor Id:  "  + doctorid);
				 System.out.println("\tDoctor Specialisation:" + specialisation);
				 if(availability == 1)
				 {
				 System.out.println("\tAvailability: " +availability+ " (AM)");
				 }
				 else if (availability==2)
				 {
					 System.out.println("\tAvailability: " +availability+ " (PM)");
				 }
				 else
				 {
					 System.out.println("\tAvailability: " +availability+ " (BOTH)");
				 }
				 System.out.println("\t*****************************************");
				 System.out.println();
				 System.out.println();
				 k = k+1;
			 }
			 
		}
		
		
		public static void displayPatientDetails() throws IOException, ParseException
		{
			FileReader file1 = new FileReader("Patient.json");
			
			JSONParser parser = new JSONParser();
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("Patients");
			 
			 System.out.println("The Patient Details are as follows: ");
			  String line;  
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 
				 line = jsobject.toJSONString();
			     
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
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("Doctors");
			 
			
			 
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 doctorname= (String) jsobject.get("DoctorName");
			     if(doctorname.equals(name))
			     {
			     System.out.println("The Doctor Details are as follows: ");
			     doctorid =  (long) jsobject.get("DoctorId");
				 availability =  (long) jsobject.get("Availability");
				 specialisation = (String) jsobject.get("Specialistion");
				 System.out.println("************* Doctor ***************");
				 System.out.println("Doctor Name:  " + doctorname);
				 System.out.println("Doctor Id:  "  + doctorid);
				 System.out.println("Doctor Specialisation:" + specialisation);

				
				 if(availability == 1)
				 {
				 System.out.println("Availability: " +availability+ " (AM)");
				 }
				 else if (availability==2)
				 {
					 System.out.println("Availability: " +availability+ " (PM)");
				 }
				 else
				 {
					 System.out.println("Availability: " +availability+ " (BOTH)");
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
				
				 mainjsobj= (JSONObject) parser.parse(file1);
				 jsarrays = (JSONArray) mainjsobj.get("Doctors");
				 
				
				 
				 for(int i = 0; i<jsarrays.size();i++)
				 {
					 jsobject = (JSONObject) jsarrays.get(i);
					  doctorid =  (long) jsobject.get("DoctorId");
				     if( doctorid==(id))
				     {
				     System.out.println("The Doctor Details are as follows: ");
				     doctorname= (String) jsobject.get("DoctorName");
					 availability =  (long) jsobject.get("Availability");
					 specialisation = (String) jsobject.get("Specialistion");
					 System.out.println("************* Doctor ***************");
					 System.out.println("Doctor Name:  " + doctorname);
					 System.out.println("Doctor Id:  "  + doctorid);
					 System.out.println("Doctor Specialisation:" + specialisation);

					 if(availability == 1)
					 {
					 System.out.println("Availability: " +availability+ " (AM)");
					 }
					 else if (availability==2)
					 {
						 System.out.println("Availability: " +availability+ " (PM)");
					 }
					 else
					 {
						 System.out.println("Availability: " +availability+ " (BOTH)");
					 }
					 System.out.println("*****************************************");
					 System.out.println();			
					 System.out.println();
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
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("Doctors");
			 
			
			 
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 specialisation = (String) jsobject.get("Specialistion");
			
			     if( specialisation.equals(specialization))
			     {
			     System.out.println("The Doctor Details are as follows: ");
			     doctorname= (String) jsobject.get("DoctorName");
				 availability =  (long) jsobject.get("Availability");
				  doctorid =  (long) jsobject.get("DoctorId");
				 System.out.println("************* Doctor ***************");
				 System.out.println("Doctor Name:  " + doctorname);
				 System.out.println("Doctor Id:  "  + doctorid);
				 System.out.println("Doctor Specialisation:" + specialisation);

				 if(availability == 1)
				 {
				 System.out.println("Availability: " +availability+ " (AM)");
				 }
				 else if (availability==2)
				 {
					 System.out.println("Availability: " +availability+ " (PM)");
				 }
				 else
				 {
					 System.out.println("Availability: " +availability+ " (AM and PM Both)");
				 }
				 System.out.println("*****************************************");
				 System.out.println();			
				 System.out.println();
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
				
				 mainjsobj= (JSONObject) parser.parse(file1);
				 jsarrays = (JSONArray) mainjsobj.get("Patients");
				 
				
				 
				 for(int i = 0; i<jsarrays.size();i++)
				 {
					 jsobject = (JSONObject) jsarrays.get(i);
					 patientname = (String) jsobject.get("PatientName");
					
				     if( patientname.equals(name))
				     {
				     System.out.println("The Patient Details are as follows: ");
				       patientid =  (long) jsobject.get("PatientId");
					   MOBILENO =  (long) jsobject.get("MobileNumber");
					  age= (long) jsobject.get("Age");
					 System.out.println("************* Patient ***************");
					 System.out.println("Patient Name:  " + patientname);
					 System.out.println("Patient Id:  "  + patientid );
					 System.out.println("Mobile Number:" + MOBILENO);
					 System.out.println("Patient's Age: " + age);
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
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("Patients");
			 
			
			 
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 patientid =  (long) jsobject.get("PatientId");
				
				
			     if(patientid==id)
			     {
			     System.out.println("The Patient Details are as follows: ");
			      patientname = (String) jsobject.get("PatientName");
				   MOBILENO =  (long) jsobject.get("MobileNumber");
				  age= (long) jsobject.get("Age");
				 System.out.println("************* Patient ***************");
				 System.out.println("Patient Name:  " + patientname);
				 System.out.println("Patient Id:  "  + patientid );
				 System.out.println("Mobile Number:" + MOBILENO);
				 System.out.println("Patient's Age: " + age);
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
  
		static Long numberofpatient;
		static String date;
		static long count;
		
		public static void takeAppointment() throws IOException, ParseException, java.text.ParseException
		{  
			
			System.out.println("Enter the patient's name: ");
			patientname = Utility.readString();
			//JSOBJ.put("PatientName",PATIENTNAME);
			System.out.println("Enter the Doctor's name: ");
			doctorname = Utility.readString();
			jsobject.put("DoctorName", doctorname );
		    System.out.println("Enter the date(DD/MM/YYYY): ");
		    String sDate1 = Utility.readString();
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    jsobject.put("Date", date1.toString());
		    count=0;
		   
		    boolean isTrue = false;
		    boolean isAvailable=false;
				 FileReader file3 = new FileReader("Appointments.json");
				 BufferedReader reader3 = new BufferedReader(file3);

					
					if(reader3.readLine() == null)
					{
					count++;
					jsobject.put("Count", count);
					jsarrays.add(jsobject);
					
					FileWriter writer = new FileWriter("Appointments.json",true);
				    
					mainjsobj.put("Appointement", jsarrays);
					writer.write(mainjsobj.toJSONString());
					writer.flush();
					writer.close();
					}
					else
					{
						
						FileReader file1 = new FileReader("Appointments.json");
						BufferedReader reader1 = new BufferedReader(file1);
						JSONParser parser1 = new JSONParser();
						//JSONObject jsobj = new JSONObject();
						 mainjsobj= (JSONObject) parser1.parse(reader1);
						 jsarrays = (JSONArray) mainjsobj.get("Appointement");
						 for(int i = 0; i<jsarrays.size();i++)
						 {   
							// boolean isAvailable=false;
							 JSONObject jsobj = new JSONObject();
							 jsobj = (JSONObject) jsarrays.get(i);
							 String doctorname =  (String) jsobj.get("DoctorName");
							 date = (String) jsobj.get("Date");
							 long count1= (long) jsobj.get("Count");
					         isTrue = ((date1.toString()).equals(date) && doctorname.equals(doctorname));
							 if(isTrue)
							 {
								 if(count1 < 5)
								 {
								     count1 = count1+1;
									 jsobject.put("Count",count1);
									 jsarrays.set(i, jsobject);
									 mainjsobj.put("Appointement", jsarrays);
									 FileWriter writer = new FileWriter("Appointments.json");
									 writer.write( mainjsobj.toJSONString());
									 System.out.println("Succesfully take appointment.........!!!!!!!!");
									 writer.flush();
									 isAvailable = true;
									 isTrue = true;
									 break;
								       
									
								 }//if ends
								   
			                        break;
								 }//if ends
							 
							 }//for ends
                         if(isTrue==false)
                         {
                        		FileReader file2 = new FileReader("Appointments.json");
        						BufferedReader reader2 = new BufferedReader(file2);
        						JSONParser parser2 = new JSONParser();
        						//JSONObject jsobj = new JSONObject();
        						count++;
        						 mainjsobj= (JSONObject) parser2.parse(reader2);
        						 jsarrays = (JSONArray) mainjsobj.get("Appointement");
        						 jsobject.put("Count",count);
								 System.out.println(jsobject);
								 jsarrays.add(jsobject);
								 mainjsobj.put("Appointement", jsarrays);
								 FileWriter writer = new FileWriter("Appointments.json");
								 writer.write( mainjsobj.toJSONString());
								 System.out.println("Succesfully take appointment.........!!!!!!!!");
								 writer.flush();
								 isAvailable = true;
								 
                         }
						 if(isAvailable==false)
						 {
							 System.out.println("Doctor is not Available");
							 System.out.println("Please take appointement on another date");
							 String date = Utility.readString();
							 Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(date);  
								FileReader file4 = new FileReader("Appointments.json");
								BufferedReader reader4 = new BufferedReader(file4);
								JSONParser parser4 = new JSONParser();
								//JSONObject jsobj = new JSONObject();
								 mainjsobj= (JSONObject) parser4.parse(reader4);
								 jsarrays = (JSONArray) mainjsobj.get("Appointement");
								 count++;
								jsobject.put("Count", count);
                                jsobject.put("Date", date2.toString());
                                jsarrays.add(jsobject);
                                mainjsobj.put("Appointement", jsarrays);
								 FileWriter writer = new FileWriter("Appointments.json");
								 writer.write( mainjsobj.toJSONString());
								 System.out.println("Succesfully take appointment.........!!!!!!!!");
								 writer.flush();
									 
								 }
						 }
						
					}
		
						
						 
					
						

		public static void printAppointment() throws IOException, ParseException
		{
        FileReader file1 = new FileReader("Appointments.json");
			
			JSONParser parser = new JSONParser();
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("Appointement");
			 
			 System.out.println("\tThe Appointement Details are as follows: ");
			 System.out.println();
			  String line;  
		
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 doctorname = (String) jsobject.get("DoctorName");
				 long NumberOfPatient =  (long) jsobject.get("Count");
				 date =  (String) jsobject.get("Date");
			
				
				 System.out.println("\t************* Appointement ***************");
				 System.out.println("\tDoctor Name:  " + doctorname);
				 System.out.println("\tNumber Of Patient:  "  + NumberOfPatient);
				 System.out.println("\tDoctor's Available Date:" + date);
				 
				 System.out.println("\t*****************************************");
				 System.out.println();
				
				 System.out.println();
				 
			
		}
		
		}//Clinic Management
		
		
		static String firstname;
		static String lastname;
		static String address;
		static String city;
		static String state;
		static long  zip;
		static long phonenumber;
		public static void addPersonDetails() throws IOException, ParseException
		{
			
			FileReader fileReader = new FileReader("AddressBook.json");
			JSONParser parser = new JSONParser();
			mainjsobj= (JSONObject) parser.parse(fileReader);
			jsarrays = (JSONArray) mainjsobj.get("AddressBook");
			System.out.println("Enter the first name:");
		    firstname = Utility.readString();
		    System.out.println("Enter the last name: ");
		    lastname = Utility.readString();
		    System.out.println("Enter the city: ");
		    city = Utility.readString();
		    System.out.println("Enter the state: ");
		    state = Utility.readString();
		    System.out.println("Enter the zipcode");
		    zip = Utility.readLong();
		    System.out.println("Enter the phone number: ");
		    phonenumber = Utility.readLong();
		    String mobilepattern = "(0/91)?[7-9][0-9]{9}";
		    boolean isValidMobile = Pattern.matches(mobilepattern,String.valueOf(phonenumber));  
		    if(isValidMobile==false)
		    {
		    	System.out.println("Please enter proper mobile number: ");
		    	phonenumber = Utility.readLong();
		    }
		    
			jsobject.put("FirstName", firstname);
			jsobject.put("LastName", lastname);
			jsobject.put("City",city);
			jsobject.put("State", state);
			jsobject.put("ZipCode", zip);
			jsobject.put("MobileNumber", phonenumber);
			
			
			jsarrays.add(jsobject);
			mainjsobj.put("AddressBook", jsarrays);
			
			FileWriter writer = new FileWriter("AddressBook.json");
			writer.write(mainjsobj.toJSONString());
			writer.flush();
			writer.close();
			
		}
		
		
		public static void editPersonDeatils()
		{
			FileReader fileReader = null;
			
			FileWriter fileWriter = null;

			
			try {
				System.out.println("Enter the name of person whose details you want to update:");
				 firstname = Utility.readString();
				fileReader = new FileReader("AddressBook.json");
				JSONParser parser = new JSONParser();
				mainjsobj= (JSONObject) parser.parse(fileReader);
				 jsarrays = (JSONArray) mainjsobj.get("AddressBook");
				
				boolean isExit = false;
				
				for(int i =0; i<jsarrays.size();i++)
				{
				jsobject = (JSONObject) jsarrays.get(i);
					if (jsobject.get("FirstName").equals(firstname)) {
						
						System.out.println(
								"select option what you want to edit:\n 1.City \n 3.State \n 3.Zip \n 4.MobileNumber \n 6.editAll");
						int choice = Utility.readInteger();
						switch (choice) {
						
						case 1:
							System.out.println("Enter the city you want to update");
							city = Utility.readString();
							jsobject.put("City",city);
							break;
						case 2:
							System.out.println("Enter the state you want to update");
						    state = Utility.readString();
						    jsobject.put("State", state);
							break;
						case 3:
							System.out.println("Enter the zipcode you want to update");
							zip = Utility.readLong();
							jsobject.put("ZipCode", zip);
							break;
						case 4:
							System.out.println("Enter the mobilenumber you want to update");
							phonenumber = Utility.readLong();
					        jsobject.put("MobileNumber", phonenumber);
							break;
						case 6:
							System.out.println("Enter All Details");
							
							System.out.println("Enter city");
							city = Utility.readString();
							jsobject.put("City",city);
							
							System.out.println("Enter city");
							 state = Utility.readString();
							 jsobject.put("State", state);
							 
							 System.out.println("Enter ZipCode");
							 zip = Utility.readLong();
							 jsobject.put("ZipCode", zip);
							 
							System.out.println("enter mobile number1");
							phonenumber = Utility.readLong();
					        jsobject.put("MobileNumber", phonenumber);
							break;
						default:
							System.out.println("Invalid Choice");

						}// switch
				        jsarrays.set(i, jsobject);
						mainjsobj.put("AddressBook", jsarrays);
						
						
						FileWriter writer = new FileWriter("AddressBook.json");
						writer.write(mainjsobj.toJSONString());
						writer.flush();
						writer.close();

						System.out.println("Person details has been updated");
						isExit = true;
						break;
					} //if

				}//for
				
				if (isExit == false)
				{
					System.out.println("Person not found in address book");
				}
			}
			catch (Exception e)
			{
				
             e.printStackTrace();
			}

		}
		
		
		
		 public static void deletePersonDetails() throws IOException, ParseException
		 {
				FileReader fileReader = new FileReader("AddressBook.json");
				JSONParser parser = new JSONParser();
				mainjsobj= (JSONObject) parser.parse(fileReader);
				jsarrays = (JSONArray) mainjsobj.get("AddressBook");
				System.out.println("Enter the first name of the person whose details you want to delete: ");
			    firstname = Utility.readString();
				
				boolean isExit = false;
				
				for(int i =0; i<jsarrays.size();i++)
				{
				jsobject = (JSONObject) jsarrays.get(i);
					if (jsobject.get("FirstName").equals(firstname))
					{
                          jsarrays.remove(jsobject);
                          System.out.println("Successfully Deleted...");
                          
						   isExit=true;
						   break;
					}
					}//for
				
				//JSARRAY.add(JSOBJ);
				mainjsobj.put("AddressBook", jsarrays);
				FileWriter writer = new FileWriter("AddressBook.json");
				writer.write(mainjsobj.toJSONString());
				writer.flush();
				writer.close();
				
				if(isExit==false)
				{
					System.out.println("Person not found ");
				}
			    
		 }
			
		
		public static void displayPersonDetails() throws IOException, ParseException
		{
          FileReader file1 = new FileReader("AddressBook.json");
			
			JSONParser parser = new JSONParser();
			
			 mainjsobj= (JSONObject) parser.parse(file1);
			 jsarrays = (JSONArray) mainjsobj.get("AddressBook");
			 
			 System.out.println("\tThe Doctor Details are as follows: ");
			  String line;  
			  int k=1;
			 for(int i = 0; i<jsarrays.size();i++)
			 {
				 jsobject = (JSONObject) jsarrays.get(i);
				 firstname = (String) jsobject.get("FirstName");
				 lastname =  (String) jsobject.get("LastName");
				 city =  (String) jsobject.get("City");
				 state =  (String) jsobject.get("State");
				 zip =  (long) jsobject.get("ZipCode");
				 phonenumber =  (long) jsobject.get("MobileNumber");
				
				 System.out.println("\t************* ADDRESSBOOK-"+k+" ***************");
				 System.out.println("\tFirst Name:\t" + firstname);
				 System.out.println("\tLast Name:\t"  + lastname);
				 System.out.println("\tCity:\t\t" + city);
				 System.out.println("\tState:\t\t" + state);
				 System.out.println("\tZipcode:\t" + zip);
				 System.out.println("\tMobile number:\t" + phonenumber);
				
				 System.out.println("\t***********************************************");
				 System.out.println();
				 System.out.println();
				 k = k+1;
			 }
		}
		
		
		
		
		//For multiple sorting we will use comparator interface
		
		
	
		public static void sortPersonDetails() throws IOException, ParseException
		{
			
			
			class sortDetailsbyname implements Comparator<Object>
			{	
				@Override
				public int compare(Object o1, Object o2) 
				{
					JSONObject jsobj1 = (JSONObject) o1;
					JSONObject jsobj2 = (JSONObject)o2;
					return ((String)jsobj1.get("FirstName")).compareTo((String)jsobj2.get("FirstName"));
					
				}	
			}
			
			class sortDeatilsbyZipcode implements Comparator<Object>
			{

				@Override
				public int compare(Object o1, Object o2) {
					JSONObject jsobj1 = (JSONObject) o1;
					JSONObject jsobj2 = (JSONObject)o2;
					return  (int) (((long)jsobj1.get("ZipCode")) -((long)jsobj2.get("ZipCode")));
				}	
			}
			
			  FileReader file1 = new FileReader("AddressBook.json");
				
				JSONParser parser = new JSONParser();
				
				 mainjsobj= (JSONObject) parser.parse(file1);
				 jsarrays = (JSONArray) mainjsobj.get("AddressBook");

			boolean check = true;
			do {
				System.out.println(
						"Sort according to \n 1.First Name \n 2.ZipCode  ");
				int choice = Utility.readInteger();
				switch (choice) {
				case 1:
					System.out.println("Sorting according to First Names: ");

					Collections.sort(jsarrays, new sortDetailsbyname());	

				
					Iterator nameIterator = jsarrays.iterator();

					while (nameIterator.hasNext()) {
						JSONObject json = (JSONObject) nameIterator.next();
						
						System.out.println("\t************* ADDRESSBOOK ***************");
						 System.out.println("\tFirst Name:\t" + json.get("FirstName"));
						 System.out.println("\tLast Name:\t"  + json.get("LastName"));
						 System.out.println("\tCity:\t\t" +json.get("City"));
						 System.out.println("\tState:\t\t" + json.get("State"));
						 System.out.println("\tZipcode:\t" + json.get("ZipCode"));
						 System.out.println("\tMobile number:\t" + json.get("MobileNumber"));
						
						 System.out.println("\t***********************************************");
						 System.out.println();
						 System.out.println();

					}
					break;
					
				case 2:
					System.out.println("Sorting according to Zip Code: ");

					Collections.sort(jsarrays, new sortDeatilsbyZipcode());	

				
					Iterator zipIterator = jsarrays.iterator();

					while (zipIterator.hasNext()) {
						JSONObject json = (JSONObject) zipIterator.next();
						System.out.println("\t************* ADDRESSBOOK ***************");
						 System.out.println("\tFirst Name:\t" + json.get("FirstName"));
						 System.out.println("\tLast Name:\t"  + json.get("LastName"));
						 System.out.println("\tCity:\t\t" +json.get("City"));
						 System.out.println("\tState:\t\t" + json.get("State"));
						 System.out.println("\tZipcode:\t" + json.get("ZipCode"));
						 System.out.println("\tMobile number:\t\t" + json.get("MobileNumber"));
						
						 System.out.println("\t***********************************************");
						 System.out.println();
						 System.out.println();
						

					}
					break;
				}
				System.out.println("Press Y to continue and N to stop ");
				String ch = Utility.readString().toLowerCase();
				if (ch.equals("y")) {
					check = true;
				} else {
					check = false;
				}
			} while (check);
			
		}//Adress book
		
		
	
		
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
			
		}//Deck Of Cards
		
		
		
		
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
				deckCards[random] 	= temp;
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
		}//Deck Of Cards Queue
		

}	 



		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

