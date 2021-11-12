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
public class StringRev {
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        
        String rev="";
        for(int i=word.length()-1; i>=0; i--){
                char ch=word.charAt(i);
               rev=rev+ch;
         }
        System.out.println(rev);
    }
    
}
