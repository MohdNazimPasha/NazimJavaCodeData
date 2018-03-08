/*
 Q3.Take two numbers as string input and convert them into Integers
and find the maximum of two number.
 */

/**
 *
 * @author Nazim
 */
public class Assigment3 {
    public static void main(String[] args){
    String s1="22";
    String s2="33";
    int x=Integer.parseInt(s1);
    if((Integer.parseInt(s1))>(Integer.parseInt(s2)))
        System.out.println("Maximum Number is:"+(Integer.parseInt(s1)));
    else
        System.out.println("Maximum Number is:"+(Integer.parseInt(s2)));  
    }
    
}
