
/**
 *1. Create an Interface called Animals with speak0,eato methods 
 * Create two classes Cat andDoe implementing their own versions of these methods.
 * @author Nazim
 */
public class Cat implements Animals{
    public void eat(){
    System.out.println("Cat is Eating.");
    }
  
    public void speak() {
    System.out.println("Cat is Speaking");
    }
    public static void main(String[] args){
    Cat ob=new Cat();
    ob.eat();
    ob.speak();
    }   
    

}
