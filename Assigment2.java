
import java.util.*;

/**
 *
 * @author Nazim
 */
public class Assigment2 extends Animals2 {
      public  void speak(){
   System.out.println("Animal Speaking");}
  public void   eat(){
  System.out.println("Dog is eating");
  }
   public static void main(String[] args){
       Dog ob = new Dog();
        System.out.println(Animals2.color);
        System.out.println(Animals2.breed);
       ob.eat();
       ob.speak();
   } 
}
