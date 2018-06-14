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
public class LetterValueElement extends GloryElement{
    
    private char letterName;
    private int letterValue;
    private String type;
    
    public LetterValueElement(char name,int value, String type){
        this.letterValue=value;
        this.letterName=name;
        this.type=type;
    }
    
    public void setLetterValue(int value){
        this.letterValue=value;
    }

    public char getLetterName() {
        return letterName;
    }
    
    public int getLetterValue(){
        return letterValue;
    }

    public String getType() {
        return type;
    }

    
    
}
