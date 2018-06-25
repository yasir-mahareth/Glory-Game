/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;

import glory.game.server.ScoreDetails;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
//import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 * This class helps clients to send and retrieve Score details of connected clients 

 * 
 */
public class ServerElement {
    static ArrayList<ScoreDetails> scoreContainerClient;
    ObjectInputStream ois;
    BufferedReader input;
    PrintWriter output;
    
    
    Object[] row;
    
    public ServerElement(){
        
    }
    
    public ServerElement(String playerName,int round, int rarenessScore, int rewardScore, int wordLengthScore, int finalScore){
        
        
        try(Socket socket= new Socket("localhost",5000)){
        
            //input, output reader 
            input= new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
            
            output = new PrintWriter(socket.getOutputStream(),true);
                  
            ois = new ObjectInputStream(socket.getInputStream());
            output.println("score");
            
                output.println(playerName);
                output.println(round);
                output.println(rarenessScore);
                output.println(rewardScore);
                output.println(wordLengthScore);
                output.println(finalScore);
            
            scoreContainerClient = new ArrayList<ScoreDetails>();
            
            
            try{
                    scoreContainerClient.clear();
                    scoreContainerClient =(ArrayList<ScoreDetails>) ois.readObject();
                                           
                                              
            }
            catch (ClassNotFoundException e) {
                    System.out.println("The scoreContainer data has not arrived from the server");
                    e.printStackTrace();
            }    
             
            
           
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public ArrayList<ScoreDetails> getScoreContainer(){
        return scoreContainerClient;
    }
    
    
}