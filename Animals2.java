/*
 * 2. create an Abstract class Animals with color, breed and name as variables,
      along with eat() abstract method and also a speak() method which is not abstract.
 */

/**
 *
 * @author Nazim
 */
public abstract class  Animals2 {
  public static String color="Black"; 
  public static String breed="Cat";
   public abstract void eat();
   public  void speak(){
   System.out.println("Animal Speaking");
   }
}
