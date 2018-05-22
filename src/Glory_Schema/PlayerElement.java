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
public class PlayerElement extends GloryElement{
    private final String playerName;
    private final int playerID;
    
    public PlayerElement(String name,int id){
        this.playerName=name;
        this.playerID=id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerID() {
        return playerID;
    }
    
}
