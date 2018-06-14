/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;
/**
 *
 * 
 */
public class GloryElement {
    
    private static String finalWord;
    private static int finalWordLength;
    private int finalScore=0;

    
    public void setFinalWord(String finalWord) {
        this.finalWord = finalWord;
    }

    
    public void setFinalWordLength() {
        this.finalWordLength = getFinalWord().length();
    }
    
    
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
    
    
    
    
    
}