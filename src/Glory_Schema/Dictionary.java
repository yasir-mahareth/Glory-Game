/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 
 */
public class Dictionary{
    String finalWord;
    static String validity; 
    
    public Dictionary(String word,String key){
        
       
        this.finalWord=word;
        //reading wordlist and writing it to an ArrayList
        BufferedReader in = null;

        ArrayList<String> dictionary = new ArrayList<String>(75000);//wordlist has max 70000words

        try {
            in = new BufferedReader(new FileReader("C:\\Users\\Yaas\\Desktop\\wordlist.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                dictionary.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
    //            in.close();
            }
        }
        if(key.equals("manual")){
            manualSearch(dictionary,finalWord);
        }
        if(key.equals("automatic")){
            autoSearch(dictionary,finalWord);
        }    
            
    }
    //finding all the possible longest words
    private static ArrayList<String>LongestWords(List <String> dictionary,String myString){

        ArrayList<String> longestWords = new ArrayList<>();
        String firstLongestWord =findLongestString(dictionary,myString);
        int i=0;
        for (String word:dictionary) {

            if ((word.length()==firstLongestWord.length()) && isSubsequance(word,myString)){
                longestWords.add(i,word);
                i++;
            }
        }

        return longestWords;
    }
    
      // Returns true if word is a subsequence of myString
    static boolean isSubsequance(String word, String myString) {


        int m = word.length();
        int n = myString.length();
        int j = 0;//index for str1(subsequance)

    //checking all the characters in str1 are in the str2(User entered string)
        for (int i = 0; i < n && j < m; i++) {
            if (word.charAt(j) == myString.charAt(i))
                j++;
        }
        return (j == m);
    }

    //finding the first longest word
    private static String findLongestString(List<String> dictionary, String myString) {

        String result = " ";
        int length = 0;

      //traversing through the dictionary
        for (String word : dictionary) {
            if (length < word.length() && isSubsequance(word, myString)) {
                result = word;
                length = word.length();
            }
        }
        return result;
    }

     //checking entered word is correct or not/applies for manual search
     private static boolean correctWord(List<String>dictionary,String myString) {

        boolean condition = false;

        for (String word : dictionary) {
            if (isSubsequance(word, myString) && (word.length()==myString.length())) {
                condition = true;
                break;
            }
            else {
                condition = false;
            }
        }
        return condition;
    }

    
     
       //check whether correct word or existing in the wordlist
     public static void manualSearch(List dictionary, String myString) {

        // ArrayList<String> longestWords = LongestWords(dictionary, myString);
             boolean returnCondition = correctWord(dictionary, myString);
             if (returnCondition) {
                 validity="valid";
                 System.out.println("Valid word in Dictionary");
             } else {
                 validity="invalid";
                 System.out.println("incorrect word in Dictionary");
             }
     }
     
      //printing out all the longest words from auto search
     public static void autoSearch(List dictionary, String myString) {

             System.out.println("Possible longest words are");
             ArrayList<String>longestWords=LongestWords(dictionary,myString);

             for (int j = 0; j < longestWords.size(); j++) {

                 System.out.println(longestWords.get(j));

             }
     }

     
     public String getValidity(){
         return validity;
     }
    
}
