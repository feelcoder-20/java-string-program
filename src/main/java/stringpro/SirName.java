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
public class SirName {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name:");
      String name=sc.nextLine();
      String word="";
      for(int i=0; i<name.length(); i++){
         char ch=name.charAt(i);
         if(ch!=' '){
           word=word+ch;
         }
         else{
             System.out.print(word.charAt(0)+".");
             word="";
         }
      }
      System.out.print(word);
    }
    
}
