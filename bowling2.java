import java.util.Scanner;
public class bowling2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Ten-Pin Bowling");
		System.out.println("");

		int PtotalRoundScore = 0; int gameScore = 0; int strikeCount = 0; int spareCount; int roundScore; int tempRound; int spareAgain = 1;
		for (int i = 0; i < 11; i ++){
			System.out.println("Round " + i);
			roundScore = 0;

			for (int z = 1; z < 3; z++){
				System.out.print("Score for turn " + z + ": ");
				int ballScore = keyboard.nextInt();
				roundScore = roundScore + ballScore;

        if (ballScore == 10){
          strikeCount ++;
          System.out.println("STRIKE");
          break;
        }

        if ((spareCount >= 1) && (spareAgain == 1)){
          gameScore = gameScore + ballScore;
          if (strikeCount >= 1){
              spareAgain = 0;

          }else if (strikeCount == 0){
            spareCount = 0;
          }
        }

        for (strikeCount = strikeCount; strikeCount > 0; strikeCount--){
          gameScore = gameScore + tempRound;

          if (strikeCount >= 1){
            tempRound = tempRound + 10;
          }

          if ((strikeCount == 1) && (spareCount == 1)){
            gameScore = gameScore + (tempRound-10);
            spareCount = 0;
            spareAgain = 1;
          }
        }

      strikeCount = 0;
      }

      if ((roundScore == 10) && (ballScore != 10)){
        spareCount ++;
        System.out.println("SPARE");
      }
      gameScore = gameScore + roundScore;

      if (strikeCount == 3){
        System.out.println("TURKEY");
      }

      tempRound = roundScore;

  		System.out.println("Score: " + gameScore);
  		System.out.println("");
		}
	}
}
