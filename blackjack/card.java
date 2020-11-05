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
        case 11: strValue = "J"; break;
        case 12: strValue = "Q"; break;
        case 13: strValue = "K"; break;
        case 1: strValue = "A"; break;
        default: strValue = Integer.toString(this.value);
      }

      switch(this.suit){
          case 1: strSuit = "HEART"; break;
          case 2: strSuit = "SUITS"; break;
          case 3: strSuit = "CLUBS"; break;
          case 4: strSuit = "DIAMO"; break;
      }

      System.out.println(strSuit+" "+strValue);
    }

    public int getValue(){
      return value;
    }
  }