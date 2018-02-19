/*
 Q5.write a program given number Leap Year or not.
 */
package nazimacadviw;
import java.util.Scanner;
/**
 *
 * @author Nazim
 */
public class leapYear {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
    int year;
    System.out.println("Please enter Number to cheack");
 year=sc.nextInt();
    if( year % 4 == 0 ){
          if(year % 100 == 0 ){
             if( year % 400 == 0)
                 System.out.println("Number is Leap year");
             else
                 System.out.println("Not a Leap Year");
          }
          else
          System.out.println("Number is leap Year");
        
    }
    else
    System.out.println("Not a Leap Year");
    }
    
}
