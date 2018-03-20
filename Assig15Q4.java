/*
 * Q4.Create a generic shorting function that can short any type of array(primitive types).
 */
package assig15m;

/**
 *
 * @author Nazim
 */
public class Assig15Q4 {
public static <E> void display (E[] arr){
    for(E elements : arr)
    {
    System.out.print(elements+" ");
    }
    System.out.println();
}
public static void main(String [] arrg){
Integer [] num={1,2,3,4,5,6,7,8,9};
Double [] dnum={1.1,1.2,1.3,1.4,1.5,1.6};
String []s={"N","A","Z","I","M"};
display(num);
display(dnum);
display(s);
}
}
