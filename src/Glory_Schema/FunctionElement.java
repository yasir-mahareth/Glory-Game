/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;

import java.util.ArrayList;
import java.util.Random;


public class FunctionElement extends GloryElement{

    ArrayList<LetterValueElement> valueList= new ArrayList<LetterValueElement>();
    char[] letterContainer= new char[11];
    String[] lContainer= new String[11];
    char vowelLetter;
    char consonantLetter;
       
    int rarenessScore=0;
    int rewardScore=0;
    int wordLengthScore=0;
    int RoundScore=0;
    String key1,key2;
    String validityDL;
    
// generate Score  
    public void generateScore(String validityDictionary, String validityGivenWords){
        
        
        key1= validityDictionary;
        key2=validityGivenWords;
        
        if(key1.equals("valid") && key2.equals("valid")){
            rarenessValueBank();
            splitWord(getFinalWord());
            System.out.println(getFinalWord());
            rarenessScore = getRarenessScore(getFinalWord()); 
     
            RewardElement rewardObject= new RewardElement();
            rewardScore= rewardObject.getRewardValue();    
    
            WordElement wordObject = new WordElement();
            wordLengthScore= wordObject.getWordElementValue();
        }
        else{
            rarenessScore=0;
            rewardScore=0;
            wordLengthScore=0;
        }
    
    //Final Score
        
        setRoundScore(rarenessScore+rewardScore+wordLengthScore);
        this.RoundScore=getRoundScore();
      
    }
    
    
    public String checkValidityWithDisplayedLetters(ArrayList<String> arrayList){
        
        
        
            ArrayList<String> wordLetters= new ArrayList<String>();
        wordLetters.clear();
    
        
        for(int i=0; i<getFinalWordLength(); i++){
            wordLetters.add(i,String.valueOf(getFinalWord().charAt(i)));
        }
        
        for(int i=0; i<wordLetters.size(); i++){
            String letter =wordLetters.get(i);
            this.validityDL= "invalid";
            
            for(int j=0;j<arrayList.size();j++){
                
                if(letter.equals(arrayList.get(j))){
                    
                    this.validityDL= "valid";
                    
                    arrayList.remove(j);
                    break;
                }
            }
            if(validityDL=="invalid"){
                
                break;
            }
            
        }
        
        
        System.out.println(validityDL+" with given letters");
        return validityDL;
    }
    
    
    public int getRarenessScore(String word){
        for(int x=0;x<letterContainer.length;x++){
            char letterCharArray=letterContainer[x];
            for(int i=0; i<valueList.size();i++){
                char letterArrayList=valueList.get(i).getLetterName();
                
                if(letterCharArray==letterArrayList){
                    rarenessScore+=valueList.get(i).getLetterValue();
                    break;
                }
                
            }
        }
        return rarenessScore;
    }
    
//Split the world into letters   
    public void splitWord(String word){
        for(int i=0; i<getFinalWordLength(); i++){
            letterContainer[i]=word.charAt(i);
        }
    } 
    
//generate a vowel    
    public char generateVowel(){    
        String type;
        
        
        rarenessValueBank();
        Random random = new Random();
        int number= random.nextInt(26);
        type=valueList.get(number).getType();
        
        if(type=="vowel"){
            this.vowelLetter=valueList.get(number).getLetterName();
        }
        else{
            while(type=="consonant"){
                number= random.nextInt(26);
                type=valueList.get(number).getType();

                if(type=="vowel"){
                this.vowelLetter=valueList.get(number).getLetterName();
                type="vowel";
                
                }
            }
        }
        
      return vowelLetter;  
        
    }
   
//generate a consonant
    public char generateConsonant(){
        String type;
        
        rarenessValueBank();
        Random random = new Random();
        int number= random.nextInt(26);
        type=valueList.get(number).getType();
        
        if(type=="consonant"){
            this.consonantLetter=valueList.get(number).getLetterName();
        }
        else{
            while(type=="vowel"){
                number= random.nextInt(26);
                type=valueList.get(number).getType();

                if(type=="consonant"){
                this.consonantLetter=valueList.get(number).getLetterName();
                type="consonant";
                
                }
            }
        }
        
      return consonantLetter;  
    }
    
// Rareness value bank    
    public void rarenessValueBank(){
   
        
        LetterValueElement a = new LetterValueElement('a',1,"vowel");
        LetterValueElement b = new LetterValueElement('b',3,"consonant");
        LetterValueElement c = new LetterValueElement('c',3,"consonant");
        LetterValueElement d = new LetterValueElement('d',2,"consonant");
        LetterValueElement e = new LetterValueElement('e',1,"vowel");
        LetterValueElement f = new LetterValueElement('f',4,"consonant");
        LetterValueElement g = new LetterValueElement('g',2,"consonant");
        LetterValueElement h = new LetterValueElement('h',4,"consonant");
        LetterValueElement i = new LetterValueElement('i',1,"vowel");
        LetterValueElement j = new LetterValueElement('j',8,"consonant");
        LetterValueElement k = new LetterValueElement('k',5,"consonant");
        LetterValueElement l = new LetterValueElement('l',1,"consonant");
        LetterValueElement m = new LetterValueElement('m',3,"consonant");
        LetterValueElement n = new LetterValueElement('n',1,"consonant");
        LetterValueElement o = new LetterValueElement('o',1,"vowel");
        LetterValueElement p = new LetterValueElement('p',3,"consonant");
        LetterValueElement q = new LetterValueElement('q',10,"consonant");
        LetterValueElement r = new LetterValueElement('r',1,"consonant");
        LetterValueElement s = new LetterValueElement('s',1,"consonant");
        LetterValueElement t = new LetterValueElement('t',1,"consonant");
        LetterValueElement u = new LetterValueElement('u',1,"vowel");
        LetterValueElement v = new LetterValueElement('v',4,"consonant");
        LetterValueElement w = new LetterValueElement('w',4,"consonant");
        LetterValueElement x = new LetterValueElement('x',8,"consonant");
        LetterValueElement y = new LetterValueElement('y',4,"consonant");
        LetterValueElement z = new LetterValueElement('z',10,"consonant");
        
        valueList.add(0,a);
        valueList.add(1,b);
        valueList.add(2,c);
        valueList.add(3,d);
        valueList.add(4,e);
        valueList.add(5,f);
        valueList.add(6,g);
        valueList.add(7,h);
        valueList.add(8,i);
        valueList.add(9,j);
        valueList.add(10,k);
        valueList.add(11,l);
        valueList.add(12,m);
        valueList.add(13,n);
        valueList.add(14,o);
        valueList.add(15,p);
        valueList.add(16,q);
        valueList.add(17,r);
        valueList.add(18,s);
        valueList.add(19,t);
        valueList.add(20,u);
        valueList.add(21,v);
        valueList.add(22,w);
        valueList.add(23,x);
        valueList.add(24,y);
        valueList.add(25,z);
    }
    
    
    
}
