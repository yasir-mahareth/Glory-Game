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
public class RewardElement extends GloryElement{
    private int rewardValue;
    
    public RewardElement(int value){
        this.rewardValue=value;
    }
    public void setRewardValue(int value){
        this.rewardValue=value;
    }
    public int getRewardValue(){
        return rewardValue;
    }
}
