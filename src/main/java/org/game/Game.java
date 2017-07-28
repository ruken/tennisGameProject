package org.game;

import java.util.Random;
/** ***********************************************************************
**
** Interface that a game needs to implement.
**
** @author Erick Santos
**
** @version 1.0
**
***************************************************************************
*/
public interface Game {
  /*---- Class Variable Declares ----*/
  /*-------- Start of Code ----------*/
  
  //This should return either 1 or 2 which specified which player won the game
  // 1 means player 1 won the game
  // 2 means player 2 won the game
  public int whoWon();

  //This method returns true if the game has ended, which means someone has won
  //Should return false otherwise
  public boolean isGameOver();

  //This method takes in 2 parameters
  // player1Points is the amount of points awarded to player 1 for the round
  // player2Points is the amount of points awarded to player 2 for the round
  public void playRound(int player1PointsP, int player2PointsP);

} /* END OF class Game */

/* END OF SOURCE FILE */

