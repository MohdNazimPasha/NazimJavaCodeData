/*
 Q.7 Given Number palindrom or Not?
 */
package nazimacadviw;
import java.util.*;
/**
 *
 * @author Nazim
 */
public class palindromOrNot {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,temp,r;
    System.out.println("Enter number find Palindrom or Not:");
    num=sc.nextInt();
    temp=num;
    while(num>0)
            {
                r=num % 10;
                sum=(sum*10)+r;
                num=num/10;
            }
   
    if(temp==sum)
        System.out.println("No is Palindrom");
    else 
        System.out.print("Number is Not Palindrom");
    
    }
    
}
