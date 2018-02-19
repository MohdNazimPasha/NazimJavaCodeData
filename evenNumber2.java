/*
Q2.2 take the number N from the user as input and find all even Numbers upto N?
 */
package nazimacadviw;
import java.util.*;

/**
 *
 * @author Nazim
 */
public class evenNumber2 {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
         int num;
         System.out.println("Enter Number Find all even Number:");
         num=sc.nextInt();
        for(int i=0;i<=num;i++){
            if(i%2==0)
                System.out.print(i+" ");
        
        }
        
       
    }

    
}
