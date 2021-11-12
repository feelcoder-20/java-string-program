/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpro;

import java.util.Scanner;


public class SenReverse {
    public static void main(String args[]){
    
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the sentence:");
      String sen=sc.nextLine();
      sen=sen+" ";
      String revsen="",word="";
      for(int i=0; i<sen.length();  i++){
         char ch=sen.charAt(i);
         if(ch!=' '){
            word=word+ch;  // word conc....
         }
         else{
            revsen=word+" "+revsen;
            word="";
         
         }
      }
      System.out.println(revsen);
    }
}
