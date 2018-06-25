/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;


import glory.game.server.InitialLetterDetails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/* This class helps clients to send and retrieve Initial Letters of connected clients 
*/
public class InitialLetters {
    BufferedReader input;
    PrintWriter output;
    ObjectInputStream ois;
    static ArrayList<InitialLetterDetails> initialLettersContainerClient ;
    
    public InitialLetters(){
        
    }
    
    public InitialLetters(String in_Letters,int round,String name ){
        try(Socket socket= new Socket("localhost",5000)){
        
            //input, output reader 
            input= new BufferedReader(
            new InputStreamReader(socket.getInputStream()));            
            output = new PrintWriter(socket.getOutputStream(),true);                  
            ois = new ObjectInputStream(socket.getInputStream());
            
            output.println("initial letters");
                        
            output.println(name);
            output.println(round);
            output.println(in_Letters);
                
            
            initialLettersContainerClient = new ArrayList<InitialLetterDetails>();
            
            
           try{
                    initialLettersContainerClient.clear();
                    initialLettersContainerClient =(ArrayList<InitialLetterDetails>)ois.readObject();
                                                                                 
            }
            catch (ClassNotFoundException e) {
                    System.out.println("The initialLetterContainer elements have not arrived from the server");
                    e.printStackTrace();
            }    
             
          
           
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
