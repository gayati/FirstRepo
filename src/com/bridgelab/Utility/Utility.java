package com.bridgelab.Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Utility {
	static Scanner scanner = new Scanner(System.in);	;
	public static  int integerinput()
	{
		return scanner.nextInt();
	}
	public static String stringinput()
	{
		return scanner.next();
	}
	public static double doubleinput()
	{
		return scanner.nextDouble();
		
	}
	public static long longinput()
	{
		return scanner.nextLong();
		
	}
	public static boolean booleaninput()
	{
		return scanner.nextBoolean();
		
	}
		public static void flipcoin(int no_of_times)
		{
			
			int head=0;
			int tail=0;
			
			for(int i=0; i<=no_of_times; i++)
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

			double headpercent = head*100/no_of_times;
			double tailpercent = 100-headpercent;
			
			System.out.println("The percentage of head is----------" + headpercent);
			System.out.println("The percentage of tail is----------" + tailpercent);	
		}
		

	     public static void leapyear(String year)
	     {
		 int n = year.length();
	     int year1 = 0;
		 if(n==4)
	       {
	    	   year1 = Integer.parseInt(year);
	    	   Boolean isPrime = ((year1 % 4==0)|| (year1 % 100 ==0) || (year1 % 400 ==0));
	    	   if(isPrime)
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
	    
	    public static void powertwo(int number)
	    {
	    	int i;
	    	int num = 0;
			if(number<=31)
			{
			for( i=1;i<=number;i++)
			{
				num = (int) Math.pow(2, i);
				System.out.println(num);
				if(num%4==0)
				{
					System.out.println("Leap Year---->" + num);
				}
				else
				{
					System.out.println("Not Leap Year----->" + num);
				}
			
			}
				
			}
	    }
	 
       public static void harmonicseries(int number)
       {
    	double sum = 0.0;
   		for(int i=1;i<=number; i++)
   		{
   			sum = sum +(double) 1/i;	
   		}
   		System.out.println("The nth harmonic value is:" + sum);     
       }
       
       public static void primefactor(int number)
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
       
     
	public static void stringreplace(String inputstring) 
	{
		  String string = "Hello <<username>>, How are you ?";
   	      int strlength = inputstring.length();
          if(strlength>=3)
          {
          	System.out.println(string.replace("<<username>>", inputstring));
          }
          else
          {
          	System.out.println("Please enter username having atleast 3 characters");
          }
		
	}
       
	public static void couponumbers(int numbers)
	{
		int randomCount = 0;
		TreeSet al = new TreeSet<>();
		//ArrayList al = new ArrayList<>();
		for(int i=1;i<=numbers; i++ )
		{
			long randomNumber = Utility.generateRandomNumber();
			al.add(randomNumber);
			randomCount++;
//			if(al.contains(randomNumber))
//			{
//				randomCount++;
//			}
//			else
//			{
//				al.add(randomNumber);
//				randomCount++;
//			}
		}
		System.out.println(al);
		System.out.println(randomCount);
	}
       
       
       public static int generateRandomNumber()
       {
    	   Random random = new Random();
    	   random.nextInt(10000000);
    	   return random.nextInt(10000000);
       }
       
       public static void integerarray()
       {
    	    System.out.println("Enter the NUmber of rows for array:");
    		int rows = Utility.integerinput();
    		System.out.println("Enter the NUmber of columns for array:");
    		int columns = Utility.integerinput();
    	    int array[][] = new int[10][10];
    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	    for(int i=0;i<rows; i++)
    	    {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = Utility.integerinput();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
       }
       public static void doubleArray()
       {
    	    System.out.println("Enter the NUmber of rows for array:");
    		int rows = Utility.integerinput();
    		System.out.println("Enter the NUmber of columns for array:");
    		int columns = Utility.integerinput();
    	    double array[][] = new double[10][10];
    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	    for(int i=0;i<rows; i++)
    	    {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = Utility.doubleinput();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
       }
       public static void booleanArray()
       {
    	    System.out.println("Enter the NUmber of rows for array:");
    		int rows = Utility.integerinput();
    		System.out.println("Enter the NUmber of columns for array:");
    		int columns = Utility.integerinput();
    	    boolean array[][] = new boolean[rows][columns];
    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	    for(int i=0;i<rows; i++)
    	    {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = Utility.booleaninput();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
       }
       
      public static void arraytriplet(int size)
      {
    	  int i,j,k;
    	  boolean found = false;
    	  int[] arr = new int[size];
    	  int length = arr.length;
    	  System.out.println("Enter the array element");
    	  for( i=0;i<size;i++)
    	  {
    		  arr[i] = Utility.integerinput();
    	  }
    	  for(i=0;i<(length-2);i++)
    	  {
    		  for(j=i+1;j<(length-1);j++)
    		  {
    			  for(k=j+1;k<length;k++)
    			  {
    				  if(arr[i]+arr[j] + arr[k] ==0)
    				  {
    					  System.out.print(arr[i]);
    					  System.out.print(" ");
    					  System.out.print(arr[j]);
    					  System.out.print(" ");
    					  System.out.print(arr[k]);
    					  System.out.print("/n");
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
       
       
       public static void gambler(int stack,int goals,int no_of_times ) {
       
   		int wins = 0;
   		int loss =0;
   		double winpercent = 0.0;
   		double losspercent = 0.0;
   		
   	    if(stack>=0 && stack<=goals)
   	    {
   	    	for(int i=0; i<no_of_times; i++)
   	    	{
   	    	
   	    	if(Math.random()>0 && Math.random()<0.5)
   	    	{
   	    		loss++;
   	    	}
   	    	
   	    	else if(Math.random()>0.5 && Math.random()<1)
   	    	{
   	    		wins++;
   	    	}
   	    	}
   	    	System.out.println("The number of wins" + wins);
   	    	
   	    	winpercent = wins*100/no_of_times;
   	    	losspercent = 100-winpercent;
   	    	System.out.println("Wins Percentage:" + winpercent);
   	    	System.out.println("Loss Percentage:" + losspercent);
   	    }  
       }
       
       public static void distance(Double x,Double y)
       {
    	   double result =  Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
    	   System.out.println("The result is:" + result);
    	   
       }
       
       public static void stringpermutation(String string)
       {
    	   char arr[] = new char[0];
    	   
       }
       
       public static void windchill(double temperature,double velocity)
       {
    	   double windchill = 0.0;
    	   if(temperature<=50 && velocity<=120 && velocity>=3)
    	   {
    		   windchill = 35.75 + (0.6215*temperature)+(((0.427*temperature)-35.75)*Math.pow(velocity, 0.16));
    	   }
    	   System.out.println("The windchill is as follows:" + windchill);
       }
       
       
       public static void quadratic(double a, double b, double c)
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
       
       
       
       public static void permute(String inputstring,int first, int last)
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
    		   Utility.permute(inputstring, first +1, last);//control check
    		   inputstring = Utility.swap(inputstring,first,i);	   
    		   }
    	   }
    	   
       }
       
       public static String swap(String inputstring,int first,int i)
       {
    	   char temp;
    	   char arr[] = inputstring.toCharArray();
    	   temp = arr[first];
    	   arr[first] = arr[i];
    	   arr[i] = temp;
		   return String.valueOf(arr);
    	   
       }
       
       
       
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
       
        public static void primenumbers()
        { 
        	int i;
            int j;
            int flag = 0;
            ArrayList<String> al = new ArrayList<String>();
            al.add(Integer.toString(2));
            al.add(Integer.toString(3));
           for(i=1;i<=1000; i++)
           {
        	 for(j=2;j<=i/2;j++)
        	 {
        		 if(i%j==0)
        		 {
        			 flag = 0;
        			 break;
        			 
        		 }
        		 flag=1;
        		 
        	 }
        	 if(flag==1)
        	 {
               al.add(Integer.toString(i));
        	 }
        	 
         }
       
        for(String s:al)
        {
        System.out.println(s);	
        }
        
           int n =al.size() ;
           String[] liststring = new String[n];
           liststring = al.toArray(liststring);
         
           System.out.println();
           System.out.println();
           System.out.println("The primeanagram are as follows:");
           for(i=0;i<n ; i++)
           {
        	   for(j=i+1;j<n; j++)
        	   {
        		   if(isAnagram(liststring[i],liststring[j]))
        			   System.out.println(liststring[i]+"-->"+liststring[j]);
        	   }
           }
           
           System.out.println();
           System.out.println();
           System.out.println("The prime numbers which are palindrome are as follows:");
           for(i=0;i<n ; i++)
           {
        	   if(isPalindrome(liststring[i]))
        	   {
        		   System.out.println(liststring[i]);
        	   }
           }
           
           
        }
        
       
        public static boolean isPalindrome(String str)
        {
        	String rev = "";
        	
        	int length = str.length();
        
            for ( int i = length - 1; i >= 0; i--)
            {
               rev = rev + str.charAt(i);
              
            }
            boolean flag = str.equals(rev);
            if(flag==true)
            {
            return flag;
            }
			return false;
            
        }
        
       public static long startTime = 0;
       public static long stopTime = 0;
       
       public static void start()
       {
    	   startTime = System.currentTimeMillis();
       }
       
       
       public static void stop()
       {
    	   stopTime = System.currentTimeMillis();
       }
       
        public static void getElapsedtime()
        {
        	long elapsedTime = (stopTime - startTime)/1000;
        	System.out.println("The elapsed time is:" + elapsedTime +"sec");
        }
        
        public static Integer[] integerarrayInput()
        {   
        	
        	System.out.println("Enter the length of array :");
        	int length = Utility.integerinput();
        	Integer[] array = new Integer[length];
        	System.out.println("Enter the elemnts in the array:");
        	
        	for(int i=0;i<=length-1;i++)
        	{
        		array[i] = Utility.integerinput();
        	}
        	System.out.println();
			return array;
        }
        
        public static String[] stringarrayInput()
        {   
        	System.out.println("Enter the length of array :");
        	int length = Utility.integerinput();
        	String[] array = new String[length];
        	System.out.println("Enter the elements in the array:");
        	
        	for(int i=0;i<=length-1;i++)
        	{
        		array[i] = Utility.stringinput();
        	}
			return array;
        }
        
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
			
			 for(T k : array){
		            System.out.print(k + "  ");
		       
		        
		    }
			 System.out.println();
			
		}
		
		public static <T extends Comparable<T>> void insertionSort (T[] array, int length) 
		  {
		    int i, j;
		    T temp;
		    for (i= 1; i< length; i++)
		    {
		      temp = array[i];
		      for (j = i; j > 0 && array[j- 1].compareTo(temp) > 0; j--)
		      {
		        array[j] = array[j - 1];
		      }
		      array[j] = temp;
		    }
		    
		    for(T k : array)
		    {
	            System.out.print(k + " ");        
	        } 
		    System.out.println();
		  }
		
		public static <T> void printArray(T[] array)
		{
			for(T t: array)
			{
				System.out.print(t);
			}	
		}
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
		
		
		
		
		
		
		public static void temperatureConversionCelsiusToFahrenheit() 
		{
			System.out.print("Enter the temperature in Celsius:");
		    double celsiusT = Utility.doubleinput();
			double fahrenheitT = (celsiusT * 9/5) + 32;
			System.out.print("The temperaure value in Fahrenheit will be:" + fahrenheitT);
		}
		
		public static void temperatureConversionFahrenheitToCelciue()
		{
			System.out.print("Enter the temperature in Fahrenheit:");
		    double fahrenheitT = Utility.doubleinput();
			double celsiusT = (fahrenheitT - 32) * 5/9;
			System.out.print("The temperaure value in Celsius will be:" + celsiusT);
		}
		
		
		
		public static void monthlypayment(double principal,double rateofinterset,double year )
		{
			 double n = 12*year;
			 double r = rateofinterset/(12*100);
			 double payment = (principal*r)/(1-(Math.pow((1+r), -n)));
			 System.out.println("The compound interest will be:" + payment);
			 
		}
		
		public static void toBinary(int decimal)
		{ 
			
			System.out.println("Enter the number of bits:");
			int numberofbits = Utility.integerinput();
			
			
			int[] binary = new int[32];
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
		
		
		
		public static void squrt(double number)
		{
		    double number1 = number;
			double epsilon = 1E-15;
			while(Math.abs(number1-number/number1) > epsilon*number1)
			{
				number1 = (number/number1+ number1)/2.0;

			}
			System.out.println(number1);

		}
		
        public static void swapnibbles(int decimal)
        {
        	System.out.println("Enter the number of bits:");
        	int numberofbeats = Utility.integerinput();
        	int binary[]  = new int[ numberofbeats];
        	int index = 0;
        	while(numberofbeats>0)
        	{
        		binary[index++] = decimal%2;
        		decimal = decimal/2;
        		numberofbeats--;
        	}
        	System.out.println();

        	String s ="";
        	for(int i=index-1;i>=0;i--)
        	{
               s += binary[i];
        	}
        	System.out.println(s);
        	int length = s.length();
        	String string1 = s.substring(0, length/2);
        	String string2 = s.substring(length/2, length);
        	String string3 = string2 + string1;
        	System.out.println(string3);
        	int decimalnumber = Integer.parseInt(string3,2);
        	System.out.println(decimalnumber);
        }
		
		public static int search(int low, int high)
		{
			if((high-low) == 0)
			
				return high;
			
			int mid = (high + low)/2;
			System.out.println("Is your number between" + " "+low + " "+"to" +" "+ mid +"?(true/false)");
		    boolean	yes = Utility.booleaninput();
			if(yes)
			{
				return search(low, mid);

			}
			
	        else
			{
				return search(mid+1 , high);
			
			}
			
			
			
		}
		
		
		public static void dayOfweek(int day,int month,int year)
		{
	
			int y = year - (14 - month) / 12;
			int x = y + y/4 - y/100 + y /400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d= (day + x + 31*m/ 12) %7;
			System.out.println("Date is:- " + day+"/"+month+"/"+year);
			if(d==0)
			{
				System.out.println("Week day is : sunday");
			}
			if(d==1)
			{
				System.out.println("Week day is : monday");
			}
			if(d==2)
			{
				System.out.println("Week day is : tuesday");
			}
			if(d==3)
			{
				System.out.println("Week day is :wednesday");
			}
			if(d==4)
			{
				System.out.println("Week day is : thursday");
			}
			if(d==5)
			{
				System.out.println("Week day is : friday");
			}
			if(d==6)
			{
				System.out.println("Week day is : saturday");
			}
			
		}
		
		
		
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
      
}
