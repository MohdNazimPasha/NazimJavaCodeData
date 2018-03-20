
package assig15m;

/**
 *
 * @author Nazim
 */
public class Display {
public  synchronized void display() throws InterruptedException{
  for(int i=1;i<=500;i++)
    {
        System.out.println(i);
    }
    } 
public  synchronized void displays() throws InterruptedException{
  for(int i=501;i<=1000;i++)
    {
        System.out.println(i);
            }
    }  
    
}
