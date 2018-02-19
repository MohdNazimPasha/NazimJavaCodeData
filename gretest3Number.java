/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nazimacadviw;
import java.util.*;

/**
 *
 * @author Nazim
 */
public class gretest3Number {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter three Number for Find Biggest Number:");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     if(a>b)
     {
         if(a>c)
             System.out.println("Number is grater:"+a);
         else
             if(b>c)
                 System.out.println("Number is grater:"+b);
             else
                 System.out.println("Number is grater:"+c);
     }
      else
      {
          if(b>c)
                 System.out.println("Number is grater:"+b);
             else
                 System.out.println("Number is grater:"+c);
      }
              
    
    }
}
