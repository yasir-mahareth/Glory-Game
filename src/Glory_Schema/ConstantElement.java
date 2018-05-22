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
public class ConstantElement extends GloryElement{
    //create an instance of this class to create a constant and use it's getter method to retrieve it's value
    private final int constantValue;
    
    
    public ConstantElement(int value){
        this.constantValue=value;
    }
    public int getConstantValue(){
        return constantValue;
    }
}
