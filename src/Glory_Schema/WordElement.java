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
public class WordElement extends GloryElement{
    private int wordLengthValue;
    
    public WordElement( ){
      wordLengthValue=getFinalWordLength()*5;
        
    }
    
   public int getWordElementValue(){
        return wordLengthValue;
    } 
}
