/*
 Q5.Write a java program to check occurrance of a string in another string 
where both strings are taken as input from the user.
 */
package assigment;

import java.util.Scanner;

/**
 *
 * @author Nazim
 */
public class Assigment{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Please Enter First String:");
      String S1=sc.nextLine();
      System.out.println("Please Enter Second String:");
      String S2=sc.nextLine();
      int c=S1.compareToIgnoreCase(S2);
      System.out.println(c);

    }
    
}
