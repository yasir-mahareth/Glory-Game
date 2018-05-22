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
    char[] letterContainer= new char[11];
    
    
    public void splitWord(String word){
        for(int i=0; i<getFinalWordLength(); i++){
            letterContainer[i]=word.charAt(i);
        }
    } 
    
}
