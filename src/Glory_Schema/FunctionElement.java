/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_Schema;

import java.util.ArrayList;

/**
 *
 * 
 */
public class FunctionElement extends GloryElement{

    ArrayList<LetterValueElement> valueList= new ArrayList<LetterValueElement>();
    char[] letterContainer= new char[11];
    int rarenessScore=0;
    
    public FunctionElement() {
        
        rarenessValueBank();
        splitWord(getFinalWord());
        int score = getRarenessScore(getFinalWord());
        System.out.println(score);
        
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
    
    
    public void splitWord(String word){
        for(int i=0; i<getFinalWordLength(); i++){
            letterContainer[i]=word.charAt(i);
        }
    } 
    
    public void rarenessValueBank(){
   //     ArrayList<LetterValueElement> valueList= new ArrayList<LetterValueElement>();
        
        LetterValueElement a = new LetterValueElement('a',1);
        LetterValueElement b = new LetterValueElement('b',3);
        LetterValueElement c = new LetterValueElement('c',3);
        LetterValueElement d = new LetterValueElement('d',2);
        LetterValueElement e = new LetterValueElement('e',1);
        LetterValueElement f = new LetterValueElement('f',4);
        LetterValueElement g = new LetterValueElement('g',2);
        LetterValueElement h = new LetterValueElement('h',4);
        LetterValueElement i = new LetterValueElement('i',1);
        LetterValueElement j = new LetterValueElement('j',8);
        LetterValueElement k = new LetterValueElement('k',5);
        LetterValueElement l = new LetterValueElement('l',1);
        LetterValueElement m = new LetterValueElement('m',3);
        LetterValueElement n = new LetterValueElement('n',1);
        LetterValueElement o = new LetterValueElement('o',1);
        LetterValueElement p = new LetterValueElement('p',3);
        LetterValueElement q = new LetterValueElement('q',10);
        LetterValueElement r = new LetterValueElement('r',1);
        LetterValueElement s = new LetterValueElement('s',1);
        LetterValueElement t = new LetterValueElement('t',1);
        LetterValueElement u = new LetterValueElement('u',1);
        LetterValueElement v = new LetterValueElement('v',4);
        LetterValueElement w = new LetterValueElement('w',4);
        LetterValueElement x = new LetterValueElement('x',8);
        LetterValueElement y = new LetterValueElement('y',4);
        LetterValueElement z = new LetterValueElement('z',10);
        
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
