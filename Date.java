/*
 *Q3. The class Date_DDMMYY inputs a Date in ddmmyyyy 8-digit format and prints it in dd/mm/yyyy format
 */
package assig15m;

/**
 *
 * @author Nazim
 */


 
import java.io.*;
import java.util.Scanner;
class Date
{   
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        int l, y, d, m;
        String dd, mm, yy;
 
        //array storing the maximum days of every month
        int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
 
        //array storing the month names
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", "December" };
 
        System.out.print("Enter any date in 8 digits (dd/mm/yyyy) format: ");
        String date = sc.nextLine(); //inputting the date in String format
 
        l = date.length(); //finding number of digits in the given input
 
        if(l==10) //cheaking number of digits is 10
        {
            dd = date.substring(0,2); // day in String format
            mm = date.substring(3,5); //month in String format
            yy = date.substring(6); //year in String format
            //string into integer type casting.
            d = Integer.parseInt(dd); 
            m = Integer.parseInt(mm); 
            y = Integer.parseInt(yy); 
 
            if(y%4==0) // condition for leap year
            {
                maxdays[2]=29;
            }
             
            //cheaking input valid or not?
            if(m<0 || m>12 || d<0 || d>maxdays[m] || y<0 || y>9999) // Performing Date Validation
            {
            System.out.println("The day, month or year are outside acceptable limit");
            }
 
            else
            {
                /* First Part */
                System.out.println("Date in dd/mm/yyyy format = "+dd+"/"+mm+"/"+yy);
                              
                /* Second Part */
                System.out.print("Date in dd, month name, yyyy format = "+dd+", "+month[m]+", "+yy);
            }
        }
 
        else
            System.out.println("Wrong Input");
    }
}