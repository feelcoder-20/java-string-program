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
public class CountPalin {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the sentence/string:");
       String name=sc.nextLine();
       
       name=name+" ";
       String word="";
       String rev="";
       int count=0;
       for(int i=0;i<name.length();i++){
       
          char ch=name.charAt(i);
          if(ch!=' '){
              // word concatenation
              word=word+ch;
              rev=ch+rev;
          }
          else{
             if(word.equalsIgnoreCase(rev))
                 count++;
             
             word="";
             rev="";
          }
       }
       System.out.println("Total palindrome word/s:"+count);
       
    }
    
}
