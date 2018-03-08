/*
 *Q3.write a java program remove vowel given string.
 */
package assigment28feb;

import java.util.Scanner;

/**
 *
 * @author Nazim
 */
public class RemoveVovel {
    public static void main(String[] args) {
     System.out.println("Please Enter String to Remove Vowel:");
     Scanner sc = new Scanner(System.in);
     String string=sc.nextLine();
     String result=string.replaceAll("[aeiouAEIOU]","");
     System.out.print(result);
   
             
    } 
}
