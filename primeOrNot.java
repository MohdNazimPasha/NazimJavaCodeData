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
public class primeOrNot {
    public static void main(String args[]){
  
Scanner sc=new Scanner(System.in);     
  int i,m=0,flag=0;      
  int n;
  System.out.println("Enter Number:");
  n=sc.nextInt();
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}      
    
}