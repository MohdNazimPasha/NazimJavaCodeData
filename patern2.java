/*
 Q2.1 write a java program to print the following patern.
*****
****
***
**
*

 */
package nazimacadviw;

/**
 *
 * @author Nazim
 */
public class patern2 {
    public static void main(String []args){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++)
            {
                if(i<j)
              System.out.print("*") ; 
            }
            System.out.println();
        }
    }
    
}
