/**
   A Card class represents a playing card with a face 
   value and a suit.
   @author: Bae Sung
*/

public class Card
{
	public static final int CLUBS = 0;
	public static final int SPADES = 1;
	public static final int HEARTS = 2;
	public static final int DIAMONDS = 3;

  private final int face, suit;
   
   /**
    * Default constructor that creates a card with the given values
    * @param face - integer representing the value of the Card
    * @param suit - integer representing the suit of the Card 
    */
   public Card(int face, int suit)
   {
      this.face = face;
      this.suit = suit;
   }

   /** getFace method:
    * accessor method that returns the face value of the Card
    * @return an int, the face value of the Card
    */
   public int getFace()
   {

      return this.face; //EDIT THIS

   }

   public int getSuit() {

      return this.suit;

   }

   //ADD OTHER METHODS NEEDED
   public String toString() {

      String face = "", suit = "";

      if (this.face == 1) {
        face = "Ace";
      } else if (this.face == 11) {
        face = "Jack";
      } else if(this.face == 12) {
        face = "Queen";
      } else if(this.face == 13) {
        face = "King";
      } else {
        face = String.valueOf(this.face);
      }

      switch (this.suit) {

        case CLUBS:
          suit = "Clubs";
          break;
        case SPADES:
          suit = "Spades";
          break;
        case HEARTS:
          suit = "Hearts";
          break;
        case DIAMONDS:
          suit = "Diamonds";
          break;
    
      }

      return face + " of " + suit;
   }

}
