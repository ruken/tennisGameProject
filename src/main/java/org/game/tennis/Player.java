/**
 * Created by ruken on 7/14/17.
 */
package org.game.tennis;

public class Player{

    int score = 0;
    String name;

    public Player(String name){
        this.name = name;

    }

    public void setScore(int point){
        score = score + point;
    }


    public int getScore(){
        return score;
    }


    public String getName(){
        return name;
    }

}
