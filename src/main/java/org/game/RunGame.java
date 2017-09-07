package org.game;

import org.game.tennis.Player;
import org.game.tennis.TennisGame;

import org.apache.log4j.Logger;
import java.util.Random;
/** ***********************************************************************
**
** Class to run the tennis game.
**

** @version 1.0
**
***************************************************************************
*/
public class RunGame {
  /*---- Class Variable Declares ----*/
  private final static Logger logC = Logger.getLogger(RunGame.class);
  /*-------- Start of Code ----------*/

  public static void main (String[] Pargs) {
  /*---- Local Variable Declares ----*/
  Game   gameT          = new TennisGame(new Player("Kevin"), new Player("Dorothy"));
  Random randomPointsT  = new Random();
  int    player1PointsT = 0;
  int    player2PointsT = 0;
  int    pointsT        = -1;
  /*-------- Start of Code ----------*/
    // This is an infinite loop, runs until the game is over.
    for(int roundT=1; !gameT.isGameOver(); roundT++) {
      logC.info("Round "+roundT);

      //The random number generator generates either a 0 or a 1
      //If it generates a 0 that means player 1 is awarded points
      if (randomPointsT.nextInt(2) == 0) {
        gameT.playRound(1, 0);
        continue;
      } /*endif*/

      //If it generates a 1 that means player 2 is awarded points
      gameT.playRound(0, 1);

    } /*endwhile*/

    //If we got here then the game is over..print out who won
    logC.info("GAME OVER, Player "+gameT.whoWon() + ", " + gameT.getPlayerName() + " won!");

  } /* END OF main */
  
} /* END OF class RunGame */

/* END OF SOURCE FILE */

