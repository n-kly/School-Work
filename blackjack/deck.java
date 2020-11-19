import java.util.Random;

public class deck{
card[] deckOfCards;

  public deck(){ // Constructor
    deckOfCards = new card[52]; // Creates an array of objects

    for (int i = 1; i <= 4; i++){ // loop for each suit
      for (int z = 1; z <= 13; z++){ // loop for each value
        deckOfCards[((z+(13*(i-1))-1))] = new card(i, z);
      }
    }
  }

  public void shuffle(){ // Shuffle a deck
    for(int i = (deckOfCards.length-1); i >= 0; i--){
      Random randy = new Random();
      int rand = randy.nextInt(52);

      // Swapping algorithim
      card temp = deckOfCards[rand];
      deckOfCards[rand] = deckOfCards[i];
      deckOfCards[i] = temp;
    }
  }

  public card getCard(int i){ // Gets a object card from within object deck
      card theCard = deckOfCards[i];
    return theCard;
  }
}
