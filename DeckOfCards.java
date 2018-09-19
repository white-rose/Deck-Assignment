/**
 * Deck of cards that has a collection
 * of 52 Card objects.
 * @author: Bae Sung
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.*; 

public class DeckOfCards 
{

  private Stack<Card> deck = new Stack<Card>();
  private int cardCount;

   /**
     * Dafault constructor:
     * Constructor creates 52 Card objects and 
     * initializes each appropriately. No two cards are the same.
     */
   public DeckOfCards()
   {

      while (cardCount < 51) {
        for (int suitValue = 0; suitValue < 4; suitValue++) {
            for (int faceValue = 1; faceValue < 14; faceValue++) {
                deck.push(new Card(faceValue, suitValue));
                cardCount++;
            }
        }
      } 

   }
   
   /** 
    * Shuffle method:
    * randomizes the order of the  stored 52 cards
    */
   public void shuffle()
   {
      Collections.shuffle(Arrays.asList(deck));
   }

   public Card deal() 
   {
      if (!deck.isEmpty()) {
        cardCount--;
        return deck.pop();
      } else {
        System.out.println("The deck is empty");
        return null;
      }
   }

   int getCardCount() 
   {  
      return cardCount;
   }

   /** 
    * toString method:
    * @overrides toString method to display all 52 cards
    */
   public String toString()
   {
      StringBuilder stringBuilder = new StringBuilder();
      for (Card card : deck) {
        stringBuilder.append(card.toString());
        stringBuilder.append("\n");
      }

      return stringBuilder.toString();
   }

}
