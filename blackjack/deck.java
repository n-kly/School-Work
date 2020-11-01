import java.util.*;

public class deck{
  public static void main(String[] args){
    card deckOfCards[] = new card[52]; // Creates array storing object

    for (int i = 1; i <= 4; i++){ // loop for each suit
      for (int z = 1; z <= 13; z++){ // loop for each strValue
        deckOfCards[((z+(13*(i-1))-1))] = new card(i, z);
      }
    }
    for (int i = 0; i < 52; i++){
      deckOfCards[i].display();
    }

    Collections.shuffle(deckOfCards);

    for (int i = 0; i < 52; i++){
      deckOfCards[i].display();
    }
  }
}
