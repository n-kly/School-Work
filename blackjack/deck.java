import java.util.Random;

public class deck{
card[] deckOfCards;

  public deck(){
    deckOfCards = new card[52]; // Creates an array of objects

    for (int i = 1; i <= 4; i++){ // loop for each suit
      for (int z = 1; z <= 13; z++){ // loop for each strValue
        deckOfCards[((z+(13*(i-1))-1))] = new card(i, z);
      }
    }
  }

  public void shuffle(){
    for(int i = (deckOfCards.length-1); i >= 0; i--){
      Random randy = new Random();

      int rand = randy.nextInt(52);
      card temp = deckOfCards[i];
      deckOfCards[rand] = deckOfCards[i];
      deckOfCards[i] = temp;
    }
  }

  public card getCard(int i){
      card theCard = deckOfCards[i];
    return theCard;
  }
}
