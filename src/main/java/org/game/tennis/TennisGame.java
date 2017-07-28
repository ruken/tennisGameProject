/**
 * Created by ruken on 7/14/17.
 */

package org.game.tennis;

import org.game.Game;
import org.apache.log4j.Logger;

public class TennisGame implements Game {

    private static final Logger logC = Logger.getLogger(Game.class);
    private boolean isGameOverI = false;
    private Player player1;
    private Player player2;

    public TennisGame (Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    } /* END OF constructor */

    Player p1 = new Player();
    Player p2 = new Player();
  /*creation of 2 instances of Player object*/


    //when Player1 gets a score of 4 AND is 2 points over Player2, Player1 has won the game
    public int wonGame(){
        MB: {
            //If we go in here that means both the scores are 3 or more so now
            //A player can only win if they have 2 more than the other guy.
            if (p1.getScore() >= 3 && p2.getScore() >= 3) {
                winningByTwo(p1.getScore(), p2.getScore());

            } else if (p1.getScore() == 4) {

                return p1.getScore();

            } else if (p2.getScore() == 4) {

                return p2.getScore();
            }

        } /*endMB*/

        return 0;

    } /* END OF wonGame */

    //This method returns the players score whose winning by 2
    //If neither player is winning by 2, return 0
    //This method has 2 parameters which are player 1's score and player 2's score


    public int winningByTwo(int score1, int score2){
        if (score1 == score2 + 2){
            return score1;
        } else if (score2 == score1 +2) {

            return score2;

        } else {
            return 0;
        }


    }

  //This should return either 1 or 2 which specified which player won the game
  // 1 means player 1 won the game
  // 2 means player 2 won the game
  public int whoWon() {
    /*---- Local Variable Declares ----*/
    int playerWhoWon = -1;
    /*-------- Start of Code ----------*/
    return(playerWhoWon);

  } /* END OF whoWon */

  //This method returns true if the game has ended, which means someone has won
  //Should return false otherwise
  public boolean isGameOver() {
    /*---- Local Variable Declares ----*/
    /*-------- Start of Code ----------*/

    return(isGameOverI);

  } /* END OF is GameOver */

  //This method takes in 2 parameters
  // player1Points is the amount of points awarded to player 1 for the round
  // player2Points is the amount of points awarded to player 2 for the round
  public void playRound(int player1PointsP, int player2PointsP) {
    /*---- Local Variable Declares ----*/
    /*-------- Start of Code ----------*/

  } /* END OF playRound */
}

/* END OF class TennisGame */

/* END OF SOURCE FILE */

