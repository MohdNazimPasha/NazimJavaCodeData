//Q5,Create a generic print function that can print all types of arrays(premitive  type)
package assig15m;

/**
 *
 * @author Nazim
 */
public class Gen<T>
{
    T ob;
    Gen(T o){
    ob=o;
    }
    T getob(){
    return ob;
    }
    void show(){
    System.out.println(getob());
    System.out.println("Type of T is:"+ob.getClass().getName());
    }
    public static void main(String[] arg){
    Gen g1=new Gen(3);
    g1.show();
    Gen float1=new Gen(6.1f);
    float1.show();
    Gen string =new Gen("Hello Nazim");
    string.show();
    
    }
}
