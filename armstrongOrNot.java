/*
Q2.4 given number Armstrong or not ?
 */
package nazimacadviw;

import java.util.Scanner;

/**
 *
 * @author Nazim
 */
public class armstrongOrNot {
     public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num,armstrong=0,r;
    System.out.println("Enter number find Armstrong or Not:");
    num=sc.nextInt();
    int temp=num;
    int a=num%10;
    while(num>0)
            {
                r=num % 10;
                armstrong=(int) (armstrong+ Math.pow(r, a));
                num=num/10;
            }
   if(temp==armstrong)
    System.out.println("Number is armstrong");
   else 
       System.out.println("Number Not Armstrong");
    
    }
    
    }
    
