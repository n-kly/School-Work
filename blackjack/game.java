import java.util.*;

public class game {
  static int total;

  public static int handTotal(ArrayList<Integer> hand, deck deckOfCards, int x){ // Displays and gets total of a hand
    total = 0;
    for (int i = x; i>=0; i--){ // Loops through entire hand
      deckOfCards.getCard(hand.get(i)).display(); // Displays the card
      total = total + deckOfCards.getCard(hand.get(i)).getValue(); // Running total of hand
    }
    System.out.println("Total: "+total);
    return total;
  }

  public static void main(String[] args){
    // Declare variables
    int index;
    int pTotal;
    int dTotal;
    ArrayList<Integer> playerHand;
    ArrayList<Integer> dealerHand;
    deck deckOfCards;
    int win;
    String nextRound;
    String again = "Y";
    Scanner newDraw = new Scanner(System.in);

    do{
      // Assign variables
      index = 0;
      pTotal = 0;
      dTotal = 0;
      playerHand = new ArrayList<Integer>();
      dealerHand = new ArrayList<Integer>();
      win = 0;
      nextRound = "H";

      // Make new deck and shuffle it
      deckOfCards = new deck();
      deckOfCards.shuffle();

      System.out.println("----------------------");
      System.out.println("Your hand: ");
      for (int i = 0; i < 2; i++){ // Gives the player 2 cards
        playerHand.add(index); index++;
      }
      pTotal = handTotal(playerHand, deckOfCards, (playerHand.size()-1));
      System.out.println("----------------------");

      System.out.println("----------------------");
      System.out.println("Dealers hand: ");
      for (int i = 0; i < 2; i++){ // Gives the dealer 2 cards
        dealerHand.add(index); index++;
      }
      dTotal = handTotal(dealerHand, deckOfCards, (dealerHand.size()-1));
      System.out.println("----------------------");

      do{
        if (dTotal > 21){ // Checks if dealer is bust
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
          System.out.println("DEALER: BUST");
          win = 1;

        } else if (pTotal > 21){ // Checks if player is bust
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
          System.out.println("PLAYER: BUST");
          win = 2;

        } else if (nextRound.equals("H")){ // Checks if player has stood
          do{
            System.out.println("??????????????????????");
            System.out.print("Hit or Stand? (H/S): ");
            nextRound = newDraw.nextLine();
            System.out.println("??????????????????????");

            if (nextRound.equals("H")){
              playerHand.add(index); index++; // Gives player card
              System.out.println("----------------------");
              System.out.println("Your hand: ");
              pTotal = handTotal(playerHand, deckOfCards, (playerHand.size()-1));
              System.out.println("----------------------");
            }

          }while(nextRound.equals("H") && pTotal <= 21); // Run while player is hitting and not bust
          if (pTotal > 21){ // Check if player went bust after hitting
            continue;
          } else{
            while (dTotal <= pTotal){ // Dealer draws cards until their total is greater than the players
              dealerHand.add(index); index++; // Gives dealer card
              System.out.println("----------------------");
              System.out.println("Dealers hand: ");
              dTotal = handTotal(dealerHand, deckOfCards, (dealerHand.size()-1));
              System.out.println("----------------------");
            }
          }
        } else{
          win = 2;
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
          System.out.println("DEALER > PLAYER");
        }
      }while(win == 0); // Checks if anyone has won
      if (win == 1){ // Check if player won
        System.out.println("PLAYER: WIN");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
      } else if (win == 2){ // Check if dealer won
        System.out.println("DEALER: WIN");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
      }

      System.out.print("Again? (Y/N)"); // Ask to play again
      again = newDraw.nextLine();
    }while(again.equals("Y")); // Checks if they want to play again
  }
}