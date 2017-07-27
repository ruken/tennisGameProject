/**
 * Created by ruken on 7/14/17.
 */

package tennisGameSourceCode;

public class TennisGame {

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

}

/* END OF class TennisGame */

/* END OF SOURCE FILE */

