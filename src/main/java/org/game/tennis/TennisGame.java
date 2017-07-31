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

    private int playerWhoWon = -1;

    private String playerName = "";

    public TennisGame (Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    } /* END OF constructor */


  //This should return either 1 or 2 which specified which player won the game
  // 1 means player 1 won the game
  // 2 means player 2 won the game
  public int whoWon() {
    /*---- Local Variable Declares ----*/
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
    player1.setScore(player1PointsP);
    player2.setScore(player2PointsP);

    if (player1PointsP >0){
        logC.info(player1.getName() + " was awarded 1 point");
    } else{
        logC.info(player2.getName() + " was awarded 1 point");
    }

    checkWhoWon();

  } /* END OF playRound */

    public String getPlayerName(){

        return(playerName);
    }

    public void checkWhoWon(){

        if(player1.getScore() >=3 && player2.getScore() >=3){
            if(player1.getScore() == player2.getScore() + 2){
                playerWhoWon = 1;
                isGameOverI = true;
                playerName = player1.getName();

            }
        else if (player2.getScore() == player1.getScore() + 2){
                playerWhoWon = 2;
                isGameOverI = true;
                playerName = player2.getName();

            }

        }else{
            if(player1.getScore() == 4){
                playerWhoWon = 1;
                isGameOverI = true;
                playerName = player1.getName();

            }else if (player2.getScore() == 4){
                playerWhoWon = 2;
                isGameOverI = true;
                playerName = player2.getName();
            }

        }
    }
}

/* END OF class TennisGame */

/* END OF SOURCE FILE */

