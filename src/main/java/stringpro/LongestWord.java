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
public class LongestWord {
    public static void main(String args[]){
    
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string:");
         String sen=sc.nextLine();
         
         sen=sen+" ";
         String word="",lg="";
         for(int i=0; i<sen.length(); i++){
             char ch=sen.charAt(i);
             
             if(ch !=' '){
                word=word+ch;  //
             }
             else{
                    if(word.length()>lg.length())
                        lg=word;
                    
                    word="";
           }
         }
         System.out.println("Longest word:"+lg);
    }
}
