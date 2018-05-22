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
public class VariableElement extends GloryElement{
    //create an instance of this class to create a variable and use it's setter and getter methods to set and retrieve it's value
    private String variableName;
    private int variableValue;
    
    public VariableElement(String name,int value){
        this.variableName=name;
        this.variableValue=value;
    }
    
    public String getVariableName(){
        return variableName;
    }
    public void setVariableValue(int value){
        this.variableValue=value;
    }
    public int getVariableValue(){
        return variableValue;
    }
    
}
