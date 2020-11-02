import java.util.*;

public class game {
  public static void main(String[] args){
    deck deckOfCards = new deck();

    for (int i = 1; i < 52; i++){
    deckOfCards.getCard(i).display();
    }
  }
}

