/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;
import glory.game.*;
/**
 *
 * 
 */
public class GloryElement {
    
    private String finalWord="oxygenizing";
    private int finalWordLength=finalWord.length();
    private int finalScore=0;

    public String getFinalWord() {
        return finalWord;
    }

    public int getFinalWordLength() {
        return finalWordLength;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
    
    
    public boolean checkValiity(String word){
        // insert code for checking validity with reference to a dictionary
        boolean validity=true;
                
        if (validity==true && finalWordLength<=11){
            return true;
        }
        else
            return false;
    }
    
    
}