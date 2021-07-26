package com.natwest.enums;

import java.util.Random;

public class Dealer {

	Random rand = new Random();

	private Card card;

	public Dealer(Card card) {
		this.card = card;

	}

	public Card getCard() {
		return card;

	}

	public Card deal() {
		System.out.println(Rank.values().length);
		System.out.println((Suit.values().length));
		return new Card(Rank.values()[rand.nextInt(Rank.values().length)],
				Suit.values()[rand.nextInt(Suit.values().length)]);

	}
}