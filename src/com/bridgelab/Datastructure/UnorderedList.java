/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;



import java.io.FileNotFoundException;

import com.bridgelab.Utility.Utility;

public class UnorderedList
{

	public static void main(String[] args)
	{
        MyLinkedList<String> list = new MyLinkedList<String>();
        
        String filepath = "/home/bridgeit/Documents/Gayatri/JavaProgrammes/file/myfile.txt";
        String stringarray[] = Utility.readFile(filepath);
        for(int i=0; i<stringarray.length; i++)
        {
        	list.insert(stringarray[i]);
        }
        list.show();
        int size = list.size();
        System.out.println("Enter the word to search:");
        String word = Utility.readString();
        
        int index = list.indexOf(word);
              
		boolean flag = list.search(list.head, word);
        
        if(flag==true)
        {
        	System.out.println("Word Found");
        	list.deleteAt(index);
        }
        else
        {
         System.out.println("Word Not found");
         list.insert(word);
        }
        
        
        
        Utility.writeFile(filepath, list);
        

	}

}
