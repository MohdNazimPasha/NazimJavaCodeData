/*
 * Q6. write a java program to count the number of words in a sentence taken as input.
 */
package assigment28feb;

import java.util.Scanner;

/**
 *
 * @author Nazim
 */
public class countWord {
  public static void main(String[] args) {
     System.out.println("Please Enter String To Reverse:");
     Scanner sc = new Scanner(System.in);
     String string=sc.nextLine();
     
		int count = 1;
 
		for (int i = 0; i < string.length() - 1; i++)
		{
			if ((string.charAt(i) == ' ') && (string.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a sentence = " + count);
	}
    
    
}
