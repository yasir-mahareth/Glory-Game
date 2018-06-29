/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;

import glory.game.server.InitialLetterDetails;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Yaas
 */
public class NameElements {
    BufferedReader input;
    PrintWriter output;
    ObjectInputStream ois;
    static ArrayList<String> nameContainerClient ;
    
    public NameElements(){
        
    }
    
    public NameElements(String player){
        try(Socket socket= new Socket("localhost",5000)){
        
            //input, output reader 
            input= new BufferedReader(
            new InputStreamReader(socket.getInputStream()));            
            output = new PrintWriter(socket.getOutputStream(),true);                  
            ois = new ObjectInputStream(socket.getInputStream());
            
            output.println("player names");
                        
            output.println(player);
            
                         
            nameContainerClient = new ArrayList<String>();

            try{
                    nameContainerClient.clear();
                    nameContainerClient =(ArrayList<String>)ois.readObject();
                                                                                 
            }
            catch (ClassNotFoundException e) {
                    System.out.println("The name elements have not arrived from the server");
                    e.printStackTrace();
            } 
            catch(EOFException e){
                System.out.println("Please check the database connection");
            }
             
          
           
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
