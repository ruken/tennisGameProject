package org.game;

import org.game.tennis.Player;
import org.game.tennis.TennisGame;

import org.apache.log4j.Logger;
import java.util.Random;
/** ***********************************************************************
**
** Class to run the tennis game.
**
** @author Erick Santos
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
  Game   gameT          = new TennisGame(new Player(), new Player());
  Random randomPointsT  = new Random();
  int    player1PointsT = 0;
  int    player2PointsT = 0;
  int    pointsT        = -1;
  /*-------- Start of Code ----------*/
  
    logC.info("GAME OVER, Player "+gameT.whoWon()+" won!");

  } /* END OF main */
  
} /* END OF class RunGame */

/* END OF SOURCE FILE */

