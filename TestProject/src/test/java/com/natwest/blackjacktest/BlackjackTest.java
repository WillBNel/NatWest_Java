package com.natwest.blackjacktest;

import com.natwest.blackjacktask.Blackjack;

public class BlackjackTest {

	public void dealerWinsTest() {
		int dealerNum = 10;
		int playerNum = 8;

		int expected = 10;
		int actual = Blackjack.play(dealerNum, playerNum);

		assertEquals(expected, actual);

		
	}

	private void assertEquals(int expected, int actual) {
		// TODO Auto-generated method stub
		
	}

}
