import java.util.*;

public class game {
  public static void main(String[] args){
    int index = 0;
    int playerTotal = 0;
    int dealerTotal = 0;

    deck deckOfCards = new deck(); // Creates deck
    deckOfCards.shuffle(); // Shuffles deck

    System.out.println("Your Cards: ");
    deckOfCards.getCard(index).display();
    playerTotal = playerTotal + deckOfCards.getCard(index).getValue(); index ++;

    deckOfCards.getCard(index).display();
    playerTotal = playerTotal + deckOfCards.getCard(index).getValue(); index ++;
    System.out.println("Total: " + playerTotal);
    System.out.println("------------");
    System.out.println("")
    System.out.println("Dealers Cards: ")
    deckOfCards.getCard(index).display();


  }
}