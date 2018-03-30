package com.bridgelab.ObjectOrientedPrograms;

import com.bridgelab.Datastructure.MyQueue;
import com.bridgelab.Utility.Utility;

public class DeckOfCardsQueue {

	public static void main(String[] args) {
		System.out.println();
		int noOfPlayers = 4;
		int noOfCards = 9;
		Utility utility=new Utility();
		String[] deckOfCards = utility.assignDeckOfCards();
		String[] deckOfShuffleCards = utility.shuffle(deckOfCards);
		String[][] playerCards = utility.distribute(deckOfShuffleCards, noOfPlayers, noOfCards);
		System.out.println("Cards before sorting...");
		System.out.println();
		utility.printDistibutedCards(playerCards, noOfPlayers, noOfCards);
		System.out.println("Cards after sorting...");
		utility.printSortedCards(playerCards,noOfPlayers,noOfCards);
		
		
		
		
		

	}

}
