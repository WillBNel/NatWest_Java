package com.natwest.enums;

public class Runner {

	public static void main(String[] args) {

		Card card = new Card(Rank.SEVEN, Suit.DIAMONDS);

		Dealer d = new Dealer(card);
		System.out.println(d.getCard());
		System.out.println(d.deal());
		


	}

}
