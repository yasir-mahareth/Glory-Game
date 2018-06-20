/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glory.game.server;

import java.io.Serializable;




public class ScoreDetails implements Serializable {
    private String playerName;
    private int round;
    private int rarenessScore;
    private int rewardScore;
    private int wordLengthScore;
    private int finalScore;
    
    
    public ScoreDetails(String name, int round, int rareness, int reward, int word, int finalScore){
        this.playerName=name;
        this.round=round;
        this.rarenessScore=rareness;
        this.rewardScore=reward;
        this.wordLengthScore=word;
        this.finalScore=finalScore;
    }

    public int getRound() {
        return round;
    }

    public String getPlayerName() {
        return playerName;
    }
   

    public int getRarenessScore() {
        return rarenessScore;
    }

    public int getRewardScore() {
        return rewardScore;
    }

    public int getWordLengthScore() {
        return wordLengthScore;
    }

    public int getFinalScore() {
        return finalScore;
    }
    
}
