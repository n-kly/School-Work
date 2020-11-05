import java.util.*;

public class game {
  public static void main(String[] args){
    deck deckOfCards = new deck();

    for (int i = 0; i < 52; i++){
    deckOfCards.getCard(i).display();
    }

    deckOfCards.shuffle();

    for (int i = 0; i < 52; i++){
      deckOfCards.getCard(i).display();
    }
  }
}

