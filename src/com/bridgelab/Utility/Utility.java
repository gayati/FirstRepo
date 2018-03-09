package com.bridgelab.Utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner scanner = new Scanner(System.in);	;
//	public Utility() 
//	{
//	 scanner = new Scanner(System.in);	
//	}
	
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

			double tailpercent = head*100/no_of_times;
			double headpercent = 100-tailpercent;
			
			System.out.println("The percentage of head is----------" + headpercent);
			System.out.println("The percentage of tail is----------" + tailpercent);	
		}
		

	     public void leapyear(String year)
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
       
     
	public void stringreplace(String inputstring) 
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
		ArrayList al = new ArrayList();
		for(int i=1;i<=numbers; i++ )
		{
			long randomNumber = Utility.generateRandomNumber();
			if(al.contains(randomNumber))
			{
				randomCount++;
			}
			else
			{
				al.add(randomNumber);
				randomCount++;
			}
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
       
       public static void twodarray(int rows,int columns)
       {
    	   int array[][] = new int[10][10];
    	   System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = scanner.nextInt();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  //pw.flush();
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
//    	   else if(delta=0)
//    	   {
//    		   System.out.println("Roots are equal");
//    	   }
//    	   else
//    	   {
//    		   
//    	   }
    	   
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
    	  // boolean status= false;
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
       
//    	  
    	   
       }
       
        public static void primenumbers()
        { 
        	int i;
            int j;
            int flag = 0;
            ArrayList<String> al = new ArrayList<String>();
            al.add(Integer.toString(2));
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
       
//        for(int s:al)
//        {
//        System.out.println(s);	
//        }
//        }
           int n =al.size() ;
           String[] liststring = new String[n];
           liststring = al.toArray(liststring);
         
           
           for(i=0;i<n ; i++)
           {
        	   for(j=i+1;j<n; j++)
        	   {
        		   if(isAnagram(liststring[i],liststring[j]))
        			   System.out.println(liststring[i]+"-->"+liststring[j]);
        	   }
           }
           
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
        	 //System.out.println("Hello");
        
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
        
       
       
       
       
       
       
       
       
}
