/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.ObjectOrientedPrograms;

import com.bridgelab.Utility.Utility;

public class DeckofCards {

	public static void main(String[] args) 
	{
		
		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		String[] deck = Utility.deckOfCards(SUITS, RANKS);

		String[] shuffleCards = Utility.shuffleCards(deck);

		System.out.println("Enter the number of Cards:");
		int number = Utility.readInteger();
		System.out.println("Enter the number of players: ");
	    int player = Utility.readInteger();
	    
	    Utility.printCards(shuffleCards, player, number);

	}

}
