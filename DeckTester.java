class DeckTester {

	public static void main (String[] args) {

		//Initializing
		DeckOfCards deck = new DeckOfCards();
		System.out.println("Printing the cards in the deck");
		System.out.println(deck.toString());
		System.out.println("There are " + deck.getCardCount() + " in the deck");

		//Shuffling
		deck.shuffle();
		System.out.println("Printing the cards in the deck after shuffling");
		System.out.println(deck.toString());
		System.out.println("There are " + deck.getCardCount() + " in the deck");

		//Deal cards
		for (int i = 0; i < 53; i++ ) {
			System.out.println(deck.deal());
			System.out.println("Card count of deck is " + deck.getCardCount());
		}

	}
	
}
