/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpro;

import java.util.Scanner;

/**
 *
 * @author Rajnish
 */
public class Piglatin {
    public static void main(String args[]){
    
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the word");
       String word=sc.next();
       int beg=0;
       String pword="";
       for(int i=0; i<word.length(); i++){
         
          char ch=word.charAt(i);
           ch=Character.toLowerCase(ch);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               beg=i;
               break;
             }
       }
       
       for(int i=beg; i<word.length(); i++)
          pword=pword+word.charAt(i);                                     // System.out.print(word.charAt(i));
       
        for(int i=0; i<beg; i++)
           pword=pword+word.charAt(i); 
        
       pword=pword+"ay"; 
       
       System.out.print(pword);
    }
}
