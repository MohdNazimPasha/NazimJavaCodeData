/*
 Q4.Write a java program print the following Pattern.
a
ab
abc
 */
package assigment28feb;

/**
 *
 * @author Nazim
 */
public class patern {
    public static void main(String[] args)
    {
     
   for(int i=0;i<4;i++)
   {
   int alphabet=97;
   for(int j=1;j<=i;j++){
   System.out.print((char)alphabet);
   alphabet++;
   }
   System.out.println();
   
   }
}
}
