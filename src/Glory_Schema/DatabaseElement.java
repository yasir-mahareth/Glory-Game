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
public class DatabaseElement extends GloryElement{
    private final String databaseName;
    
    public DatabaseElement(String name){
        this.databaseName=name;
    }
    
    public String getDatabaseName(){
        return databaseName;
    }
    
}
