import java.util.*;

public class card{
  int suit;
  int value;
  String strValue;
  String strSuit;

  public card(int suit, int value){
    this.suit = suit;
    this.value = value;
  }

  public static void shuffle(card[] array){
    for(int i = (array.length -1); i>0; i--){
      int rand = random.nextInt(array.length);
      card temp = array[rand];
      array[rand] = array[i];
      ar[i] = temp;
    }
  }

  public void display(){
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
