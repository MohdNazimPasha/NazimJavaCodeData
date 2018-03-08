/*
 * Q2. Write a java Program to generate Substrings of the String."xyz"
 */
package assigment28feb;


/**
 *
 * @author Nazim
 */
public class SubString {
   public static void main(String args[])throws Exception
   {
      String string="XYZ";
      
      System.out.println("Substrings of \""+string+"\" are:");
 
      for (int i = 0; i <  string.length(); i++)
      {
         for(int j = 1; j <=  string.length() - i; j++)
         {
              
            System.out.print(string.substring(j-1, i+j)+" ");
         }
      }
   } 
             
    
}
