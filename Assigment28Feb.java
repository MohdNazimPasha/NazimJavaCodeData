//Q1 Write a java program to reverse a String.
package assigment28feb;

import java.util.Scanner;

/**
 *
 * @author Nazim
 */

public class Assigment28Feb {
    public static void main(String[] args) {
     System.out.println("Please Enter String To Reverse:");
     Scanner sc = new Scanner(System.in);
     String string=sc.nextLine();
     String reverse="";
     for(int i=string.length()-1;i>=0;i--)
         reverse=reverse+string.charAt(i);
     System.out.println("Reverse String:\n"+reverse);
             
     
    }
    
}
