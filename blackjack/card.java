import java.util.*;

class card{
    int suit;
    int value;
    String strValue;
    String strSuit;

    public card(int suit, int value){ // Constructor
      this.suit = suit;
      this.value = value;
    }

    public void display(){ // Display
      switch(this.value){
        case 11: strValue = "Jack"; break;
        case 12: strValue = "Queen"; break;
        case 13: strValue = "King"; break;
        case 1: strValue = "Ace"; break;
        default: strValue = Integer.toString(this.value);
      }

      switch(this.suit){
          case 1: strSuit = "Hearts"; break;
          case 2: strSuit = "Spades"; break;
          case 3: strSuit = "Clubs"; break;
          case 4: strSuit = "Diamonds"; break;
      }

      System.out.println(strValue + " of " + strSuit);
    }
  }