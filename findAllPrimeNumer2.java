/*
Q2.3  Take a Number N from the user as input and find all prime numbers upto N?
 */
package nazimacadviw;

import java.util.Scanner;

/**
 *
 * @author Nazim
 */
public class findAllPrimeNumer2
{
    public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();
     // scanner.close();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to"+ n +"are :");
      System.out.println(primeNumbers);
   }
    
}
