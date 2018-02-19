/*Q7
 Q.2.5  Find reverse Given Number?
 */
package nazimacadviw;
import java.util.*;
/**
 *
 * @author Nazim
 */
public class reverseNumber {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num,rev=0,r;
    System.out.println("Enter number find Reverse:");
    num=sc.nextInt();
    
    while(num>0)
            {
                r=num % 10;
                rev=(rev*10)+r;
                num=num/10;
            }
   
    System.out.println(rev);
    
    }
    
}
