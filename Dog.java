

/**
 *1. Create an Interface called Animals with speak(),eat() methods 
 * Create two classes Cat andDoe implementing their own versions of these methods.
 * @author Nazim
 */
public class Dog implements Animals {

    
  public void   speak(){
  System.out.println("Dog is speaking");
  }
  public void   eat(){
  System.out.println("Dog is eating");
  }
   public static void main(String[] args){
       Dog ob = new Dog();
        System.out.println("");
       ob.eat();
       ob.speak();
   } 
}
