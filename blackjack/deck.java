import java.util.*;

public class deck{
  card[] deck;
  int length;

  public deck(){
    deck = new card[52]; // Creates array storing object

    for (int i = 1; i <= 4; i++){ // loop for each suit
      for (int z = 1; z <= 13; z++){ // loop for each strValue
        deck[((z+(13*(i-1))-1))] = new card(i, z);
      }
    }
  }

  public card getCard(int i){
      card theCard = deck[i];
    return theCard;
  }
}
