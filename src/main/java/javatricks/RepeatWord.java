/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatricks;

/**
 *
 * @author Rajnish
 */
public class RepeatWord {
    public static void main(String args[]){
         displayWord("LearnWithRajnish",1);
    }
    static  void displayWord(String name,int i){
       if(i==1001)
            return;
       else{
           System.out.println(name);
           displayWord(name,i+1);
    }
    }
    
}
