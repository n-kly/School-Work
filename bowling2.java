import java.util.Scanner;
public class bowling2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Ten-Pin Bowling");
		System.out.println("");

	  int gameScore = 0; int roundScore = 0; int ballScore = 0; int b1Score = 0; int b2Score = 0;
		boolean spareCount = false;
		boolean strikeCount = false; boolean strikeStreak = false; boolean halfStrike = false; boolean doubleStrike = false;
		for (int i = 1; i < 11; i ++){ // Loop for every round
			System.out.println("Round " + i);
			roundScore = 0;
			b1Score = 0; b2Score = 0;

			for (int z = 1; z < 3; z++){ // Loop for every turn
				System.out.print("Score for turn " + z + ": ");
				ballScore = keyboard.nextInt();
				if (z == 1){ // Gets first ball of each turn
					b1Score = ballScore;
				} else if (z == 2 ){ // Gets second ball
					b2Score = ballScore;
				}

				if (ballScore == 10){ // Detect Strike
						 strikeCount = true;
						 System.out.println("STRIKE");
						 break;
				}
			}
			roundScore = b1Score + b2Score; // Gets total score of the round

			if (halfStrike == true || strikeStreak == true || strikeCount == true){ // Checks if there is any pending strike that needs to be taken care of
				if (halfStrike == true && strikeStreak == true && strikeCount == true){ // Identify turkey
					System.out.println("TURKEY");
				}
				// Strike stuff
				if (halfStrike == true) { // Checks for a half strike
					gameScore = gameScore + b1Score;
					halfStrike = false;
				}

				if (strikeStreak == true){ // Identify old strike
					if (strikeCount == true){ // Identify half strike
						gameScore = gameScore + 10;
						halfStrike = true;
						strikeStreak = false;

					} else{ // Checks for full strike
						gameScore = gameScore + b1Score + b2Score;
						gameScore = gameScore + roundScore;
						strikeStreak = false;
					}
				}

				if(strikeCount == true){ // Identify new strike
					gameScore = gameScore + 10;
					strikeStreak = true;
					strikeCount = false;
				}

			// Spare stuff
		} else if(spareCount == true || roundScore == 10 && b1Score !=10){ // Checks if there was a spare
				if (spareCount == true){ // Check for spare
				gameScore = gameScore + b1Score;
				gameScore = gameScore + roundScore;
				spareCount = false;

			} else if (roundScore == 10 && b1Score != 10){ // Identify spare
				spareCount = true;
				gameScore = gameScore + 10;
				System.out.println("SPARE");
			}

		}	else{ // Default scoring if nothing speical is happening
				gameScore = gameScore + roundScore;
			}

			// Special round 10 stuff
			if (i == 10 && spareCount == true){ // Identify remaining spare
				System.out.println("");
				System.out.println("BONUS: Score for round 11: ");
				System.out.print("BONUS: Score for final turn: ");
				ballScore = keyboard.nextInt();

				gameScore = gameScore + (ballScore)*2;
			} else if(i == 10 && strikeStreak == true){ // Identify remaining full strike (//Manually input the scores because im too tired)
				System.out.println("");
				System.out.println("BONUS: Round 11");
				System.out.print("BONUS: Score for turn 1: ");
				b1Score = keyboard.nextInt();
				System.out.print("BONUS: Score for turn 2: ");
				b2Score = keyboard.nextInt();
				if (halfStrike == true){
					gameScore = gameScore + b1Score;
					halfStrike = false;
				}
				gameScore = gameScore + (b1Score + b2Score)*2;
			}

  		System.out.println("Score: " + gameScore);
  		System.out.println("");
		}
	}
}
